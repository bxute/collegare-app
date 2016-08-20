import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import org.json.JSONArray;

class RedeModelParser {

		ThumbiModelParser thumbi_parser = new ThumbiModelParser();
		ContentModelParser content_parser = new ContentModelParser();
		SchemeModelParser scheme_parser = new SchemeModelParser();
		PlayerModelParser player_parser = new PlayerModelParser();
		MegernModelParser megern_parser = new MegernModelParser();

		public RedeModelParser() {
		}

		public RedeModel parseRedeModel(String json_object) {

			RedeModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					ThumbiModel thumbi = thumbi_parser.parseThumbiModel(jsobj.getJSONObject("thumbi").toString());

					ContentModel content = content_parser.parseContentModel(jsobj.getJSONObject("content").toString());

					SchemeModel scheme = scheme_parser.parseSchemeModel(jsobj.getJSONObject("scheme").toString());

					PlayerModel player = player_parser.parsePlayerModel(jsobj.getJSONObject("player").toString()); 

					ArrayList<String> tags = new ArrayList<>();
					JSONArray tags_arr = jsobj.getJSONArray("tags");
			
					for(int i = 0 ;i<tags_arr.length();i++){

 						tags.add((String)tags_arr.get(i)));

					}

					MegernModel megern = megern_parser.parseMegernModel(jsobj.getJSONObject("megern").toString());

					local_model = new RedeModel(thumbi, jsobj.getString("description") , content, scheme, player, tagsjsobj.getString("id") , megern, jsobj.getInt("commentCount") , jsobj.getString("title") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}