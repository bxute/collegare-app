import org.json.JSONException;
import org.json.JSONObject;

class VersionModelParser {


    public VersionModelParser() {
    }

    public VersionModel parseVersionModel(String json_object) {

        VersionModel local_model = null;
        try {
            JSONObject jsobj = new JSONObject(json_object);

            local_model = new VersionModel(jsobj.getString("holder"), jsobj.getString("holder_url"), jsobj.getString("licence_url"), jsobj.getInt("sessions_ver"), jsobj.getInt("microlocations_ver"), jsobj.getString("logo"), jsobj.getString("licence"), jsobj.getInt("event_ver"), jsobj.getInt("year"), );
        } catch (JSONException e) {

            e.printStackTrace();
        }

        return local_model;
    }

}