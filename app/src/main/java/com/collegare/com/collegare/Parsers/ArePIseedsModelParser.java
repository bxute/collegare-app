import org.json.JSONException;
import org.json.JSONObject;

class ArePIseedsModelParser {


    public ArePIseedsModelParser() {
    }

    public ArePIseedsModel parseArePIseedsModel(String json_object) {

        ArePIseedsModel local_model = null;
        try {
            JSONObject jsobj = new JSONObject(json_object);

            local_model = new ArePIseedsModel(jsobj.getString("default"), );
        } catch (JSONException e) {

            e.printStackTrace();
        }

        return local_model;
    }

}