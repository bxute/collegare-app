import org.json.JSONException;
import org.json.JSONObject;

class ShemdModelParser {


		public ShemdModelParser() {
		}

		public ShemdModel parseShemdModel(String json_object) {

			ShemdModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					local_model = new ShemdModel(jsobj.getString("aspectRatio") , jsobj.getString("syndicate") , jsobj.getString("rate") , jsobj.getInt("viewCount") , jsobj.getString("title") , jsobj.getString("reason") , jsobj.getString("commentVote") , jsobj.getInt("duration") , jsobj.getInt("favoriteCount") , jsobj.getInt("ratingCount") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}