import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import org.json.JSONArray;

class DatModelParser {

		SoldModelParser sold_parser;

		public DatModelParser() {
			sold_parser = new SoldModelParser();
		}

		public DatModel parseDatModel(String json_object) {

			DatModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					ArrayList<SoldModel> solds = new ArrayList<>();
					JSONArray sold_arr = jsobj.getJSONArray("sold");
			
					for(int i = 0 ;i<sold_arr.length();i++){

 						solds.add(sold_parser.parseSoldModel((String)sold_arr.get(i)));

					}

					local_model = new DatModel(jsobj.getInt("itemsPerPage") , jsobj.getString("updated") , solds, );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}