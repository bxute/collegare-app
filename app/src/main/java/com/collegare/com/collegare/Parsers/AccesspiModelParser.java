import org.json.JSONException;
import org.json.JSONObject;

class AccesspiModelParser {


		public AccesspiModelParser() {
		}

		public AccesspiModel parseAccesspiModel(String json_object) {

			AccesspiModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					local_model = new AccesspiModel(jsobj.getString("syndicate") , jsobj.getString("rate") , jsobj.getInt("favoriteCount") , jsobj.getString("aspectRatio") , jsobj.getString("commentVote") , jsobj.getInt("ratingCount") , jsobj.getString("comment") , jsobj.getString("videoRespond") , jsobj.getInt("viewCount") , jsobj.getString("embed") , jsobj.getString("list") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}