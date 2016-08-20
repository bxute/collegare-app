import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import org.json.JSONArray;

class RedeModelParser {

	MegernModelParser megern_parser = new MegernModelParser();
	SchemeModelParser scheme_parser = new SchemeModelParser();
		ThumbiModelParser thumbi_parser = new ThumbiModelParser();
		ContentModelParser content_parser = new ContentModelParser();
		PlayerModelParser player_parser = new PlayerModelParser();

		public RedeModelParser() {
		}

		public RedeModel parseRedeModel(String json_object) {

			RedeModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

				MegernModel megern = megern_parser.parseMegernModel(jsobj.getJSONObject("megern").toString());

					SchemeModel scheme = scheme_parser.parseSchemeModel(jsobj.getJSONObject("scheme").toString());

				ThumbiModel thumbi = thumbi_parser.parseThumbiModel(jsobj.getJSONObject("thumbi").toString());

				ContentModel content = content_parser.parseContentModel(jsobj.getJSONObject("content").toString());

					ArrayList<String> tags = new ArrayList<>();
					JSONArray tags_arr = jsobj.getJSONArray("tags");
			
					for(int i = 0 ;i<tags_arr.length();i++){

 						tags.add((String)tags_arr.get(i)));

					}

				PlayerModel player = player_parser.parsePlayerModel(jsobj.getJSONObject("player").toString());

				local_model = new RedeModel(jsobj.getString("description"), megern, jsobj.getString("id"), scheme, jsobj.getInt("commentCount"), thumbi, jsobj.getString("title"), content, tagsplayer, );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}