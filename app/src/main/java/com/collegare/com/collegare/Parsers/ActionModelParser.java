import org.json.JSONException;
import org.json.JSONObject;

class ActionModelParser {


		public ActionModelParser() {
		}

		public ActionModel parseActionModel(String json_object) {

			ActionModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					local_model = new ActionModel(jsobj.getString("name") , jsobj.getString("link") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}