import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import org.json.JSONArray;

class RedeModelParser {

		PlayerModelParser player_parser = new PlayerModelParser();
	ContentModelParser content_parser = new ContentModelParser();
	MegernModelParser megern_parser = new MegernModelParser();
	SchemeModelParser scheme_parser = new SchemeModelParser();
	ThumbiModelParser thumbi_parser = new ThumbiModelParser();

		public RedeModelParser() {
		}

		public RedeModel parseRedeModel(String json_object) {

			RedeModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

				PlayerModel player = player_parser.parsePlayerModel(jsobj.getJSONObject("player").toString());

				ContentModel content = content_parser.parseContentModel(jsobj.getJSONObject("content").toString());

				MegernModel megern = megern_parser.parseMegernModel(jsobj.getJSONObject("megern").toString());

				SchemeModel scheme = scheme_parser.parseSchemeModel(jsobj.getJSONObject("scheme").toString());

				ThumbiModel thumbi = thumbi_parser.parseThumbiModel(jsobj.getJSONObject("thumbi").toString());

					ArrayList<String> tags = new ArrayList<>();
					JSONArray tags_arr = jsobj.getJSONArray("tags");
			
					for(int i = 0 ;i<tags_arr.length();i++){

 						tags.add((String)tags_arr.get(i)));

					}

				local_model = new RedeModel(player, content, jsobj.getString("id"), jsobj.getString("title"), megern, jsobj.getInt("commentCount"), scheme, jsobj.getString("description"), thumbi, tags);
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}