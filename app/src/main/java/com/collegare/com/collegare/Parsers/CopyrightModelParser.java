import org.json.JSONException;
import org.json.JSONObject;

class CopyrightModelParser {


		public CopyrightModelParser() {
		}

		public CopyrightModel parseCopyrightModel(String json_object) {

			CopyrightModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					local_model = new CopyrightModel(jsobj.getString("licence_url") , jsobj.getInt("year") , jsobj.getString("licence") , jsobj.getString("logo") , jsobj.getString("holder") , jsobj.getString("holder_url") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}