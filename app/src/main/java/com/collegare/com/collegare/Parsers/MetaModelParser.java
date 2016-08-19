import org.json.JSONException;
import org.json.JSONObject;

class MetaModelParser {


		public MetaModelParser() {
		}

		public MetaModel parseMetaModel(String json_object) {

			MetaModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					local_model = new MetaModel(jsobj.getString("result_type") , jsobj.getInt("recent_retweets") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}