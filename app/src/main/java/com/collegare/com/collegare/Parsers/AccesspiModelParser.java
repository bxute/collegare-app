import org.json.JSONException;
import org.json.JSONObject;

class AccesspiModelParser {


		public AccesspiModelParser() {
		}

		public AccesspiModel parseAccesspiModel(String json_object) {

			AccesspiModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					local_model = new AccesspiModel(jsobj.getString("commentVote") , jsobj.getString("comment") , jsobj.getString("videoRespond") , jsobj.getString("syndicate") , jsobj.getInt("viewCount") , jsobj.getString("list") , jsobj.getInt("favoriteCount") , jsobj.getString("rate") , jsobj.getInt("duration") , jsobj.getString("embed") , jsobj.getString("aspectRatio") , jsobj.getInt("ratingCount") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}