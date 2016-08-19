import org.json.JSONException;
import org.json.JSONObject;

class AccesspiModelParser {


		public AccesspiModelParser() {
		}

		public AccesspiModel parseAccesspiModel(String json_object) {

			AccesspiModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					local_model = new AccesspiModel(jsobj.getString("embed") , jsobj.getString("commentVote") , jsobj.getString("rate") , jsobj.getString("list") , jsobj.getString("syndicate") , jsobj.getString("aspectRatio") , jsobj.getInt("viewCount") , jsobj.getString("comment") , jsobj.getInt("favoriteCount") , jsobj.getInt("ratingCount") , jsobj.getString("videoRespond") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}