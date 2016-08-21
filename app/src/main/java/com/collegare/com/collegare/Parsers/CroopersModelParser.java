import org.json.JSONException;
import org.json.JSONObject;

class CroopersModelParser {


    public CroopersModelParser() {
    }

    public CroopersModel parseCroopersModel(String json_object) {

        CroopersModel local_model = null;
        try {
            JSONObject jsobj = new JSONObject(json_object);

            local_model = new CroopersModel(jsobj.getString("6"), jsobj.getString("1"), jsobj.getString("5"), );
        } catch (JSONException e) {

            e.printStackTrace();
        }

        return local_model;
    }

}