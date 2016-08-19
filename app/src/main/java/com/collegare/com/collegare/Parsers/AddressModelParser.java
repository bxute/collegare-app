import org.json.JSONException;
import org.json.JSONObject;

class AddressModelParser {


		public AddressModelParser() {
		}

		public AddressModel parseAddressModel(String json_object) {

			AddressModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					local_model = new AddressModel(jsobj.getString("state") , jsobj.getString("postalCode") , jsobj.getString("city") , jsobj.getString("streetAddress") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}