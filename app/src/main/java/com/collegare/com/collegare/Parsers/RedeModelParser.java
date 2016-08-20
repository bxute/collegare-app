import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import org.json.JSONArray;

class RedeModelParser {

		PlayerModelParser player_parser = new PlayerModelParser();
		ContentModelParser content_parser = new ContentModelParser();
		TeconsModelParser tecons_parser = new TeconsModelParser();
		ThumbiModelParser thumbi_parser = new ThumbiModelParser();
		ShemdModelParser shemd_parser = new ShemdModelParser();

		public RedeModelParser() {
		}

		public RedeModel parseRedeModel(String json_object) {

			RedeModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					PlayerModel player = player_parser.parsePlayerModel(jsobj.getJSONObject("player").toString());

					ContentModel content = content_parser.parseContentModel(jsobj.getJSONObject("content").toString());

					TeconsModel tecons = tecons_parser.parseTeconsModel(jsobj.getJSONObject("tecons").toString());

					ThumbiModel thumbi = thumbi_parser.parseThumbiModel(jsobj.getJSONObject("thumbi").toString());

					ShemdModel shemd = shemd_parser.parseShemdModel(jsobj.getJSONObject("shemd").toString()); 

					ArrayList<String> tags = new ArrayList<>();
					JSONArray tags_arr = jsobj.getJSONArray("tags");
			
					for(int i = 0 ;i<tags_arr.length();i++){

 						tags.add((String)tags_arr.get(i)));

					}

					local_model = new RedeModel(jsobj.getString("description") , player, content, jsobj.getString("id") , tecons, thumbi, shemd, tagsjsobj.getInt("commentCount") , jsobj.getString("title") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}