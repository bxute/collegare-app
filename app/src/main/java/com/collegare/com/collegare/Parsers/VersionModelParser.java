import org.json.JSONException;
import org.json.JSONObject;

class VersionModelParser {


	public VersionModelParser() {
	}

	public VersionModel parseVersionModel(String json_object) {

		VersionModel local_model = null;
		try {
			JSONObject jsobj = new JSONObject(json_object);

			local_model = new VersionModel(jsobj.getInt("event_ver"), jsobj.getString("logo"), jsobj.getInt("year"), jsobj.getInt("microlocations_ver"), jsobj.getString("holder"), jsobj.getString("licence"), jsobj.getInt("sessions_ver"), jsobj.getString("holder_url"), jsobj.getString("licence_url"), );
		} catch (JSONException e) {

			e.printStackTrace();
		}

		return local_model;
	}
			
}