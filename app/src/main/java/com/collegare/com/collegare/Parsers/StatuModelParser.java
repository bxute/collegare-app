import org.json.JSONException;
import org.json.JSONObject;

class StatuModelParser {


		public StatuModelParser() {
		}

		public StatuModel parseStatuModel(String json_object) {

			StatuModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					local_model = new StatuModel(jsobj.getInt("duration") , jsobj.getString("aspectRatio") , jsobj.getString("reason") , jsobj.getString("syndicate") , jsobj.getInt("ratingCount") , jsobj.getString("rate") , jsobj.getString("comment") , jsobj.getInt("favoriteCount") , jsobj.getString("value") , jsobj.getString("list") , jsobj.getString("commentVote") , jsobj.getInt("viewCount") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}