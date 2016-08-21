import org.json.JSONException;
import org.json.JSONObject;

class ThetaModelParser {


    public ThetaModelParser() {
    }

    public ThetaModel parseThetaModel(String json_object) {

        ThetaModel local_model = null;
        try {
            JSONObject jsobj = new JSONObject(json_object);

            local_model = new ThetaModel(jsobj.getString("ackn"), jsobj.getString("hqDeep"), );
        } catch (JSONException e) {

            e.printStackTrace();
        }

        return local_model;
    }

}