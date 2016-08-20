import org.json.JSONException;
import org.json.JSONObject;

class ConModelParser {


		public ConModelParser() {
		}

		public ConModel parseConModel(String json_object) {

			ConModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					local_model = new ConModel(jsobj.getInt("ratingCount") , jsobj.getString("list") , jsobj.getString("rate") , jsobj.getInt("favoriteCount") , jsobj.getString("syndicate") , jsobj.getString("aspectRatio") , jsobj.getInt("viewCount") , jsobj.getString("comment") , jsobj.getString("videoRespond") , jsobj.getString("embed") , jsobj.getString("commentVote") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}