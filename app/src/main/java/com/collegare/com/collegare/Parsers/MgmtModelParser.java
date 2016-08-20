import org.json.JSONException;
import org.json.JSONObject;

class MgmtModelParser {


		public MgmtModelParser() {
		}

		public MgmtModel parseMgmtModel(String json_object) {

			MgmtModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					local_model = new MgmtModel(jsobj.getString("commentVote") , jsobj.getInt("viewCount") , jsobj.getString("updatedon") , jsobj.getString("uploadedon") , jsobj.getString("comment") , jsobj.getString("rate") , jsobj.getInt("favoriteCount") , jsobj.getString("aspectRatio") , jsobj.getString("embed") , jsobj.getInt("ratingCount") , jsobj.getString("uploadedby") , jsobj.getString("list") , jsobj.getString("syndicate") , jsobj.getString("videoRespond") , jsobj.getInt("duration") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}