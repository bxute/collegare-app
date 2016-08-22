import org.json.JSONException;
import org.json.JSONObject;

class FlxwmModelParser {

    Call_for_papersModelParser call_for_papers_parser = new Call_for_papersModelParser();
    CopModelParser cop_parser = new CopModelParser();

    public FlxwmModelParser() {
    }

    public FlxwmModel parseFlxwmModel(String json_object) {

        FlxwmModel local_model = null;
        try {
            JSONObject jsobj = new JSONObject(json_object);

            Call_for_papersModel call_for_papers = call_for_papers_parser.parseCall_for_papersModel(jsobj.getJSONObject("call_for_papers").toString());

            CopModel cop = cop_parser.parseCopModel(jsobj.getJSONObject("cop").toString());

            local_model = new FlxwmModel(call_for_papers, jsobj.getString("background_image"), jsobj.getString("code_of_conduct"), cop, );
        } catch (JSONException e) {

            e.printStackTrace();
        }

        return local_model;
    }

}