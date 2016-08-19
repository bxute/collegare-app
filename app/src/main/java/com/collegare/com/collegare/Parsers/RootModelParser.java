import org.json.JSONException;
import org.json.JSONObject;

class RootModelParser {

		PropertiesModelParser properties_parser = new PropertiesModelParser();
		WricModelParser wric_parser = new WricModelParser();

		public RootModelParser() {
		}

		public RootModel parseRootModel(String json_object) {

			RootModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					PropertiesModel properties = properties_parser.parsePropertiesModel(jsobj.getJSONObject("properties").toString());

					WricModel wric = wric_parser.parseWricModel(jsobj.getJSONObject("wric").toString());

					local_model = new RootModel(properties, jsobj.getString("name") , wric, jsobj.getString("apiVersion") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}