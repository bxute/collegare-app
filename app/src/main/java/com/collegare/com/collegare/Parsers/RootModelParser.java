import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import org.json.JSONArray;

class RootModelParser {

		RestModelParser rest_parser;
		RestdataModelParser restdata_parser = new RestdataModelParser();

		public RootModelParser() {
			rest_parser = new RestModelParser();
		}

		public RootModel parseRootModel(String json_object) {

			RootModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					ArrayList<RestModel> rests = new ArrayList<>();
					JSONArray rest_arr = jsobj.getJSONArray("rest");
			
					for(int i = 0 ;i<rest_arr.length();i++){

 						rests.add(rest_parser.parseRestModel((String)rest_arr.get(i)));

					}

					RestdataModel restdata = restdata_parser.parseRestdataModel(jsobj.getJSONObject("restdata").toString());

					local_model = new RootModel(rests, jsobj.getString("firstName") , jsobj.getInt("age") , jsobj.getString("lastName") , restdata, );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}