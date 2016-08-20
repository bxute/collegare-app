import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import org.json.JSONArray;

class RedeModelParser {

		ContentModelParser content_parser = new ContentModelParser();
		PlayerModelParser player_parser = new PlayerModelParser();
		ThumbiModelParser thumbi_parser = new ThumbiModelParser();
		ConterieModelParser conterie_parser = new ConterieModelParser();
		SyndicateModelParser syndicate_parser = new SyndicateModelParser();

		public RedeModelParser() {
		}

		public RedeModel parseRedeModel(String json_object) {

			RedeModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					ContentModel content = content_parser.parseContentModel(jsobj.getJSONObject("content").toString());

					PlayerModel player = player_parser.parsePlayerModel(jsobj.getJSONObject("player").toString());

					ThumbiModel thumbi = thumbi_parser.parseThumbiModel(jsobj.getJSONObject("thumbi").toString());

					ConterieModel conterie = conterie_parser.parseConterieModel(jsobj.getJSONObject("conterie").toString());

					SyndicateModel syndicate = syndicate_parser.parseSyndicateModel(jsobj.getJSONObject("syndicate").toString()); 

					ArrayList<String> tags = new ArrayList<>();
					JSONArray tags_arr = jsobj.getJSONArray("tags");
			
					for(int i = 0 ;i<tags_arr.length();i++){

 						tags.add((String)tags_arr.get(i)));

					}

					local_model = new RedeModel(content, jsobj.getString("updatedon") , player, thumbi, jsobj.getString("uploadedon") , jsobj.getString("title") , conterie, jsobj.getString("id") , jsobj.getString("updatededon") , jsobj.getString("uploadedby") , syndicate, jsobj.getString("description") , jsobj.getInt("commentCount") , tags);
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}