import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import org.json.JSONArray;

class WricModelParser {

		RedeModelParser rede_parser;

		public WricModelParser() {
			rede_parser = new RedeModelParser();
		}

		public WricModel parseWricModel(String json_object) {

			WricModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					ArrayList<RedeModel> redes = new ArrayList<>();
					JSONArray rede_arr = jsobj.getJSONArray("rede");
			
					for(int i = 0 ;i<rede_arr.length();i++){

 						redes.add(rede_parser.parseRedeModel((String)rede_arr.get(i)));

					}

					local_model = new WricModel(jsobj.getString("updated") , jsobj.getInt("itemsPerPage") , redes, );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}