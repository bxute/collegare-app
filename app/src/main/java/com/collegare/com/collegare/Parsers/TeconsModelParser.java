import org.json.JSONException;
import org.json.JSONObject;

class TeconsModelParser {


		public TeconsModelParser() {
		}

		public TeconsModel parseTeconsModel(String json_object) {

			TeconsModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					local_model = new TeconsModel(jsobj.getString("list") , jsobj.getString("uploadedon") , jsobj.getString("updatedon") , jsobj.getString("comment") , jsobj.getString("commentVote") , jsobj.getString("aspectRatio") , jsobj.getString("syndicate") , jsobj.getString("rate") , jsobj.getInt("viewCount") , jsobj.getString("uploadedby") , jsobj.getInt("favoriteCount") , jsobj.getInt("ratingCount") , jsobj.getString("embed") , jsobj.getString("videoRespond") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}