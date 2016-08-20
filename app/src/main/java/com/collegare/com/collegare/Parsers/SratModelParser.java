import org.json.JSONException;
import org.json.JSONObject;

class SratModelParser {


		public SratModelParser() {
		}

		public SratModel parseSratModel(String json_object) {

			SratModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					local_model = new SratModel(jsobj.getInt("favoriteCount") , jsobj.getString("commentVote") , jsobj.getString("value") , jsobj.getString("reason") , jsobj.getString("comment") , jsobj.getString("aspectRatio") , jsobj.getString("rate") , jsobj.getInt("duration") , jsobj.getString("syndicate") , jsobj.getInt("ratingCount") , jsobj.getString("list") , jsobj.getInt("viewCount") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}