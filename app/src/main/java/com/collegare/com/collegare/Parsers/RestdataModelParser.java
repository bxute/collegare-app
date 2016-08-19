import org.json.JSONException;
import org.json.JSONObject;

class RestdataModelParser {

		MetadataModelParser metadata_parser = new MetadataModelParser();

		public RestdataModelParser() {
		}

		public RestdataModel parseRestdataModel(String json_object) {

			RestdataModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					MetadataModel metadata = metadata_parser.parseMetadataModel(jsobj.getJSONObject("metadata").toString());

					local_model = new RestdataModel(jsobj.getString("text") , jsobj.getString("from_user") , jsobj.getString("to_user") , jsobj.getInt("to_user_id") , metadata, );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}