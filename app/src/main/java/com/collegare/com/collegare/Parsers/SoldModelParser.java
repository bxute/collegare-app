import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import org.json.JSONArray;

class SoldModelParser {

		ThumbnailModelParser thumbnail_parser = new ThumbnailModelParser();
		ContentModelParser content_parser = new ContentModelParser();
		StatuModelParser statu_parser = new StatuModelParser();
		AccesspiModelParser accesspi_parser = new AccesspiModelParser();
		PlayerModelParser player_parser = new PlayerModelParser();

		public SoldModelParser() {
		}

		public SoldModel parseSoldModel(String json_object) {

			SoldModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					ThumbnailModel thumbnail = thumbnail_parser.parseThumbnailModel(jsobj.getJSONObject("thumbnail").toString()); 

					ArrayList<String> tags = new ArrayList<>();
					JSONArray tags_arr = jsobj.getJSONArray("tags");
			
					for(int i = 0 ;i<tags_arr.length();i++){

 						tags.add((String)tags_arr.get(i)));

					}

					ContentModel content = content_parser.parseContentModel(jsobj.getJSONObject("content").toString());

					StatuModel statu = statu_parser.parseStatuModel(jsobj.getJSONObject("statu").toString());

					AccesspiModel accesspi = accesspi_parser.parseAccesspiModel(jsobj.getJSONObject("accesspi").toString());

					PlayerModel player = player_parser.parsePlayerModel(jsobj.getJSONObject("player").toString());

					local_model = new SoldModel(thumbnail, tagscontent, jsobj.getString("id") , jsobj.getString("title") , statu, jsobj.getString("uploadedon") , accesspi, jsobj.getString("updatededon") , jsobj.getString("uploadedby") , jsobj.getString("description") , player, jsobj.getString("updatedon") , jsobj.getInt("commentCount") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}