import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import org.json.JSONArray;

class RedeModelParser {

		ThumbiModelParser thumbi_parser = new ThumbiModelParser();
		SyncdModelParser syncd_parser = new SyncdModelParser();
		ContentModelParser content_parser = new ContentModelParser();
		ConModelParser con_parser = new ConModelParser();
		PlayerModelParser player_parser = new PlayerModelParser();

		public RedeModelParser() {
		}

		public RedeModel parseRedeModel(String json_object) {

			RedeModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					ThumbiModel thumbi = thumbi_parser.parseThumbiModel(jsobj.getJSONObject("thumbi").toString());

					SyncdModel syncd = syncd_parser.parseSyncdModel(jsobj.getJSONObject("syncd").toString()); 

					ArrayList<String> tags = new ArrayList<>();
					JSONArray tags_arr = jsobj.getJSONArray("tags");
			
					for(int i = 0 ;i<tags_arr.length();i++){

 						tags.add((String)tags_arr.get(i)));

					}

					ContentModel content = content_parser.parseContentModel(jsobj.getJSONObject("content").toString());

					ConModel con = con_parser.parseConModel(jsobj.getJSONObject("con").toString());

					PlayerModel player = player_parser.parsePlayerModel(jsobj.getJSONObject("player").toString());

					local_model = new RedeModel(thumbi, jsobj.getString("id") , jsobj.getInt("commentCount") , syncd, tagsjsobj.getString("description") , jsobj.getString("title") , content, con, player, );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}