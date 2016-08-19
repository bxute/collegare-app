import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import org.json.JSONArray;

class WrimModelParser {

		SoldModelParser sold_parser;

		public WrimModelParser() {
			sold_parser = new SoldModelParser();
		}

		public WrimModel parseWrimModel(String json_object) {

			WrimModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					ArrayList<SoldModel> solds = new ArrayList<>();
					JSONArray sold_arr = jsobj.getJSONArray("sold");
			
					for(int i = 0 ;i<sold_arr.length();i++){

 						solds.add(sold_parser.parseSoldModel((String)sold_arr.get(i)));

					}

					local_model = new WrimModel(solds, jsobj.getString("updated") , jsobj.getInt("itemsPerPage") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}