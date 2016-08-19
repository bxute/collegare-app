import org.json.JSONException;
import org.json.JSONObject;

class QstatusModelParser {


		public QstatusModelParser() {
		}

		public QstatusModel parseQstatusModel(String json_object) {

			QstatusModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					local_model = new QstatusModel(jsobj.getString("value") , jsobj.getString("reason") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}