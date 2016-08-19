import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import org.json.JSONArray;

class SoldModelParser {

		ThumbnailModelParser thumbnail_parser = new ThumbnailModelParser();
		StatuModelParser statu_parser = new StatuModelParser();
		AccesspiModelParser accesspi_parser = new AccesspiModelParser();
		ContentModelParser content_parser = new ContentModelParser();
		PlayerModelParser player_parser = new PlayerModelParser();

		public SoldModelParser() {
		}

		public SoldModel parseSoldModel(String json_object) {

			SoldModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					ThumbnailModel thumbnail = thumbnail_parser.parseThumbnailModel(jsobj.getJSONObject("thumbnail").toString());

					StatuModel statu = statu_parser.parseStatuModel(jsobj.getJSONObject("statu").toString()); 

					ArrayList<String> tags = new ArrayList<>();
					JSONArray tags_arr = jsobj.getJSONArray("tags");
			
					for(int i = 0 ;i<tags_arr.length();i++){

 						tags.add((String)tags_arr.get(i)));

					}

					AccesspiModel accesspi = accesspi_parser.parseAccesspiModel(jsobj.getJSONObject("accesspi").toString());

					ContentModel content = content_parser.parseContentModel(jsobj.getJSONObject("content").toString());

					PlayerModel player = player_parser.parsePlayerModel(jsobj.getJSONObject("player").toString());

					local_model = new SoldModel(jsobj.getString("updatedon") , thumbnail, statu, tagsjsobj.getString("updatededon") , jsobj.getString("id") , jsobj.getString("uploadedon") , jsobj.getInt("commentCount") , accesspi, content, player, jsobj.getString("description") , jsobj.getString("uploadedby") , jsobj.getString("title") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}