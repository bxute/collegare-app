import org.json.JSONException;
import org.json.JSONObject;

class RootModelParser {

		SignModelParser sign_parser = new SignModelParser();
		WrimModelParser wrim_parser = new WrimModelParser();

		public RootModelParser() {
		}

		public RootModel parseRootModel(String json_object) {

			RootModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					SignModel sign = sign_parser.parseSignModel(jsobj.getJSONObject("sign").toString());

					WrimModel wrim = wrim_parser.parseWrimModel(jsobj.getJSONObject("wrim").toString());

					local_model = new RootModel(sign, jsobj.getString("set") , wrim, jsobj.getString("apiVersion") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}