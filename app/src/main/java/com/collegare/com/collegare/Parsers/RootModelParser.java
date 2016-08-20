import org.json.JSONException;
import org.json.JSONObject;

class RootModelParser {

		CounlModelParser counl_parser = new CounlModelParser();
		SignModelParser sign_parser = new SignModelParser();

		public RootModelParser() {
		}

		public RootModel parseRootModel(String json_object) {

			RootModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					CounlModel counl = counl_parser.parseCounlModel(jsobj.getJSONObject("counl").toString());

					SignModel sign = sign_parser.parseSignModel(jsobj.getJSONObject("sign").toString());

				local_model = new RootModel(jsobj.getString("set"), counl, jsobj.getString("apiVersion"), sign, );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}