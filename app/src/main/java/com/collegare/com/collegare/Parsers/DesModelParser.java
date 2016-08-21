import org.json.JSONException;
import org.json.JSONObject;

class DesModelParser {

    ComplianceModelParser compliance_parser = new ComplianceModelParser();

    public DesModelParser() {
    }

    public DesModel parseDesModel(String json_object) {

        DesModel local_model = null;
        try {
            JSONObject jsobj = new JSONObject(json_object);

            ComplianceModel compliance = compliance_parser.parseComplianceModel(jsobj.getJSONObject("compliance").toString());

            local_model = new DesModel(jsobj.getBoolean("required"), compliance, jsobj.getString("type"), jsobj.getString("description"), );
        } catch (JSONException e) {

            e.printStackTrace();
        }

        return local_model;
    }

}