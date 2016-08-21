import org.json.JSONException;
import org.json.JSONObject;

class SeatModelParser {

    ComModelParser com_parser = new ComModelParser();
    MetightModelParser metight_parser = new MetightModelParser();

    public SeatModelParser() {
    }

    public SeatModel parseSeatModel(String json_object) {

        SeatModel local_model = null;
        try {
            JSONObject jsobj = new JSONObject(json_object);

            ComModel com = com_parser.parseComModel(jsobj.getJSONObject("com").toString());

            MetightModel metight = metight_parser.parseMetightModel(jsobj.getJSONObject("metight").toString());

            local_model = new SeatModel(com, metight, );
        } catch (JSONException e) {

            e.printStackTrace();
        }

        return local_model;
    }

}