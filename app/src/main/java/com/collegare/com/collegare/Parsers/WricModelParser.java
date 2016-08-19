import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import org.json.JSONArray;

class WricModelParser {

		ExsodeModelParser exsode_parser;

		public WricModelParser() {
			exsode_parser = new ExsodeModelParser();
		}

		public WricModel parseWricModel(String json_object) {

			WricModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					ArrayList<ExsodeModel> exsodes = new ArrayList<>();
					JSONArray exsode_arr = jsobj.getJSONArray("exsode");
			
					for(int i = 0 ;i<exsode_arr.length();i++){

 						exsodes.add(exsode_parser.parseExsodeModel((String)exsode_arr.get(i)));

					}

					local_model = new WricModel(exsodes, jsobj.getString("updated") , jsobj.getInt("itemsPerPage") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}