import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import org.json.JSONArray;

class RedeModelParser {

		PlayerModelParser player_parser = new PlayerModelParser();
		MgmtModelParser mgmt_parser = new MgmtModelParser();
		ContentModelParser content_parser = new ContentModelParser();
		ThumbiModelParser thumbi_parser = new ThumbiModelParser();
		ShemdModelParser shemd_parser = new ShemdModelParser();

		public RedeModelParser() {
		}

		public RedeModel parseRedeModel(String json_object) {

			RedeModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					PlayerModel player = player_parser.parsePlayerModel(jsobj.getJSONObject("player").toString());

					MgmtModel mgmt = mgmt_parser.parseMgmtModel(jsobj.getJSONObject("mgmt").toString()); 

					ArrayList<String> tags = new ArrayList<>();
					JSONArray tags_arr = jsobj.getJSONArray("tags");
			
					for(int i = 0 ;i<tags_arr.length();i++){

 						tags.add((String)tags_arr.get(i)));

					}

					ContentModel content = content_parser.parseContentModel(jsobj.getJSONObject("content").toString());

					ThumbiModel thumbi = thumbi_parser.parseThumbiModel(jsobj.getJSONObject("thumbi").toString());

					ShemdModel shemd = shemd_parser.parseShemdModel(jsobj.getJSONObject("shemd").toString());

					local_model = new RedeModel(player, jsobj.getInt("commentCount") , mgmt, tagsjsobj.getString("id") , jsobj.getString("description") , content, jsobj.getString("title") , thumbi, shemd, );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}