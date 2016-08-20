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

					local_model = new PridModel(jsobj.getString("syndicate") , jsobj.getString("type") , jsobj.getInt("viewCount") , jsobj.getString("list") , jsobj.getString("updatededon") , items, jsobj.getInt("favoriteCount") , jsobj.getString("aspectRatio") , jsobj.getInt("minimum") , jsobj.getString("rate") , jsobj.getBoolean("required") , jsobj.getString("commentVote") , jsobj.getInt("ratingCount") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}