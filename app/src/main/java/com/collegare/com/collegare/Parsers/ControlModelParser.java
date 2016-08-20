import org.json.JSONException;
import org.json.JSONObject;

class ControlModelParser {


		public ControlModelParser() {
		}

		public ControlModel parseControlModel(String json_object) {

			ControlModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					local_model = new ControlModel(jsobj.getInt("favoriteCount") , jsobj.getString("videoRespond") , jsobj.getString("commentVote") , jsobj.getString("list") , jsobj.getString("rate") , jsobj.getString("syndicate") , jsobj.getString("embed") , jsobj.getString("aspectRatio") , jsobj.getString("comment") , jsobj.getInt("viewCount") , jsobj.getInt("ratingCount") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}