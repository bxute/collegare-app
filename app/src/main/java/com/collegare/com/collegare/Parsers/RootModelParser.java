import org.json.JSONException;
import org.json.JSONObject;

class RootModelParser {

		WricModelParser wric_parser = new WricModelParser();
		PropertiesModelParser properties_parser = new PropertiesModelParser();

		public RootModelParser() {
		}

		public RootModel parseRootModel(String json_object) {

			RootModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					WricModel wric = wric_parser.parseWricModel(jsobj.getJSONObject("wric").toString());

					PropertiesModel properties = properties_parser.parsePropertiesModel(jsobj.getJSONObject("properties").toString());

					local_model = new RootModel(wric, jsobj.getString("name") , properties, jsobj.getString("apiVersion") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}