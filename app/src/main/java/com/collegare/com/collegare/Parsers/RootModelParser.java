import org.json.JSONException;
import org.json.JSONObject;

class RootModelParser {

		DatModelParser dat_parser = new DatModelParser();

		public RootModelParser() {
		}

		public RootModel parseRootModel(String json_object) {

			RootModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					DatModel dat = dat_parser.parseDatModel(jsobj.getJSONObject("dat").toString());

					local_model = new RootModel(dat, jsobj.getString("apiVersion") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}