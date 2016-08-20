import org.json.JSONException;
import org.json.JSONObject;

class SignModelParser {

		DesModelParser des_parser = new DesModelParser();
		FoltModelParser folt_parser = new FoltModelParser();
		TightModelParser tight_parser = new TightModelParser();
		PricemModelParser pricem_parser = new PricemModelParser();

		public SignModelParser() {
		}

		public SignModel parseSignModel(String json_object) {

			SignModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					DesModel des = des_parser.parseDesModel(jsobj.getJSONObject("des").toString());

					FoltModel folt = folt_parser.parseFoltModel(jsobj.getJSONObject("folt").toString());

					TightModel tight = tight_parser.parseTightModel(jsobj.getJSONObject("tight").toString());

					PricemModel pricem = pricem_parser.parsePricemModel(jsobj.getJSONObject("pricem").toString());

					local_model = new SignModel(des, folt, tight, pricem, );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}