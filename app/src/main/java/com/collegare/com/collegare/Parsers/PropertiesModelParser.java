import org.json.JSONException;
import org.json.JSONObject;

class PropertiesModelParser {

		DesModelParser des_parser = new DesModelParser();
		TagerModelParser tager_parser = new TagerModelParser();
		PricemModelParser pricem_parser = new PricemModelParser();
		FoltModelParser folt_parser = new FoltModelParser();

		public PropertiesModelParser() {
		}

		public PropertiesModel parsePropertiesModel(String json_object) {

			PropertiesModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					DesModel des = des_parser.parseDesModel(jsobj.getJSONObject("des").toString());

					TagerModel tager = tager_parser.parseTagerModel(jsobj.getJSONObject("tager").toString());

					PricemModel pricem = pricem_parser.parsePricemModel(jsobj.getJSONObject("pricem").toString());

					FoltModel folt = folt_parser.parseFoltModel(jsobj.getJSONObject("folt").toString());

					local_model = new PropertiesModel(des, tager, pricem, folt, );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}