import org.json.JSONException;
import org.json.JSONObject;

class SeatModelParser {

	MetightModelParser metight_parser = new MetightModelParser();
	ComModelParser com_parser = new ComModelParser();

	public SeatModelParser() {
	}

	public SeatModel parseSeatModel(String json_object) {

		SeatModel local_model = null;
		try {
			JSONObject jsobj = new JSONObject(json_object);

			MetightModel metight = metight_parser.parseMetightModel(jsobj.getJSONObject("metight").toString());

			ComModel com = com_parser.parseComModel(jsobj.getJSONObject("com").toString());

			local_model = new SeatModel(metight, com, );
		} catch (JSONException e) {

			e.printStackTrace();
		}

		return local_model;
	}
			
}