import org.json.JSONException;
import org.json.JSONObject;

class ThumbiModelParser {


		public ThumbiModelParser() {
		}

		public ThumbiModel parseThumbiModel(String json_object) {

			ThumbiModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					local_model = new ThumbiModel(jsobj.getString("default") , jsobj.getString("hqDefault") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}