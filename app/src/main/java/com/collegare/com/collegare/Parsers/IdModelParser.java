import org.json.JSONException;
import org.json.JSONObject;

class IdModelParser {


		public IdModelParser() {
		}

		public IdModel parseIdModel(String json_object) {

			IdModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					local_model = new IdModel(jsobj.getBoolean("required") , jsobj.getString("type") , jsobj.getString("description") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}