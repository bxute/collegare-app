import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import org.json.JSONArray;

class WrimModelParser {

		RedeModelParser rede_parser;

		public WrimModelParser() {
			rede_parser = new RedeModelParser();
		}

		public WrimModel parseWrimModel(String json_object) {

			WrimModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					ArrayList<RedeModel> redes = new ArrayList<>();
					JSONArray rede_arr = jsobj.getJSONArray("rede");
			
					for(int i = 0 ;i<rede_arr.length();i++){

 						redes.add(rede_parser.parseRedeModel((String)rede_arr.get(i)));

					}

					local_model = new WrimModel(jsobj.getInt("itemsPerPage") , jsobj.getString("updated") , redes, );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}