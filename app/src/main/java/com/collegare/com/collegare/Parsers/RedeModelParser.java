import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import org.json.JSONArray;

class RedeModelParser {

		ThumbiModelParser thumbi_parser = new ThumbiModelParser();
		PlayerModelParser player_parser = new PlayerModelParser();
		SyndicateModelParser syndicate_parser = new SyndicateModelParser();
		ContentModelParser content_parser = new ContentModelParser();
		ConModelParser con_parser = new ConModelParser();

		public RedeModelParser() {
		}

		public RedeModel parseRedeModel(String json_object) {

			RedeModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					ThumbiModel thumbi = thumbi_parser.parseThumbiModel(jsobj.getJSONObject("thumbi").toString()); 

					ArrayList<String> tags = new ArrayList<>();
					JSONArray tags_arr = jsobj.getJSONArray("tags");
			
					for(int i = 0 ;i<tags_arr.length();i++){

 						tags.add((String)tags_arr.get(i)));

					}

					PlayerModel player = player_parser.parsePlayerModel(jsobj.getJSONObject("player").toString());

					SyndicateModel syndicate = syndicate_parser.parseSyndicateModel(jsobj.getJSONObject("syndicate").toString());

					ContentModel content = content_parser.parseContentModel(jsobj.getJSONObject("content").toString());

					ConModel con = con_parser.parseConModel(jsobj.getJSONObject("con").toString());

					local_model = new RedeModel(thumbi, jsobj.getString("id") , jsobj.getString("description") , tagsjsobj.getString("title") , player, syndicate, content, jsobj.getInt("commentCount") , con, );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}