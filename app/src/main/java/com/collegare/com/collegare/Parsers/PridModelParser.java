import org.json.JSONException;
import org.json.JSONObject;

class PridModelParser {

		ItemsModelParser items_parser = new ItemsModelParser();

		public PridModelParser() {
		}

		public PridModel parsePridModel(String json_object) {

			PridModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					ItemsModel items = items_parser.parseItemsModel(jsobj.getJSONObject("items").toString());

					local_model = new PridModel(jsobj.getString("aspectRatio") , jsobj.getString("list") , jsobj.getString("commentVote") , jsobj.getString("syndicate") , jsobj.getInt("minimum") , items, jsobj.getString("rate") , jsobj.getString("updatededon") , jsobj.getInt("ratingCount") , jsobj.getString("type") , jsobj.getBoolean("required") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}