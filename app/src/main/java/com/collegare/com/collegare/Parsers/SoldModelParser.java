import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import org.json.JSONArray;

class SoldModelParser {

		PlayerModelParser player_parser = new PlayerModelParser();
		StatuModelParser statu_parser = new StatuModelParser();
		ThumbnailModelParser thumbnail_parser = new ThumbnailModelParser();
		ContentModelParser content_parser = new ContentModelParser();
		AccesspiModelParser accesspi_parser = new AccesspiModelParser();

		public SoldModelParser() {
		}

		public SoldModel parseSoldModel(String json_object) {

			SoldModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					PlayerModel player = player_parser.parsePlayerModel(jsobj.getJSONObject("player").toString()); 

					ArrayList<String> tags = new ArrayList<>();
					JSONArray tags_arr = jsobj.getJSONArray("tags");
			
					for(int i = 0 ;i<tags_arr.length();i++){

 						tags.add((String)tags_arr.get(i)));

					}

					StatuModel statu = statu_parser.parseStatuModel(jsobj.getJSONObject("statu").toString());

					ThumbnailModel thumbnail = thumbnail_parser.parseThumbnailModel(jsobj.getJSONObject("thumbnail").toString());

					ContentModel content = content_parser.parseContentModel(jsobj.getJSONObject("content").toString());

					AccesspiModel accesspi = accesspi_parser.parseAccesspiModel(jsobj.getJSONObject("accesspi").toString());

					local_model = new SoldModel(player, jsobj.getInt("commentCount") , jsobj.getString("updatededon") , tagsjsobj.getString("description") , statu, jsobj.getString("uploadedby") , jsobj.getString("uploadedon") , thumbnail, jsobj.getString("title") , content, jsobj.getString("id") , jsobj.getString("updatedon") , accesspi, );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}