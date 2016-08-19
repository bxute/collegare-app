import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import org.json.JSONArray;

class DatModelParser {

		ItemModelParser item_parser;

		public DatModelParser() {
			item_parser = new ItemModelParser();
		}

		public DatModel parseDatModel(String json_object) {

			DatModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					ArrayList<ItemModel> items = new ArrayList<>();
					JSONArray item_arr = jsobj.getJSONArray("item");
			
					for(int i = 0 ;i<item_arr.length();i++){

 						items.add(item_parser.parseItemModel((String)item_arr.get(i)));

					}

					local_model = new DatModel(jsobj.getString("updated") , items, jsobj.getInt("itemsPerPage") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}