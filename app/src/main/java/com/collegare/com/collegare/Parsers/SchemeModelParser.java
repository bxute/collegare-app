import org.json.JSONException;
import org.json.JSONObject;

class SchemeModelParser {


	public SchemeModelParser() {
	}

	public SchemeModel parseSchemeModel(String json_object) {

		SchemeModel local_model = null;
		try {
			JSONObject jsobj = new JSONObject(json_object);

			local_model = new SchemeModel(jsobj.getString("aspectRatio"), jsobj.getString("reason"), jsobj.getString("title"), );
		} catch (JSONException e) {

			e.printStackTrace();
		}

		return local_model;
	}
			
}