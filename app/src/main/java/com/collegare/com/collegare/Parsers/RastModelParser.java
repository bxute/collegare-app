import org.json.JSONException;
import org.json.JSONObject;

class RastModelParser {


		public RastModelParser() {
		}

		public RastModel parseRastModel(String json_object) {

			RastModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					local_model = new RastModel(jsobj.getString("type") , jsobj.getString("name") , jsobj.getString("created_time") , jsobj.getString("link") , jsobj.getString("updated_time") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}