import org.json.JSONException;
import org.json.JSONObject;

class SigModelParser {


		public SigModelParser() {
		}

		public SigModel parseSigModel(String json_object) {

			SigModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					local_model = new SigModel(jsobj.getString("default") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}