import org.json.JSONException;
import org.json.JSONObject;

class SyncdModelParser {


		public SyncdModelParser() {
		}

		public SyncdModel parseSyncdModel(String json_object) {

			SyncdModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					local_model = new SyncdModel(jsobj.getString("aspectRatio") , jsobj.getString("title") , jsobj.getInt("duration") , jsobj.getString("reason") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}