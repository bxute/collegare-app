import org.json.JSONException;
import org.json.JSONObject;

class RawModelParser {


		public RawModelParser() {
		}

		public RawModel parseRawModel(String json_object) {

			RawModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					local_model = new RawModel(jsobj.getString("result_type") , jsobj.getInt("recent_retweets") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}