import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import org.json.JSONArray;

class RootModelParser {

		ResultModelParser result_parser = new ResultModelParser();
		RepalerModelParser repaler_parser;

		public RootModelParser() {
			repaler_parser = new RepalerModelParser();
		}

		public RootModel parseRootModel(String json_object) {

			RootModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					ResultModel result = result_parser.parseResultModel(jsobj.getJSONObject("result").toString());

					ArrayList<RepalerModel> repalers = new ArrayList<>();
					JSONArray repaler_arr = jsobj.getJSONArray("repaler");
			
					for(int i = 0 ;i<repaler_arr.length();i++){

 						repalers.add(repaler_parser.parseRepalerModel((String)repaler_arr.get(i)));

					}

					local_model = new RootModel(result, repalers, );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}