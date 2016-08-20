import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import org.json.JSONArray;

class RedeModelParser {

		SyndicateModelParser syndicate_parser = new SyndicateModelParser();
		ThumbiModelParser thumbi_parser = new ThumbiModelParser();
		ConModelParser con_parser = new ConModelParser();
		ContentModelParser content_parser = new ContentModelParser();
		PlayerModelParser player_parser = new PlayerModelParser();

		public RedeModelParser() {
		}

		public RedeModel parseRedeModel(String json_object) {

			RedeModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					SyndicateModel syndicate = syndicate_parser.parseSyndicateModel(jsobj.getJSONObject("syndicate").toString());

					ThumbiModel thumbi = thumbi_parser.parseThumbiModel(jsobj.getJSONObject("thumbi").toString());

					ConModel con = con_parser.parseConModel(jsobj.getJSONObject("con").toString()); 

					ArrayList<String> tags = new ArrayList<>();
					JSONArray tags_arr = jsobj.getJSONArray("tags");
			
					for(int i = 0 ;i<tags_arr.length();i++){

 						tags.add((String)tags_arr.get(i)));

					}

					ContentModel content = content_parser.parseContentModel(jsobj.getJSONObject("content").toString());

					PlayerModel player = player_parser.parsePlayerModel(jsobj.getJSONObject("player").toString());

					local_model = new RedeModel(jsobj.getInt("ratingCount") , jsobj.getInt("favoriteCount") , syndicate, jsobj.getInt("viewCount") , jsobj.getString("title") , thumbi, con, jsobj.getString("uploadedon") , jsobj.getString("description") , jsobj.getString("id") , jsobj.getString("updatedon") , tagsjsobj.getString("uploadedby") , content, jsobj.getInt("commentCount") , player, );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}