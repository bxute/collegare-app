import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import org.json.JSONArray;

class MenuModelParser {

		ItemsModelParser items_parser;

		public MenuModelParser() {
			items_parser = new ItemsModelParser();
		}

		public MenuModel parseMenuModel(String json_object) {

			MenuModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					ArrayList<ItemsModel> itemss = new ArrayList<>();
					JSONArray items_arr = jsobj.getJSONArray("items");
			
					for(int i = 0 ;i<items_arr.length();i++){

 						itemss.add(items_parser.parseItemsModel((String)items_arr.get(i)));

					}

					local_model = new MenuModel(itemss, jsobj.getString("header") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}