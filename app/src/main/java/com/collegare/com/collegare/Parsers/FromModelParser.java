import org.json.JSONException;
import org.json.JSONObject;

class FromModelParser {


		public FromModelParser() {
		}

		public FromModel parseFromModel(String json_object) {

			FromModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					local_model = new FromModel(jsobj.getString("id") , jsobj.getString("name") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}