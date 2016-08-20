import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import org.json.JSONArray;

class WricModelParser {

		RedemeModelParser redeme_parser;

		public WricModelParser() {
			redeme_parser = new RedemeModelParser();
		}

		public WricModel parseWricModel(String json_object) {

			WricModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					ArrayList<RedemeModel> redemes = new ArrayList<>();
					JSONArray redeme_arr = jsobj.getJSONArray("redeme");
			
					for(int i = 0 ;i<redeme_arr.length();i++){

 						redemes.add(redeme_parser.parseRedemeModel((String)redeme_arr.get(i)));

					}

					local_model = new WricModel(jsobj.getString("updated") , jsobj.getInt("itemsPerPage") , redemes, );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}