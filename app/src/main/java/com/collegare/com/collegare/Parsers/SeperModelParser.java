import org.json.JSONException;
import org.json.JSONObject;

class SeperModelParser {

    SoughModelParser sough_parser = new SoughModelParser();
    TightModelParser tight_parser = new TightModelParser();

    public SeperModelParser() {
    }

    public SeperModel parseSeperModel(String json_object) {

        SeperModel local_model = null;
        try {
            JSONObject jsobj = new JSONObject(json_object);

            SoughModel sough = sough_parser.parseSoughModel(jsobj.getJSONObject("sough").toString());

            TightModel tight = tight_parser.parseTightModel(jsobj.getJSONObject("tight").toString());

            local_model = new SeperModel(sough, tight, );
        } catch (JSONException e) {

            e.printStackTrace();
        }

        return local_model;
    }

}