import org.json.JSONException;
import org.json.JSONObject;

class SignModelParser {

		TightModelParser tight_parser = new TightModelParser();
		FoltModelParser folt_parser = new FoltModelParser();
		PricemModelParser pricem_parser = new PricemModelParser();
		DesModelParser des_parser = new DesModelParser();

		public SignModelParser() {
		}

		public SignModel parseSignModel(String json_object) {

			SignModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					TightModel tight = tight_parser.parseTightModel(jsobj.getJSONObject("tight").toString());

					FoltModel folt = folt_parser.parseFoltModel(jsobj.getJSONObject("folt").toString());

					PricemModel pricem = pricem_parser.parsePricemModel(jsobj.getJSONObject("pricem").toString());

					DesModel des = des_parser.parseDesModel(jsobj.getJSONObject("des").toString());

					local_model = new SignModel(tight, folt, pricem, des, );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}