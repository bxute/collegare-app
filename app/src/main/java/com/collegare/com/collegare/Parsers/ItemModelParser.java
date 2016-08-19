import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import org.json.JSONArray;

class ItemModelParser {

		ThumbnailModelParser thumbnail_parser = new ThumbnailModelParser();
		StatuModelParser statu_parser = new StatuModelParser();
		ContentModelParser content_parser = new ContentModelParser();
		PlayerModelParser player_parser = new PlayerModelParser();
		AccesspiModelParser accesspi_parser = new AccesspiModelParser();

		public ItemModelParser() {
		}

		public ItemModel parseItemModel(String json_object) {

			ItemModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					ThumbnailModel thumbnail = thumbnail_parser.parseThumbnailModel(jsobj.getJSONObject("thumbnail").toString());

					StatuModel statu = statu_parser.parseStatuModel(jsobj.getJSONObject("statu").toString());

					ContentModel content = content_parser.parseContentModel(jsobj.getJSONObject("content").toString());

					PlayerModel player = player_parser.parsePlayerModel(jsobj.getJSONObject("player").toString());

					AccesspiModel accesspi = accesspi_parser.parseAccesspiModel(jsobj.getJSONObject("accesspi").toString()); 

					ArrayList<String> tags = new ArrayList<>();
					JSONArray tags_arr = jsobj.getJSONArray("tags");
			
					for(int i = 0 ;i<tags_arr.length();i++){

 						tags.add((String)tags_arr.get(i)));

					}

					local_model = new ItemModel(jsobj.getInt("favoriteCount") , jsobj.getString("aspectRatio") , thumbnail, jsobj.getInt("commentCount") , jsobj.getString("id") , jsobj.getString("title") , statu, content, jsobj.getInt("ratingCount") , jsobj.getString("updated") , jsobj.getString("uploader") , jsobj.getInt("duration") , jsobj.getString("description") , player, jsobj.getInt("viewCount") , jsobj.getString("category") , accesspi, tagsjsobj.getString("uploaded") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}