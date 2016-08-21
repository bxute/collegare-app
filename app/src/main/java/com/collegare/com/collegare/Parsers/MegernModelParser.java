import org.json.JSONException;
import org.json.JSONObject;

class MegernModelParser {


	public MegernModelParser() {
	}

	public MegernModel parseMegernModel(String json_object) {

		MegernModel local_model = null;
		try {
			JSONObject jsobj = new JSONObject(json_object);

			local_model = new MegernModel(jsobj.getString("videoRespond"), jsobj.getString("comment"), jsobj.getString("list"), jsobj.getString("embed"), jsobj.getString("aspectRatio"), );
		} catch (JSONException e) {

			e.printStackTrace();
		}

		return local_model;
	}
			
}