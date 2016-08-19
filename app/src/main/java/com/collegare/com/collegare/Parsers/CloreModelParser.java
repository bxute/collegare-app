import org.json.JSONException;
import org.json.JSONObject;

class CloreModelParser {

		ThumbnailModelParser Thumbnail_parser = new ThumbnailModelParser();

		public CloreModelParser() {
		}

		public CloreModel parseCloreModel(String json_object) {

			CloreModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					ThumbnailModel Thumbnail = Thumbnail_parser.parseThumbnailModel(jsobj.getJSONObject("Thumbnail").toString());

					local_model = new CloreModel(jsobj.getInt("FileSize") , jsobj.getString("Height") , jsobj.getString("FileFormat") , jsobj.getString("Summary") , jsobj.getString("Url") , jsobj.getString("ClickUrl") , jsobj.getString("RefererUrl") , jsobj.getString("Width") , jsobj.getString("Title") , Thumbnail, );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}