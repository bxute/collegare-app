import org.json.JSONException;
import org.json.JSONObject;

class RootModelParser {

		PropertiesModelParser properties_parser = new PropertiesModelParser();
		WrimModelParser wrim_parser = new WrimModelParser();

		public RootModelParser() {
		}

		public RootModel parseRootModel(String json_object) {

			RootModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					PropertiesModel properties = properties_parser.parsePropertiesModel(jsobj.getJSONObject("properties").toString());

					WrimModel wrim = wrim_parser.parseWrimModel(jsobj.getJSONObject("wrim").toString());

					local_model = new RootModel(properties, jsobj.getString("apiVersion") , jsobj.getString("name") , wrim, );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}