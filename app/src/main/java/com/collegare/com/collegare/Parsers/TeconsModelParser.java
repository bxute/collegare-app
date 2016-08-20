import org.json.JSONException;
import org.json.JSONObject;

class TeconsModelParser {


		public TeconsModelParser() {
		}

		public TeconsModel parseTeconsModel(String json_object) {

			TeconsModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

				local_model = new TeconsModel(jsobj.getString("syndicate"), jsobj.getInt("viewCount"), jsobj.getString("embed"), jsobj.getString("aspectRatio"), jsobj.getString("comment"), jsobj.getInt("ratingCount"), jsobj.getString("commentVote"), jsobj.getInt("duration"), jsobj.getString("uploadedon"), jsobj.getInt("favoriteCount"), jsobj.getString("videoRespond"), jsobj.getString("uploadedby"), jsobj.getString("rate"), jsobj.getString("list"), jsobj.getString("updatedon"), );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}