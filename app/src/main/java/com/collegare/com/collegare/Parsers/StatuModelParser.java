import org.json.JSONException;
import org.json.JSONObject;

class StatuModelParser {


		public StatuModelParser() {
		}

		public StatuModel parseStatuModel(String json_object) {

			StatuModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					local_model = new StatuModel(jsobj.getString("syndicate") , jsobj.getString("rate") , jsobj.getString("aspectRatio") , jsobj.getString("commentVote") , jsobj.getInt("ratingCount") , jsobj.getInt("viewCount") , jsobj.getString("value") , jsobj.getString("comment") , jsobj.getInt("favoriteCount") , jsobj.getString("reason") , jsobj.getInt("duration") , jsobj.getString("list") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}