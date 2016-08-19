import org.json.JSONException;
import org.json.JSONObject;

class McontentModelParser {


		public McontentModelParser() {
		}

		public McontentModel parseMcontentModel(String json_object) {

			McontentModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					local_model = new McontentModel(jsobj.getString("6") , jsobj.getString("5") , jsobj.getString("1") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}