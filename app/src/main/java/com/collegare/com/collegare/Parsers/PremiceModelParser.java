import org.json.JSONException;
import org.json.JSONObject;

class PremiceModelParser {

    PricemModelParser pricem_parser = new PricemModelParser();
    TagerModelParser tager_parser = new TagerModelParser();
    SnippsModelParser snipps_parser = new SnippsModelParser();
    DepthModelParser depth_parser = new DepthModelParser();

    public PremiceModelParser() {
    }

    public PremiceModel parsePremiceModel(String json_object) {

        PremiceModel local_model = null;
        try {
            JSONObject jsobj = new JSONObject(json_object);

            PricemModel pricem = pricem_parser.parsePricemModel(jsobj.getJSONObject("pricem").toString());

            TagerModel tager = tager_parser.parseTagerModel(jsobj.getJSONObject("tager").toString());

            SnippsModel snipps = snipps_parser.parseSnippsModel(jsobj.getJSONObject("snipps").toString());

            DepthModel depth = depth_parser.parseDepthModel(jsobj.getJSONObject("depth").toString());

            local_model = new PremiceModel(pricem, tager, snipps, depth, );
        } catch (JSONException e) {

            e.printStackTrace();
        }

        return local_model;
    }

}