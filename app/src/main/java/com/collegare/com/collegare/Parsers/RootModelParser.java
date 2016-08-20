import org.json.JSONException;
import org.json.JSONObject;

class RootModelParser {

		WrimModelParser wrim_parser = new WrimModelParser();
		SignModelParser sign_parser = new SignModelParser();

		public RootModelParser() {
		}

		public RootModel parseRootModel(String json_object) {

			RootModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					WrimModel wrim = wrim_parser.parseWrimModel(jsobj.getJSONObject("wrim").toString());

					SignModel sign = sign_parser.parseSignModel(jsobj.getJSONObject("sign").toString());

					local_model = new RootModel(jsobj.getString("apiVersion") , wrim, sign, jsobj.getString("set") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}