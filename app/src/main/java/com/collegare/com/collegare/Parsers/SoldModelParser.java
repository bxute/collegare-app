import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import org.json.JSONArray;

class SoldModelParser {

		ThumbnailModelParser thumbnail_parser = new ThumbnailModelParser();
		AccesspiModelParser accesspi_parser = new AccesspiModelParser();
		PlayerModelParser player_parser = new PlayerModelParser();
		StatuModelParser statu_parser = new StatuModelParser();
		ContentModelParser content_parser = new ContentModelParser();

		public SoldModelParser() {
		}

		public SoldModel parseSoldModel(String json_object) {

			SoldModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					ThumbnailModel thumbnail = thumbnail_parser.parseThumbnailModel(jsobj.getJSONObject("thumbnail").toString());

					AccesspiModel accesspi = accesspi_parser.parseAccesspiModel(jsobj.getJSONObject("accesspi").toString());

					PlayerModel player = player_parser.parsePlayerModel(jsobj.getJSONObject("player").toString()); 

					ArrayList<String> tags = new ArrayList<>();
					JSONArray tags_arr = jsobj.getJSONArray("tags");
			
					for(int i = 0 ;i<tags_arr.length();i++){

 						tags.add((String)tags_arr.get(i)));

					}

					StatuModel statu = statu_parser.parseStatuModel(jsobj.getJSONObject("statu").toString());

					ContentModel content = content_parser.parseContentModel(jsobj.getJSONObject("content").toString());

					local_model = new SoldModel(jsobj.getString("uploadedon") , thumbnail, jsobj.getInt("commentCount") , jsobj.getString("id") , accesspi, jsobj.getString("updatededon") , player, jsobj.getString("updatedon") , jsobj.getString("title") , jsobj.getString("description") , tagsstatu, jsobj.getString("uploadedby") , content, );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}