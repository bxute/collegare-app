import org.json.JSONException;
import org.json.JSONObject;

class RootModelParser {

		CounlModelParser counl_parser = new CounlModelParser();
		SeperModelParser seper_parser = new SeperModelParser();

		public RootModelParser() {
		}

		public RootModel parseRootModel(String json_object) {

			RootModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					CounlModel counl = counl_parser.parseCounlModel(jsobj.getJSONObject("counl").toString());

					SeperModel seper = seper_parser.parseSeperModel(jsobj.getJSONObject("seper").toString());

					local_model = new RootModel(jsobj.getString("apiVersion") , counl, jsobj.getString("set") , seper, );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}