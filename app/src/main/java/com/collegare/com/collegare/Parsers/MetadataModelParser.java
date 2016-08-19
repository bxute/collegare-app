import org.json.JSONException;
import org.json.JSONObject;

class MetadataModelParser {


		public MetadataModelParser() {
		}

		public MetadataModel parseMetadataModel(String json_object) {

			MetadataModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					local_model = new MetadataModel(jsobj.getString("result_type") , jsobj.getInt("recent_retweets") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}