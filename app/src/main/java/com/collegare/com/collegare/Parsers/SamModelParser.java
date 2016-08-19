import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import org.json.JSONArray;

class SamModelParser {

		ResModelParser res_parser;

		public SamModelParser() {
			res_parser = new ResModelParser();
		}

		public SamModel parseSamModel(String json_object) {

			SamModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					ArrayList<ResModel> ress = new ArrayList<>();
					JSONArray res_arr = jsobj.getJSONArray("res");
			
					for(int i = 0 ;i<res_arr.length();i++){

 						ress.add(res_parser.parseResModel((String)res_arr.get(i)));

					}

					local_model = new SamModel(ress, jsobj.getString("updated") , jsobj.getInt("itemsPerPage") , jsobj.getInt("totalItems") , jsobj.getInt("startIndex") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}