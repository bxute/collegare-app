import org.json.JSONException;
import org.json.JSONObject;

class RootModelParser {

		WricModelParser wric_parser = new WricModelParser();
		SignModelParser sign_parser = new SignModelParser();

		public RootModelParser() {
		}

		public RootModel parseRootModel(String json_object) {

			RootModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					WricModel wric = wric_parser.parseWricModel(jsobj.getJSONObject("wric").toString());

					SignModel sign = sign_parser.parseSignModel(jsobj.getJSONObject("sign").toString());

					local_model = new RootModel(wric, jsobj.getString("apiVersion") , jsobj.getString("set") , sign, );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}