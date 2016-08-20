import org.json.JSONException;
import org.json.JSONObject;

class SignModelParser {

		TightModelParser tight_parser = new TightModelParser();
		PricemModelParser pricem_parser = new PricemModelParser();

		public SignModelParser() {
		}

		public SignModel parseSignModel(String json_object) {

			SignModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					TightModel tight = tight_parser.parseTightModel(jsobj.getJSONObject("tight").toString());

					PricemModel pricem = pricem_parser.parsePricemModel(jsobj.getJSONObject("pricem").toString());

					local_model = new SignModel(tight, pricem, );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}