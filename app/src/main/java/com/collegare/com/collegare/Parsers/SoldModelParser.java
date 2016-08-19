import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import org.json.JSONArray;

class SoldModelParser {

		AccesspiModelParser accesspi_parser = new AccesspiModelParser();
		ContentModelParser content_parser = new ContentModelParser();
		PlayerModelParser player_parser = new PlayerModelParser();
		ThumbnailModelParser thumbnail_parser = new ThumbnailModelParser();
		StatuModelParser statu_parser = new StatuModelParser();

		public SoldModelParser() {
		}

		public SoldModel parseSoldModel(String json_object) {

			SoldModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					AccesspiModel accesspi = accesspi_parser.parseAccesspiModel(jsobj.getJSONObject("accesspi").toString());

					ContentModel content = content_parser.parseContentModel(jsobj.getJSONObject("content").toString());

					PlayerModel player = player_parser.parsePlayerModel(jsobj.getJSONObject("player").toString());

					ThumbnailModel thumbnail = thumbnail_parser.parseThumbnailModel(jsobj.getJSONObject("thumbnail").toString()); 

					ArrayList<String> tags = new ArrayList<>();
					JSONArray tags_arr = jsobj.getJSONArray("tags");
			
					for(int i = 0 ;i<tags_arr.length();i++){

 						tags.add((String)tags_arr.get(i)));

					}

					StatuModel statu = statu_parser.parseStatuModel(jsobj.getJSONObject("statu").toString());

					local_model = new SoldModel(jsobj.getString("id") , accesspi, jsobj.getString("updatededon") , jsobj.getString("uploadedby") , jsobj.getString("title") , content, jsobj.getInt("duration") , player, jsobj.getString("uploadedon") , thumbnail, tagsjsobj.getString("description") , jsobj.getInt("viewCount") , jsobj.getInt("ratingCount") , jsobj.getInt("commentCount") , statu, jsobj.getString("updatedon") , jsobj.getString("aspectRatio") , jsobj.getInt("favoriteCount") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}