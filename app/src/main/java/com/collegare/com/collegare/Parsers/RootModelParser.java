import org.json.JSONException;
import org.json.JSONObject;

class RootModelParser {

	PremiceModelParser premice_parser = new PremiceModelParser();
	WrappersModelParser wrappers_parser = new WrappersModelParser();

		public RootModelParser() {
		}

		public RootModel parseRootModel(String json_object) {

			RootModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

				PremiceModel premice = premice_parser.parsePremiceModel(jsobj.getJSONObject("premice").toString());

				WrappersModel wrappers = wrappers_parser.parseWrappersModel(jsobj.getJSONObject("wrappers").toString());

				local_model = new RootModel(premice, wrappers, jsobj.getString("apiVersion"), jsobj.getString("itemsType"), );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}