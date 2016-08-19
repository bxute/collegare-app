import org.json.JSONException;
import org.json.JSONObject;

class AccesspiModelParser {


		public AccesspiModelParser() {
		}

		public AccesspiModel parseAccesspiModel(String json_object) {

			AccesspiModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					local_model = new AccesspiModel(jsobj.getString("comment") , jsobj.getString("videoRespond") , jsobj.getString("syndicate") , jsobj.getString("list") , jsobj.getString("rate") , jsobj.getString("embed") , jsobj.getString("commentVote") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}