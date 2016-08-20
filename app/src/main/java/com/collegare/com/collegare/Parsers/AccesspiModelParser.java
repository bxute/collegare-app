import org.json.JSONException;
import org.json.JSONObject;

class AccesspiModelParser {


		public AccesspiModelParser() {
		}

		public AccesspiModel parseAccesspiModel(String json_object) {

			AccesspiModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					local_model = new AccesspiModel(jsobj.getString("aspectRatio") , jsobj.getString("syndicate") , jsobj.getString("list") , jsobj.getInt("ratingCount") , jsobj.getString("embed") , jsobj.getString("rate") , jsobj.getString("commentVote") , jsobj.getString("comment") , jsobj.getInt("favoriteCount") , jsobj.getString("videoRespond") , jsobj.getInt("viewCount") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}