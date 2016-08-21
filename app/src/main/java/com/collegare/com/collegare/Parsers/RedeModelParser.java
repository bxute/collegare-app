import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import org.json.JSONArray;

class RedeModelParser {

	SchemeModelParser scheme_parser = new SchemeModelParser();
	ContentModelParser content_parser = new ContentModelParser();
		PlayerModelParser player_parser = new PlayerModelParser();
	MegernModelParser megern_parser = new MegernModelParser();
	ThumbiModelParser thumbi_parser = new ThumbiModelParser();

		public RedeModelParser() {
		}

		public RedeModel parseRedeModel(String json_object) {

			RedeModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

				SchemeModel scheme = scheme_parser.parseSchemeModel(jsobj.getJSONObject("scheme").toString());

				ContentModel content = content_parser.parseContentModel(jsobj.getJSONObject("content").toString());

					ArrayList<String> tags = new ArrayList<>();
					JSONArray tags_arr = jsobj.getJSONArray("tags");
			
					for(int i = 0 ;i<tags_arr.length();i++){

 						tags.add((String)tags_arr.get(i)));

					}

				PlayerModel player = player_parser.parsePlayerModel(jsobj.getJSONObject("player").toString());

				MegernModel megern = megern_parser.parseMegernModel(jsobj.getJSONObject("megern").toString());

				ThumbiModel thumbi = thumbi_parser.parseThumbiModel(jsobj.getJSONObject("thumbi").toString());

				local_model = new RedeModel(scheme, jsobj.getString("id"), content, jsobj.getString("description"), jsobj.getString("title"), tagsplayer, jsobj.getInt("commentCount"), megern, thumbi, );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}