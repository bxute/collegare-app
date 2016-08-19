import org.json.JSONException;
import org.json.JSONObject;

class NameModelParser {


		public NameModelParser() {
		}

		public NameModel parseNameModel(String json_object) {

			NameModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					local_model = new NameModel(jsobj.getBoolean("required") , jsobj.getString("type") , jsobj.getString("description") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}