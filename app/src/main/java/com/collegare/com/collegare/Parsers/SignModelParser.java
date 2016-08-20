import org.json.JSONException;
import org.json.JSONObject;

class SignModelParser {

		TightModelParser tight_parser = new TightModelParser();
		PridModelParser prid_parser = new PridModelParser();

		public SignModelParser() {
		}

		public SignModel parseSignModel(String json_object) {

			SignModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					TightModel tight = tight_parser.parseTightModel(jsobj.getJSONObject("tight").toString());

					PridModel prid = prid_parser.parsePridModel(jsobj.getJSONObject("prid").toString());

					local_model = new SignModel(tight, prid, );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}