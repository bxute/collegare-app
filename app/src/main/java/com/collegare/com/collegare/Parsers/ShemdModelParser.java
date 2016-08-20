import org.json.JSONException;
import org.json.JSONObject;

class ShemdModelParser {


		public ShemdModelParser() {
		}

		public ShemdModel parseShemdModel(String json_object) {

			ShemdModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

				local_model = new ShemdModel(jsobj.getString("aspectRatio"), jsobj.getString("reason"), jsobj.getString("title"), );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}