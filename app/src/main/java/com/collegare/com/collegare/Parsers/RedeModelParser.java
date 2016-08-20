import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import org.json.JSONArray;

class RedeModelParser {

		PlayerModelParser player_parser = new PlayerModelParser();
		ThumbiModelParser thumbi_parser = new ThumbiModelParser();
		TeconsModelParser tecons_parser = new TeconsModelParser();
		ShemdModelParser shemd_parser = new ShemdModelParser();
		ContentModelParser content_parser = new ContentModelParser();

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

					PlayerModel player = player_parser.parsePlayerModel(jsobj.getJSONObject("player").toString());

					ThumbiModel thumbi = thumbi_parser.parseThumbiModel(jsobj.getJSONObject("thumbi").toString());

					TeconsModel tecons = tecons_parser.parseTeconsModel(jsobj.getJSONObject("tecons").toString());

					ShemdModel shemd = shemd_parser.parseShemdModel(jsobj.getJSONObject("shemd").toString());

					ContentModel content = content_parser.parseContentModel(jsobj.getJSONObject("content").toString());

					local_model = new RedeModel(jsobj.getString("description") , tagsplayer, thumbi, tecons, jsobj.getString("title") , jsobj.getString("id") , shemd, jsobj.getInt("commentCount") , content, );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}