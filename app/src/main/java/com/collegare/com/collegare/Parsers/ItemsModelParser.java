import org.json.JSONException;
import org.json.JSONObject;

class ItemsModelParser {


		public ItemsModelParser() {
		}

		public ItemsModel parseItemsModel(String json_object) {

			ItemsModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					local_model = new ItemsModel(jsobj.getString("surname") , jsobj.getString("fullname") , jsobj.getInt("index_start_at") , jsobj.getString("email") , jsobj.getString("name") , jsobj.getBoolean("bool") , jsobj.getInt("integer") , jsobj.getInt("index") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}