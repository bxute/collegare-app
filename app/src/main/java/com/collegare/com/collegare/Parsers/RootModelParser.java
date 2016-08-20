import org.json.JSONException;
import org.json.JSONObject;

class RootModelParser {

		SignModelParser sign_parser = new SignModelParser();
		CounlModelParser counl_parser = new CounlModelParser();

		public RootModelParser() {
		}

		public RootModel parseRootModel(String json_object) {

			RootModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					SignModel sign = sign_parser.parseSignModel(jsobj.getJSONObject("sign").toString());

					CounlModel counl = counl_parser.parseCounlModel(jsobj.getJSONObject("counl").toString());

					local_model = new RootModel(sign, counl, jsobj.getString("set") , jsobj.getString("apiVersion") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}