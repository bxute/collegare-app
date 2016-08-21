import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import org.json.JSONArray;

class RedeModelParser {

	SchemeModelParser scheme_parser = new SchemeModelParser();
		PlayerModelParser player_parser = new PlayerModelParser();
	MegernModelParser megern_parser = new MegernModelParser();
	ThumbiModelParser thumbi_parser = new ThumbiModelParser();
	ContentModelParser content_parser = new ContentModelParser();

		public RedeModelParser() {
		}

		public RedeModel parseRedeModel(String json_object) {

			RedeModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

				SchemeModel scheme = scheme_parser.parseSchemeModel(jsobj.getJSONObject("scheme").toString());

				PlayerModel player = player_parser.parsePlayerModel(jsobj.getJSONObject("player").toString());

				MegernModel megern = megern_parser.parseMegernModel(jsobj.getJSONObject("megern").toString());

				ThumbiModel thumbi = thumbi_parser.parseThumbiModel(jsobj.getJSONObject("thumbi").toString());

					ArrayList<String> tags = new ArrayList<>();
					JSONArray tags_arr = jsobj.getJSONArray("tags");
			
					for(int i = 0 ;i<tags_arr.length();i++){

 						tags.add((String)tags_arr.get(i)));

					}

				ContentModel content = content_parser.parseContentModel(jsobj.getJSONObject("content").toString());

				local_model = new RedeModel(scheme, jsobj.getString("aspectRatio"), player, jsobj.getString("title"), jsobj.getInt("favoriteCount"), jsobj.getString("description"), jsobj.getString("syndicate"), megern, jsobj.getString("id"), jsobj.getString("uploadedon"), jsobj.getInt("viewCount"), jsobj.getString("rate"), thumbi, jsobj.getString("commentVote"), jsobj.getInt("commentCount"), jsobj.getInt("ratingCount"), tagscontent, );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}