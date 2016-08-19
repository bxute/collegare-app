import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import org.json.JSONArray;

class ItemsModelParser {

		ThumbnailModelParser thumbnail_parser = new ThumbnailModelParser();
		PlayerModelParser player_parser = new PlayerModelParser();
		StatusModelParser status_parser = new StatusModelParser();
		ContentModelParser content_parser = new ContentModelParser();
		AccessControlModelParser accessControl_parser = new AccessControlModelParser();

		public ItemsModelParser() {
		}

		public ItemsModel parseItemsModel(String json_object) {

			ItemsModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					ThumbnailModel thumbnail = thumbnail_parser.parseThumbnailModel(jsobj.getJSONObject("thumbnail").toString()); 

					ArrayList<String> tags = new ArrayList<>();
					JSONArray tags_arr = jsobj.getJSONArray("tags");
			
					for(int i = 0 ;i<tags_arr.length();i++){

 						tags.add((String)tags_arr.get(i)));

					}

					PlayerModel player = player_parser.parsePlayerModel(jsobj.getJSONObject("player").toString());

					StatusModel status = status_parser.parseStatusModel(jsobj.getJSONObject("status").toString());

					ContentModel content = content_parser.parseContentModel(jsobj.getJSONObject("content").toString());

					AccessControlModel accessControl = accessControl_parser.parseAccessControlModel(jsobj.getJSONObject("accessControl").toString());

					local_model = new ItemsModel(thumbnail, jsobj.getString("uploaded") , jsobj.getInt("ratingCount") , tagsjsobj.getString("aspectRatio") , jsobj.getString("updated") , jsobj.getString("id") , jsobj.getInt("viewCount") , jsobj.getString("category") , jsobj.getInt("duration") , jsobj.getString("uploader") , jsobj.getInt("favoriteCount") , player, jsobj.getString("title") , jsobj.getInt("commentCount") , status, content, jsobj.getString("description") , accessControl, );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}