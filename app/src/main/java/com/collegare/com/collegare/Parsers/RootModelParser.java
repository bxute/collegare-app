import org.json.JSONException;
import org.json.JSONObject;

class RootModelParser {

		ConpentModelParser conpent_parser = new ConpentModelParser();
		SignModelParser sign_parser = new SignModelParser();

		public RootModelParser() {
		}

		public RootModel parseRootModel(String json_object) {

			RootModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					ConpentModel conpent = conpent_parser.parseConpentModel(jsobj.getJSONObject("conpent").toString());

					SignModel sign = sign_parser.parseSignModel(jsobj.getJSONObject("sign").toString());

					local_model = new RootModel(jsobj.getString("set") , conpent, sign, jsobj.getString("apiVersion") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}