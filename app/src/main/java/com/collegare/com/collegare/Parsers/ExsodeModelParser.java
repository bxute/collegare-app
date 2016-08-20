import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import org.json.JSONArray;

class ExsodeModelParser {

		StatuModelParser statu_parser = new StatuModelParser();
		ThumbnailModelParser thumbnail_parser = new ThumbnailModelParser();
		ContentModelParser content_parser = new ContentModelParser();
		AccesspiModelParser accesspi_parser = new AccesspiModelParser();
		PlayerModelParser player_parser = new PlayerModelParser();

		public ExsodeModelParser() {
		}

		public ExsodeModel parseExsodeModel(String json_object) {

			ExsodeModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					StatuModel statu = statu_parser.parseStatuModel(jsobj.getJSONObject("statu").toString());

					ThumbnailModel thumbnail = thumbnail_parser.parseThumbnailModel(jsobj.getJSONObject("thumbnail").toString());

					ContentModel content = content_parser.parseContentModel(jsobj.getJSONObject("content").toString());

					AccesspiModel accesspi = accesspi_parser.parseAccesspiModel(jsobj.getJSONObject("accesspi").toString()); 

					ArrayList<String> tags = new ArrayList<>();
					JSONArray tags_arr = jsobj.getJSONArray("tags");
			
					for(int i = 0 ;i<tags_arr.length();i++){

 						tags.add((String)tags_arr.get(i)));

					}

					PlayerModel player = player_parser.parsePlayerModel(jsobj.getJSONObject("player").toString());

					local_model = new ExsodeModel(jsobj.getString("uploadedon") , jsobj.getString("updatededon") , jsobj.getString("uploadedby") , statu, jsobj.getString("id") , jsobj.getString("description") , jsobj.getString("title") , thumbnail, content, accesspi, jsobj.getInt("commentCount") , tagsjsobj.getString("updatedon") , player, );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}