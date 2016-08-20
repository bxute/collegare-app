import org.json.JSONException;
import org.json.JSONObject;

class ConModelParser {


		public ConModelParser() {
		}

		public ConModel parseConModel(String json_object) {

			ConModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					local_model = new ConModel(jsobj.getString("commentVote") , jsobj.getString("rate") , jsobj.getString("updatedon") , jsobj.getString("syndicate") , jsobj.getString("embed") , jsobj.getInt("favoriteCount") , jsobj.getString("comment") , jsobj.getString("aspectRatio") , jsobj.getString("uploadedby") , jsobj.getInt("ratingCount") , jsobj.getString("updatededon") , jsobj.getString("uploadedon") , jsobj.getString("videoRespond") , jsobj.getInt("viewCount") , jsobj.getString("list") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}