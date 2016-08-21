import org.json.JSONException;
import org.json.JSONObject;

class SedModelParser {

    ContainerModelParser container_parser = new ContainerModelParser();

    public SedModelParser() {
    }

    public SedModel parseSedModel(String json_object) {

        SedModel local_model = null;
        try {
            JSONObject jsobj = new JSONObject(json_object);

            ContainerModel container = container_parser.parseContainerModel(jsobj.getJSONObject("container").toString());

            local_model = new SedModel(container, jsobj.getString("comment"), jsobj.getString("made"), jsobj.getString("sid"), jsobj.getInt("modelist"), jsobj.getString("tag"), );
        } catch (JSONException e) {

            e.printStackTrace();
        }

        return local_model;
    }

}