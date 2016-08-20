import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import org.json.JSONArray;

class RedeModelParser {

		PlayerModelParser player_parser = new PlayerModelParser();
		ContentModelParser content_parser = new ContentModelParser();
		ConModelParser con_parser = new ConModelParser();
		ThumbiModelParser thumbi_parser = new ThumbiModelParser();
		SyndicateModelParser syndicate_parser = new SyndicateModelParser();

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

					ContentModel content = content_parser.parseContentModel(jsobj.getJSONObject("content").toString());

					ConModel con = con_parser.parseConModel(jsobj.getJSONObject("con").toString());

					ThumbiModel thumbi = thumbi_parser.parseThumbiModel(jsobj.getJSONObject("thumbi").toString());

					SyndicateModel syndicate = syndicate_parser.parseSyndicateModel(jsobj.getJSONObject("syndicate").toString());

					local_model = new RedeModel(jsobj.getString("id") , player, jsobj.getString("description") , tagscontent, jsobj.getString("title") , jsobj.getInt("commentCount") , con, thumbi, syndicate, );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}