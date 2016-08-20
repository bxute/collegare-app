import org.json.JSONException;
import org.json.JSONObject;

class ThumbModelParser {


		public ThumbModelParser() {
		}

		public ThumbModel parseThumbModel(String json_object) {

			ThumbModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					local_model = new ThumbModel(jsobj.getString("hqDefault") , jsobj.getString("default") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}