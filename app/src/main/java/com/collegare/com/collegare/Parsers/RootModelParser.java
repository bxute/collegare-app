import org.json.JSONException;
import org.json.JSONObject;

class RootModelParser {

		RawModelParser raw_parser = new RawModelParser();

		public RootModelParser() {
		}

		public RootModel parseRootModel(String json_object) {

			RootModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					RawModel raw = raw_parser.parseRawModel(jsobj.getJSONObject("raw").toString());

					local_model = new RootModel(jsobj.getString("text") , jsobj.getString("iso_language_code") , jsobj.getString("to_user") , jsobj.getString("from_user") , jsobj.getString("profile_image_url") , jsobj.getString("created_at") , raw, jsobj.getInt("id") , jsobj.getInt("to_user_id") , jsobj.getInt("from_user_id") , jsobj.getString("source") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}