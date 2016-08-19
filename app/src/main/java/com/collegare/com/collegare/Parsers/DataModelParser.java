import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import org.json.JSONArray;

class DataModelParser {

		ItemsModelParser items_parser;

		public DataModelParser() {
			items_parser = new ItemsModelParser();
		}

		public DataModel parseDataModel(String json_object) {

			DataModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					ArrayList<ItemsModel> itemss = new ArrayList<>();
					JSONArray items_arr = jsobj.getJSONArray("items");
			
					for(int i = 0 ;i<items_arr.length();i++){

 						itemss.add(items_parser.parseItemsModel((String)items_arr.get(i)));

					}

					local_model = new DataModel(jsobj.getInt("startIndex") , jsobj.getInt("totalItems") , itemss, jsobj.getInt("itemsPerPage") , jsobj.getString("updated") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}