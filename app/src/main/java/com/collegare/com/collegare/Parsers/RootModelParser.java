import org.json.JSONException;
import org.json.JSONObject;

class RootModelParser {

		DatModelParser dat_parser = new DatModelParser();
		PropertiesModelParser properties_parser = new PropertiesModelParser();

		public RootModelParser() {
		}

		public RootModel parseRootModel(String json_object) {

			RootModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					DatModel dat = dat_parser.parseDatModel(jsobj.getJSONObject("dat").toString());

					PropertiesModel properties = properties_parser.parsePropertiesModel(jsobj.getJSONObject("properties").toString());

					local_model = new RootModel(jsobj.getString("name") , jsobj.getString("apiVersion") , dat, properties, );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}