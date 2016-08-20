import org.json.JSONException;
import org.json.JSONObject;

class SignModelParser {

		PridModelParser prid_parser = new PridModelParser();
		TightModelParser tight_parser = new TightModelParser();

		public SignModelParser() {
		}

		public SignModel parseSignModel(String json_object) {

			SignModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					PridModel prid = prid_parser.parsePridModel(jsobj.getJSONObject("prid").toString());

					TightModel tight = tight_parser.parseTightModel(jsobj.getJSONObject("tight").toString());

					local_model = new SignModel(prid, tight, );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}