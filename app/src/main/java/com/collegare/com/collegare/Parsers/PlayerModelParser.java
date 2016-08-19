import org.json.JSONException;
import org.json.JSONObject;

class PlayerModelParser {


		public PlayerModelParser() {
		}

		public PlayerModel parsePlayerModel(String json_object) {

			PlayerModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					local_model = new PlayerModel(jsobj.getString("default") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}