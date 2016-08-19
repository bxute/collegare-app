import org.json.JSONException;
import org.json.JSONObject;

class RootModelParser {

		ReModelParser re_parser = new ReModelParser();

		public RootModelParser() {
		}

		public RootModel parseRootModel(String json_object) {

			RootModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					ReModel re = re_parser.parseReModel(jsobj.getJSONObject("re").toString());

					local_model = new RootModel(re, );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}