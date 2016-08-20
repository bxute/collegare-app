import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import org.json.JSONArray;

class RedeModelParser {

		ContentModelParser content_parser = new ContentModelParser();
		ShemdModelParser shemd_parser = new ShemdModelParser();
		ThumbiModelParser thumbi_parser = new ThumbiModelParser();
		ConsModelParser cons_parser = new ConsModelParser();
		PlayerModelParser player_parser = new PlayerModelParser();

		public RedeModelParser() {
		}

		public RedeModel parseRedeModel(String json_object) {

			RedeModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object); 

					ArrayList<String> tags = new ArrayList<>();
					JSONArray tags_arr = jsobj.getJSONArray("tags");
			
					for(int i = 0 ;i<tags_arr.length();i++){

 						tags.add((String)tags_arr.get(i)));

					}

					ContentModel content = content_parser.parseContentModel(jsobj.getJSONObject("content").toString());

					ShemdModel shemd = shemd_parser.parseShemdModel(jsobj.getJSONObject("shemd").toString());

					ThumbiModel thumbi = thumbi_parser.parseThumbiModel(jsobj.getJSONObject("thumbi").toString());

					ConsModel cons = cons_parser.parseConsModel(jsobj.getJSONObject("cons").toString());

					PlayerModel player = player_parser.parsePlayerModel(jsobj.getJSONObject("player").toString());

					local_model = new RedeModel(tagscontent, jsobj.getString("description") , shemd, thumbi, cons, jsobj.getInt("commentCount") , jsobj.getString("title") , jsobj.getString("id") , player, );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}