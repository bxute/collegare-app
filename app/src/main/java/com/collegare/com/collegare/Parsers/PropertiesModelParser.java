import org.json.JSONException;
import org.json.JSONObject;

class PropertiesModelParser {

		PricemModelParser pricem_parser = new PricemModelParser();
		DesModelParser des_parser = new DesModelParser();
		FoltModelParser folt_parser = new FoltModelParser();
		TagerModelParser tager_parser = new TagerModelParser();

		public PropertiesModelParser() {
		}

		public PropertiesModel parsePropertiesModel(String json_object) {

			PropertiesModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					PricemModel pricem = pricem_parser.parsePricemModel(jsobj.getJSONObject("pricem").toString());

					DesModel des = des_parser.parseDesModel(jsobj.getJSONObject("des").toString());

					FoltModel folt = folt_parser.parseFoltModel(jsobj.getJSONObject("folt").toString());

					TagerModel tager = tager_parser.parseTagerModel(jsobj.getJSONObject("tager").toString());

					local_model = new PropertiesModel(pricem, des, folt, tager, );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}