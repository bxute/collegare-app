import org.json.JSONException;
import org.json.JSONObject;

class RootModelParser {

		SamModelParser sam_parser = new SamModelParser();

		public RootModelParser() {
		}

		public RootModel parseRootModel(String json_object) {

			RootModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					SamModel sam = sam_parser.parseSamModel(jsobj.getJSONObject("sam").toString());

					local_model = new RootModel(sam, jsobj.getString("apiVersion") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}