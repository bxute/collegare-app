import org.json.JSONException;
import org.json.JSONObject;

class SignModelParser {

		PricemModelParser pricem_parser = new PricemModelParser();
		TightModelParser tight_parser = new TightModelParser();

		public SignModelParser() {
		}

		public SignModel parseSignModel(String json_object) {

			SignModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					PricemModel pricem = pricem_parser.parsePricemModel(jsobj.getJSONObject("pricem").toString());

					TightModel tight = tight_parser.parseTightModel(jsobj.getJSONObject("tight").toString());

					local_model = new SignModel(pricem, tight, );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}