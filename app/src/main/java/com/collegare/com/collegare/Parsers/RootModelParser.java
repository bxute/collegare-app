import org.json.JSONException;
import org.json.JSONObject;

class RootModelParser {

		SignModelParser sign_parser = new SignModelParser();
		ConpentModelParser conpent_parser = new ConpentModelParser();

		public RootModelParser() {
		}

		public RootModel parseRootModel(String json_object) {

			RootModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					SignModel sign = sign_parser.parseSignModel(jsobj.getJSONObject("sign").toString());

					ConpentModel conpent = conpent_parser.parseConpentModel(jsobj.getJSONObject("conpent").toString());

					local_model = new RootModel(sign, jsobj.getString("set") , jsobj.getString("apiVersion") , conpent, );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}