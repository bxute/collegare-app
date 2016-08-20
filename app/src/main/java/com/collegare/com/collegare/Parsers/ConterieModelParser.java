import org.json.JSONException;
import org.json.JSONObject;

class ConterieModelParser {


		public ConterieModelParser() {
		}

		public ConterieModel parseConterieModel(String json_object) {

			ConterieModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					local_model = new ConterieModel(jsobj.getString("comment") , jsobj.getString("updatedon") , jsobj.getInt("viewCount") , jsobj.getString("rate") , jsobj.getString("videoRespond") , jsobj.getInt("ratingCount") , jsobj.getString("commentVote") , jsobj.getString("uploadedon") , jsobj.getInt("favoriteCount") , jsobj.getString("aspectRatio") , jsobj.getString("embed") , jsobj.getString("uploadedby") , jsobj.getString("syndicate") , jsobj.getString("list") , jsobj.getString("updatededon") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}