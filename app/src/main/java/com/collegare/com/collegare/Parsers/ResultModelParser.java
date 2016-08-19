import org.json.JSONException;
import org.json.JSONObject;

class ResultModelParser {

		MetaModelParser meta_parser = new MetaModelParser();

		public ResultModelParser() {
		}

		public ResultModel parseResultModel(String json_object) {

			ResultModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					MetaModel meta = meta_parser.parseMetaModel(jsobj.getJSONObject("meta").toString());

					local_model = new ResultModel(jsobj.getString("to_user") , jsobj.getString("from_user") , jsobj.getString("text") , jsobj.getInt("to_user_id") , meta, );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}