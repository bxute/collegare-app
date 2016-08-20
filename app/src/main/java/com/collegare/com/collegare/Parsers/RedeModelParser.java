import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import org.json.JSONArray;

class RedeModelParser {

		PlayerModelParser player_parser = new PlayerModelParser();
		SouthModelParser south_parser = new SouthModelParser();
		ControlModelParser control_parser = new ControlModelParser();
		ContentModelParser content_parser = new ContentModelParser();
		ThumbiModelParser thumbi_parser = new ThumbiModelParser();

		public RedeModelParser() {
		}

		public RedeModel parseRedeModel(String json_object) {

			RedeModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					PlayerModel player = player_parser.parsePlayerModel(jsobj.getJSONObject("player").toString()); 

					ArrayList<String> tags = new ArrayList<>();
					JSONArray tags_arr = jsobj.getJSONArray("tags");
			
					for(int i = 0 ;i<tags_arr.length();i++){

 						tags.add((String)tags_arr.get(i)));

					}

					SouthModel south = south_parser.parseSouthModel(jsobj.getJSONObject("south").toString());

					ControlModel control = control_parser.parseControlModel(jsobj.getJSONObject("control").toString());

					ContentModel content = content_parser.parseContentModel(jsobj.getJSONObject("content").toString());

					ThumbiModel thumbi = thumbi_parser.parseThumbiModel(jsobj.getJSONObject("thumbi").toString());

					local_model = new RedeModel(jsobj.getString("description") , jsobj.getString("updatedon") , jsobj.getInt("commentCount") , jsobj.getString("id") , jsobj.getString("updatededon") , player, tagssouth, control, jsobj.getString("uploadedon") , jsobj.getString("title") , content, thumbi, jsobj.getString("uploadedby") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}