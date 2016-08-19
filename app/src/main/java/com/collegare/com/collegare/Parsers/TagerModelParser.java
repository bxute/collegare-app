import org.json.JSONException;
import org.json.JSONObject;

class TagerModelParser {

		ItemsModelParser items_parser = new ItemsModelParser();

		public TagerModelParser() {
		}

		public TagerModel parseTagerModel(String json_object) {

			TagerModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					ItemsModel items = items_parser.parseItemsModel(jsobj.getJSONObject("items").toString());

					local_model = new TagerModel(items, jsobj.getString("type") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}