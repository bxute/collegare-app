import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import org.json.JSONArray;

class RestModelParser {

		Id_toModelParser id_to_parser = new Id_toModelParser();
		RastModelParser rast_parser;

		public RestModelParser() {
			rast_parser = new RastModelParser();
		}

		public RestModel parseRestModel(String json_object) {

			RestModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					Id_toModel id_to = id_to_parser.parseId_toModel(jsobj.getJSONObject("id_to").toString());

					ArrayList<RastModel> rasts = new ArrayList<>();
					JSONArray rast_arr = jsobj.getJSONArray("rast");
			
					for(int i = 0 ;i<rast_arr.length();i++){

 						rasts.add(rast_parser.parseRastModel((String)rast_arr.get(i)));

					}

					local_model = new RestModel(jsobj.getString("id_frome") , id_to, jsobj.getString("created_time") , jsobj.getString("updated_time") , rasts, jsobj.getString("type") , jsobj.getString("means") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}