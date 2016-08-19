import org.json.JSONException;
import org.json.JSONObject;

class ColorsArrayModelParser {


		public ColorsArrayModelParser() {
		}

		public ColorsArrayModel parseColorsArrayModel(String json_object) {

			ColorsArrayModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					local_model = new ColorsArrayModel(jsobj.getString("colorName") , jsobj.getString("hexValue") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}