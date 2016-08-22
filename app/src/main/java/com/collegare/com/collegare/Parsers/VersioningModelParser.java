import org.json.JSONException;
import org.json.JSONObject;

class VersioningModelParser {


	public VersioningModelParser() {
	}

	public VersioningModel parseVersioningModel(String json_object) {

		VersioningModel local_model = null;
		try {
			JSONObject jsobj = new JSONObject(json_object);

			local_model = new VersioningModel(jsobj.getString("timezone"), jsobj.getInt("tracksver"), jsobj.getInt("eventver"), jsobj.getString("enddate"), jsobj.getString("privacy"), jsobj.getString("startdate"), );
		} catch (JSONException e) {

			e.printStackTrace();
		}

		return local_model;
	}
			
}