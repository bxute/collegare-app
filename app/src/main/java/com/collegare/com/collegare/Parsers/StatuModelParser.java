import org.json.JSONException;
import org.json.JSONObject;

class StatuModelParser {


		public StatuModelParser() {
		}

		public StatuModel parseStatuModel(String json_object) {

			StatuModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					local_model = new StatuModel(jsobj.getInt("duration") , jsobj.getString("value") , jsobj.getString("aspectRatio") , jsobj.getString("reason") , jsobj.getInt("viewCount") , jsobj.getString("rate") , jsobj.getString("list") , jsobj.getString("syndicate") , jsobj.getString("commentVote") , jsobj.getString("comment") , jsobj.getInt("favoriteCount") , jsobj.getInt("ratingCount") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}