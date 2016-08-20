import org.json.JSONException;
import org.json.JSONObject;

class SignModelParser {

		FoltModelParser folt_parser = new FoltModelParser();
		DesModelParser des_parser = new DesModelParser();
		PricemModelParser pricem_parser = new PricemModelParser();
		TightModelParser tight_parser = new TightModelParser();

		public SignModelParser() {
		}

		public SignModel parseSignModel(String json_object) {

			SignModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					FoltModel folt = folt_parser.parseFoltModel(jsobj.getJSONObject("folt").toString());

					DesModel des = des_parser.parseDesModel(jsobj.getJSONObject("des").toString());

					PricemModel pricem = pricem_parser.parsePricemModel(jsobj.getJSONObject("pricem").toString());

					TightModel tight = tight_parser.parseTightModel(jsobj.getJSONObject("tight").toString());

					local_model = new SignModel(folt, des, pricem, tight, );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}