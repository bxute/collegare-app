import org.json.JSONException;
import org.json.JSONObject;

class CreatorEmailModelParser {


    public CreatorEmailModelParser() {
    }

    public CreatorEmailModel parseCreatorEmailModel(String json_object) {

        CreatorEmailModel local_model = null;
        try {
            JSONObject jsobj = new JSONObject(json_object);

            local_model = new CreatorEmailModel(jsobj.getString("email"), );
        } catch (JSONException e) {

            e.printStackTrace();
        }

        return local_model;
    }

}