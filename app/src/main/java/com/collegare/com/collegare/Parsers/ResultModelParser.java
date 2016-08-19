import org.json.JSONException;
import org.json.JSONObject;

class ResultModelParser {

		ThumbnailModelParser Thumbnail_parser = new ThumbnailModelParser();

		public ResultModelParser() {
		}

		public ResultModel parseResultModel(String json_object) {

			ResultModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					ThumbnailModel Thumbnail = Thumbnail_parser.parseThumbnailModel(jsobj.getJSONObject("Thumbnail").toString());

					local_model = new ResultModel(jsobj.getString("Summary") , jsobj.getString("RefererUrl") , jsobj.getString("Title") , jsobj.getString("Height") , jsobj.getString("FileFormat") , Thumbnail, jsobj.getInt("FileSize") , jsobj.getString("Width") , jsobj.getString("ClickUrl") , jsobj.getString("Url") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}