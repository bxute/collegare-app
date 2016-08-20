import org.json.JSONException;
import org.json.JSONObject;

class ControlModelParser {


		public ControlModelParser() {
		}

		public ControlModel parseControlModel(String json_object) {

			ControlModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					local_model = new ControlModel(jsobj.getString("rate") , jsobj.getString("aspectRatio") , jsobj.getString("list") , jsobj.getString("videoRespond") , jsobj.getString("comment") , jsobj.getInt("viewCount") , jsobj.getString("embed") , jsobj.getInt("favoriteCount") , jsobj.getInt("ratingCount") , jsobj.getString("commentVote") , jsobj.getString("syndicate") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}