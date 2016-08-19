import org.json.JSONException;
import org.json.JSONObject;

class RastModelParser {


		public RastModelParser() {
		}

		public RastModel parseRastModel(String json_object) {

			RastModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					local_model = new RastModel(jsobj.getString("type") , jsobj.getString("created_time") , jsobj.getString("updated_time") , jsobj.getString("name") , jsobj.getString("link") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}