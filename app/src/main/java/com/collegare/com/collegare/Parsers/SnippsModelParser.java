import org.json.JSONException;
import org.json.JSONObject;

class SnippsModelParser {

    DesModelParser des_parser = new DesModelParser();

    public SnippsModelParser() {
    }

    public SnippsModel parseSnippsModel(String json_object) {

        SnippsModel local_model = null;
        try {
            JSONObject jsobj = new JSONObject(json_object);

            DesModel des = des_parser.parseDesModel(jsobj.getJSONObject("des").toString());

            local_model = new SnippsModel(jsobj.getBoolean("required"), des, jsobj.getString("type"), jsobj.getString("description"), );
        } catch (JSONException e) {

            e.printStackTrace();
        }

        return local_model;
    }

}