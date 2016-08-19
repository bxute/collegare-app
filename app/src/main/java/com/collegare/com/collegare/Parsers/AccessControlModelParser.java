import org.json.JSONException;
import org.json.JSONObject;

class AccessControlModelParser {


		public AccessControlModelParser() {
		}

		public AccessControlModel parseAccessControlModel(String json_object) {

			AccessControlModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					local_model = new AccessControlModel(jsobj.getString("commentVote") , jsobj.getString("rate") , jsobj.getString("syndicate") , jsobj.getString("videoRespond") , jsobj.getString("embed") , jsobj.getString("list") , jsobj.getString("comment") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}