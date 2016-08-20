import org.json.JSONException;
import org.json.JSONObject;

class RootModelParser {

		SignModelParser sign_parser = new SignModelParser();
		WricModelParser wric_parser = new WricModelParser();

		public RootModelParser() {
		}

		public RootModel parseRootModel(String json_object) {

			RootModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					SignModel sign = sign_parser.parseSignModel(jsobj.getJSONObject("sign").toString());

					WricModel wric = wric_parser.parseWricModel(jsobj.getJSONObject("wric").toString());

					local_model = new RootModel(jsobj.getString("apiVersion") , sign, jsobj.getString("set") , wric, );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}