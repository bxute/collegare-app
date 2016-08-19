import org.json.JSONException;
import org.json.JSONObject;

class PriceModelParser {


		public PriceModelParser() {
		}

		public PriceModel parsePriceModel(String json_object) {

			PriceModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					local_model = new PriceModel(jsobj.getBoolean("required") , jsobj.getInt("minimum") , jsobj.getString("type") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}