import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import org.json.JSONArray;

class RedeModelParser {

		ContentModelParser content_parser = new ContentModelParser();
		PlayerModelParser player_parser = new PlayerModelParser();
		SyndicateModelParser syndicate_parser = new SyndicateModelParser();
		ConModelParser con_parser = new ConModelParser();
		ThumbiModelParser thumbi_parser = new ThumbiModelParser();

		public RedeModelParser() {
		}

		public RedeModel parseRedeModel(String json_object) {

			RedeModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					ContentModel content = content_parser.parseContentModel(jsobj.getJSONObject("content").toString());

					PlayerModel player = player_parser.parsePlayerModel(jsobj.getJSONObject("player").toString());

					SyndicateModel syndicate = syndicate_parser.parseSyndicateModel(jsobj.getJSONObject("syndicate").toString());

					ConModel con = con_parser.parseConModel(jsobj.getJSONObject("con").toString()); 

					ArrayList<String> tags = new ArrayList<>();
					JSONArray tags_arr = jsobj.getJSONArray("tags");
			
					for(int i = 0 ;i<tags_arr.length();i++){

 						tags.add((String)tags_arr.get(i)));

					}

					ThumbiModel thumbi = thumbi_parser.parseThumbiModel(jsobj.getJSONObject("thumbi").toString());

					local_model = new RedeModel(jsobj.getString("title") , content, jsobj.getString("description") , player, jsobj.getString("id") , syndicate, con, tagsthumbi, jsobj.getInt("commentCount") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}