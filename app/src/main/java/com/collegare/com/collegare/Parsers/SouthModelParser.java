import org.json.JSONException;
import org.json.JSONObject;

class SouthModelParser {


		public SouthModelParser() {
		}

		public SouthModel parseSouthModel(String json_object) {

			SouthModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					local_model = new SouthModel(jsobj.getInt("duration") , jsobj.getString("uploadedon") , jsobj.getString("uploadedby") , jsobj.getString("updatedon") , jsobj.getInt("ratingCount") , jsobj.getString("aspectRatio") , jsobj.getInt("favoriteCount") , jsobj.getString("reason") , jsobj.getString("updatededon") , jsobj.getInt("viewCount") , jsobj.getString("title") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}