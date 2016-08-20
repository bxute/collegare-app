import org.json.JSONException;
import org.json.JSONObject;

class ConModelParser {


		public ConModelParser() {
		}

		public ConModel parseConModel(String json_object) {

			ConModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					local_model = new ConModel(jsobj.getString("videoRespond") , jsobj.getString("comment") , jsobj.getString("rate") , jsobj.getString("aspectRatio") , jsobj.getInt("favoriteCount") , jsobj.getString("commentVote") , jsobj.getString("syndicate") , jsobj.getString("list") , jsobj.getInt("ratingCount") , jsobj.getInt("viewCount") , jsobj.getString("embed") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}