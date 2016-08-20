import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import org.json.JSONArray;

class ExsodeModelParser {

		ContentModelParser content_parser = new ContentModelParser();
		AccesspiModelParser accesspi_parser = new AccesspiModelParser();
		StatuModelParser statu_parser = new StatuModelParser();
		PlayerModelParser player_parser = new PlayerModelParser();
		ThumbnailModelParser thumbnail_parser = new ThumbnailModelParser();

		public ExsodeModelParser() {
		}

		public ExsodeModel parseExsodeModel(String json_object) {

			ExsodeModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					ContentModel content = content_parser.parseContentModel(jsobj.getJSONObject("content").toString());

					AccesspiModel accesspi = accesspi_parser.parseAccesspiModel(jsobj.getJSONObject("accesspi").toString()); 

					ArrayList<String> tags = new ArrayList<>();
					JSONArray tags_arr = jsobj.getJSONArray("tags");
			
					for(int i = 0 ;i<tags_arr.length();i++){

 						tags.add((String)tags_arr.get(i)));

					}

					StatuModel statu = statu_parser.parseStatuModel(jsobj.getJSONObject("statu").toString());

					PlayerModel player = player_parser.parsePlayerModel(jsobj.getJSONObject("player").toString());

					ThumbnailModel thumbnail = thumbnail_parser.parseThumbnailModel(jsobj.getJSONObject("thumbnail").toString());

					local_model = new ExsodeModel(jsobj.getString("title") , content, accesspi, jsobj.getString("description") , tagsjsobj.getString("uploadedby") , statu, player, jsobj.getString("updatedon") , jsobj.getString("uploadedon") , jsobj.getString("id") , jsobj.getString("updatededon") , jsobj.getInt("commentCount") , thumbnail, );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}