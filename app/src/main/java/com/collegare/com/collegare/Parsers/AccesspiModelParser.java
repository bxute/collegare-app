import org.json.JSONException;
import org.json.JSONObject;

class AccesspiModelParser {


		public AccesspiModelParser() {
		}

		public AccesspiModel parseAccesspiModel(String json_object) {

			AccesspiModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					local_model = new AccesspiModel(jsobj.getInt("duration") , jsobj.getString("syndicate") , jsobj.getString("rate") , jsobj.getInt("ratingCount") , jsobj.getString("comment") , jsobj.getInt("viewCount") , jsobj.getString("list") , jsobj.getString("videoRespond") , jsobj.getString("commentVote") , jsobj.getString("aspectRatio") , jsobj.getInt("favoriteCount") , jsobj.getString("embed") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}