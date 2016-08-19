import org.json.JSONException;
import org.json.JSONObject;

class RootModelParser {

		DataModelParser data_parser = new DataModelParser();

		public RootModelParser() {
		}

		public RootModel parseRootModel(String json_object) {

			RootModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					DataModel data = data_parser.parseDataModel(jsobj.getJSONObject("data").toString());

					local_model = new RootModel(data, jsobj.getString("apiVersion") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}