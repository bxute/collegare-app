import org.json.JSONException;
import org.json.JSONObject;

class SeconModelParser {

	SeconModelParser secon_parser = new SeconModelParser();
	MetightModelParser metight_parser = new MetightModelParser();

	public SeconModelParser() {
	}

	public SeconModel parseSeconModel(String json_object) {

		SeconModel local_model = null;
		try {
			JSONObject jsobj = new JSONObject(json_object);

			SeconModel secon = secon_parser.parseSeconModel(jsobj.getJSONObject("secon").toString());

			MetightModel metight = metight_parser.parseMetightModel(jsobj.getJSONObject("metight").toString());

			local_model = new SeconModel(secon, metight, );
		} catch (JSONException e) {

			e.printStackTrace();
		}

		return local_model;
	}
			
}