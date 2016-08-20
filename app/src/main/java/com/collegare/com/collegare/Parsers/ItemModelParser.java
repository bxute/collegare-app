import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import org.json.JSONArray;

class ItemModelParser {

		ThumbnailModelParser thumbnail_parser = new ThumbnailModelParser();
		ContentModelParser content_parser = new ContentModelParser();
		AccesspiModelParser accesspi_parser = new AccesspiModelParser();
		StatuModelParser statu_parser = new StatuModelParser();
		PlayerModelParser player_parser = new PlayerModelParser();

		public ItemModelParser() {
		}

		public ItemModel parseItemModel(String json_object) {

			ItemModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					ThumbnailModel thumbnail = thumbnail_parser.parseThumbnailModel(jsobj.getJSONObject("thumbnail").toString()); 

					ArrayList<String> tags = new ArrayList<>();
					JSONArray tags_arr = jsobj.getJSONArray("tags");
			
					for(int i = 0 ;i<tags_arr.length();i++){

 						tags.add((String)tags_arr.get(i)));

					}

					ContentModel content = content_parser.parseContentModel(jsobj.getJSONObject("content").toString());

					AccesspiModel accesspi = accesspi_parser.parseAccesspiModel(jsobj.getJSONObject("accesspi").toString());

					StatuModel statu = statu_parser.parseStatuModel(jsobj.getJSONObject("statu").toString());

					PlayerModel player = player_parser.parsePlayerModel(jsobj.getJSONObject("player").toString());

					local_model = new ItemModel(thumbnail, tagscontent, jsobj.getString("description") , jsobj.getString("category") , jsobj.getInt("duration") , jsobj.getInt("startIndex") , accesspi, statu, jsobj.getString("uploader") , jsobj.getInt("favoriteCount") , jsobj.getInt("commentCount") , jsobj.getInt("itemsPerPage") , jsobj.getInt("viewCount") , jsobj.getString("uploaded") , jsobj.getInt("ratingCount") , jsobj.getInt("totalItems") , jsobj.getString("updated") , player, jsobj.getString("aspectRatio") , jsobj.getString("title") , jsobj.getString("id") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}