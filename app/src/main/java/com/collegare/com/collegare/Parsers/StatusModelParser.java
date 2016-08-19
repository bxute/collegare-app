import org.json.JSONException;
import org.json.JSONObject;

class StatusModelParser {


		public StatusModelParser() {
		}

		public StatusModel parseStatusModel(String json_object) {

			StatusModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					local_model = new StatusModel(jsobj.getString("reason") , jsobj.getString("value") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}