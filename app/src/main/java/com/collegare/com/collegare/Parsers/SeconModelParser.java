import org.json.JSONException;
import org.json.JSONObject;

class SeconModelParser {

	MetightModelParser metight_parser = new MetightModelParser();
	SeconModelParser secon_parser = new SeconModelParser();

	public SeconModelParser() {
	}

	public SeconModel parseSeconModel(String json_object) {

		SeconModel local_model = null;
		try {
			JSONObject jsobj = new JSONObject(json_object);

			MetightModel metight = metight_parser.parseMetightModel(jsobj.getJSONObject("metight").toString());

			SeconModel secon = secon_parser.parseSeconModel(jsobj.getJSONObject("secon").toString());

			local_model = new SeconModel(metight, secon, );
		} catch (JSONException e) {

			e.printStackTrace();
		}

		return local_model;
	}
			
}