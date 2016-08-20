import org.json.JSONException;
import org.json.JSONObject;

class SyndicateModelParser {


		public SyndicateModelParser() {
		}

		public SyndicateModel parseSyndicateModel(String json_object) {

			SyndicateModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					local_model = new SyndicateModel(jsobj.getString("aspectRatio") , jsobj.getString("title") , jsobj.getInt("duration") , jsobj.getString("reason") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}