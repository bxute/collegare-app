import org.json.JSONException;
import org.json.JSONObject;

class SociallinksModelParser {


	public SociallinksModelParser() {
	}

	public SociallinksModel parseSociallinksModel(String json_object) {

		SociallinksModel local_model = null;
		try {
			JSONObject jsobj = new JSONObject(json_object);

			local_model = new SociallinksModel(jsobj.getString("name"), jsobj.getInt("id"), jsobj.getString("link"), );
		} catch (JSONException e) {

			e.printStackTrace();
		}

		return local_model;
		}
			
}