import org.json.JSONException;
import org.json.JSONObject;

class SeperModelParser {

	SrimModelParser srim_parser = new SrimModelParser();
	MetightModelParser metight_parser = new MetightModelParser();

	public SeperModelParser() {
	}

	public SeperModel parseSeperModel(String json_object) {

		SeperModel local_model = null;
		try {
			JSONObject jsobj = new JSONObject(json_object);

			SrimModel srim = srim_parser.parseSrimModel(jsobj.getJSONObject("srim").toString());

			MetightModel metight = metight_parser.parseMetightModel(jsobj.getJSONObject("metight").toString());

			local_model = new SeperModel(srim, metight, );
		} catch (JSONException e) {

			e.printStackTrace();
		}

		return local_model;
	}
			
}