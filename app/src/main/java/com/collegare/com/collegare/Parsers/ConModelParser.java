import org.json.JSONException;
import org.json.JSONObject;

class ConModelParser {


		public ConModelParser() {
		}

		public ConModel parseConModel(String json_object) {

			ConModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					local_model = new ConModel(jsobj.getString("aspectRatio") , jsobj.getString("list") , jsobj.getString("commentVote") , jsobj.getString("syndicate") , jsobj.getInt("ratingCount") , jsobj.getString("comment") , jsobj.getString("embed") , jsobj.getInt("favoriteCount") , jsobj.getInt("viewCount") , jsobj.getString("videoRespond") , jsobj.getString("rate") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}