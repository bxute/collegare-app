import org.json.JSONException;
import org.json.JSONObject;

class Id_toModelParser {


		public Id_toModelParser() {
		}

		public Id_toModel parseId_toModel(String json_object) {

			Id_toModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					local_model = new Id_toModel(jsobj.getString("id") , jsobj.getString("name") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}