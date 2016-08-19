import org.json.JSONException;
import org.json.JSONObject;

class FoltModelParser {


		public FoltModelParser() {
		}

		public FoltModel parseFoltModel(String json_object) {

			FoltModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					local_model = new FoltModel(jsobj.getString("type") , jsobj.getBoolean("required") , jsobj.getString("description") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}