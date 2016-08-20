import org.json.JSONException;
import org.json.JSONObject;

class SignModelParser {

		TightModelParser tight_parser = new TightModelParser();
		SecdomModelParser secdom_parser = new SecdomModelParser();

		public SignModelParser() {
		}

		public SignModel parseSignModel(String json_object) {

			SignModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					TightModel tight = tight_parser.parseTightModel(jsobj.getJSONObject("tight").toString());

					SecdomModel secdom = secdom_parser.parseSecdomModel(jsobj.getJSONObject("secdom").toString());

					local_model = new SignModel(tight, secdom, );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}