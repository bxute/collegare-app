import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import org.json.JSONArray;

class RedemeModelParser {

		SratModelParser srat_parser = new SratModelParser();
		ContentModelParser content_parser = new ContentModelParser();
		PlayerModelParser player_parser = new PlayerModelParser();
		ThumbModelParser thumb_parser = new ThumbModelParser();
		ControlModelParser control_parser = new ControlModelParser();

		public RedemeModelParser() {
		}

		public RedemeModel parseRedemeModel(String json_object) {

			RedemeModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					SratModel srat = srat_parser.parseSratModel(jsobj.getJSONObject("srat").toString());

					ContentModel content = content_parser.parseContentModel(jsobj.getJSONObject("content").toString());

					PlayerModel player = player_parser.parsePlayerModel(jsobj.getJSONObject("player").toString());

					ThumbModel thumb = thumb_parser.parseThumbModel(jsobj.getJSONObject("thumb").toString()); 

					ArrayList<String> tags = new ArrayList<>();
					JSONArray tags_arr = jsobj.getJSONArray("tags");
			
					for(int i = 0 ;i<tags_arr.length();i++){

 						tags.add((String)tags_arr.get(i)));

					}

					ControlModel control = control_parser.parseControlModel(jsobj.getJSONObject("control").toString());

					local_model = new RedemeModel(jsobj.getString("id") , jsobj.getString("uploadedby") , srat, content, jsobj.getString("description") , player, jsobj.getString("updatededon") , jsobj.getString("updatedon") , thumb, tagsjsobj.getInt("commentCount") , control, jsobj.getString("title") , jsobj.getString("uploadedon") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}