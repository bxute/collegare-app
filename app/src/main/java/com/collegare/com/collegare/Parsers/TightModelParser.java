import org.json.JSONException;
import org.json.JSONObject;

class TightModelParser {

		ItemsModelParser items_parser = new ItemsModelParser();

		public TightModelParser() {
		}

		public TightModel parseTightModel(String json_object) {

			TightModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					ItemsModel items = items_parser.parseItemsModel(jsobj.getJSONObject("items").toString());

					local_model = new TightModel(items, jsobj.getString("type") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}