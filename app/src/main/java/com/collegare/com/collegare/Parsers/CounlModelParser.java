import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import org.json.JSONArray;

class CounlModelParser {

		RedeModelParser rede_parser;

		public CounlModelParser() {
			rede_parser = new RedeModelParser();
		}

		public CounlModel parseCounlModel(String json_object) {

			CounlModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					ArrayList<RedeModel> redes = new ArrayList<>();
					JSONArray rede_arr = jsobj.getJSONArray("rede");
			
					for(int i = 0 ;i<rede_arr.length();i++){

 						redes.add(rede_parser.parseRedeModel((String)rede_arr.get(i)));

					}

					local_model = new CounlModel(jsobj.getInt("itemsPerPage") , jsobj.getString("updated") , redes, );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}