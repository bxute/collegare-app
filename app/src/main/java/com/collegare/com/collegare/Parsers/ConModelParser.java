import org.json.JSONException;
import org.json.JSONObject;

class ConModelParser {


		public ConModelParser() {
		}

		public ConModel parseConModel(String json_object) {

			ConModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					local_model = new ConModel(jsobj.getString("aspectRatio") , jsobj.getString("syndicate") , jsobj.getString("embed") , jsobj.getString("rate") , jsobj.getInt("favoriteCount") , jsobj.getInt("viewCount") , jsobj.getString("videoRespond") , jsobj.getString("list") , jsobj.getString("commentVote") , jsobj.getInt("ratingCount") , jsobj.getString("comment") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}