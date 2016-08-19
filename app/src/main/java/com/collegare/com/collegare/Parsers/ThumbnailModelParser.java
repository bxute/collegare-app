import org.json.JSONException;
import org.json.JSONObject;

class ThumbnailModelParser {


		public ThumbnailModelParser() {
		}

		public ThumbnailModel parseThumbnailModel(String json_object) {

			ThumbnailModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					local_model = new ThumbnailModel(jsobj.getString("Height") , jsobj.getString("Url") , jsobj.getString("Width") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}