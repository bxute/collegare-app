import org.json.JSONException;
import org.json.JSONObject;

class RootModelParser {

		SeperModelParser seper_parser = new SeperModelParser();
	CounlModelParser counl_parser = new CounlModelParser();

		public RootModelParser() {
		}

		public RootModel parseRootModel(String json_object) {

			RootModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					SeperModel seper = seper_parser.parseSeperModel(jsobj.getJSONObject("seper").toString());

				CounlModel counl = counl_parser.parseCounlModel(jsobj.getJSONObject("counl").toString());

				local_model = new RootModel(jsobj.getString("set"), seper, jsobj.getString("apiVersion"), counl, );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}