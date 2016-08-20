import org.json.JSONException;
import org.json.JSONObject;

class ConsModelParser {


		public ConsModelParser() {
		}

		public ConsModel parseConsModel(String json_object) {

			ConsModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					local_model = new ConsModel(jsobj.getString("syndicate") , jsobj.getString("uploadedby") , jsobj.getInt("viewCount") , jsobj.getString("videoRespond") , jsobj.getString("list") , jsobj.getString("comment") , jsobj.getString("uploadedon") , jsobj.getString("rate") , jsobj.getString("updatedon") , jsobj.getString("embed") , jsobj.getInt("favoriteCount") , jsobj.getString("commentVote") , jsobj.getString("aspectRatio") , jsobj.getInt("ratingCount") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}