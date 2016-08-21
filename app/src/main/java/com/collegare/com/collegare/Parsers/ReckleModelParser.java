import org.json.JSONException;
import org.json.JSONObject;

class ReckleModelParser {

    ThetaModelParser theta_parser = new ThetaModelParser();
    SedModelParser sed_parser = new SedModelParser();
    ContestNoModelParser contestNo_parser = new ContestNoModelParser();
    AdeesModelParser adees_parser = new AdeesModelParser();
    ArePIseedsModelParser arePIseeds_parser = new ArePIseedsModelParser();

    public ReckleModelParser() {
    }

    public ReckleModel parseReckleModel(String json_object) {

        ReckleModel local_model = null;
        try {
            JSONObject jsobj = new JSONObject(json_object);

            ThetaModel theta = theta_parser.parseThetaModel(jsobj.getJSONObject("theta").toString());

            SedModel sed = sed_parser.parseSedModel(jsobj.getJSONObject("sed").toString());

            ContestNoModel contestNo = contestNo_parser.parseContestNoModel(jsobj.getJSONObject("contestNo").toString());

            AdeesModel adees = adees_parser.parseAdeesModel(jsobj.getJSONObject("adees").toString());

            ArePIseedsModel arePIseeds = arePIseeds_parser.parseArePIseedsModel(jsobj.getJSONObject("arePIseeds").toString());

            local_model = new ReckleModel(theta, jsobj.getInt("commentCount"), jsobj.getString("_repe"), sed, contestNo, adees, arePIseeds, );
        } catch (JSONException e) {

            e.printStackTrace();
        }

        return local_model;
    }

}