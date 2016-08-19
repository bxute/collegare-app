import org.json.JSONException;
import org.json.JSONObject;

class SemanticsModelParser {


		public SemanticsModelParser() {
		}

		public SemanticsModel parseSemanticsModel(String json_object) {

			SemanticsModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					local_model = new SemanticsModel(jsobj.getString("comment") , jsobj.getString("videoRespond") , jsobj.getString("list") , jsobj.getString("commentVote") , jsobj.getString("embed") , jsobj.getString("rate") , jsobj.getString("syndicate") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}