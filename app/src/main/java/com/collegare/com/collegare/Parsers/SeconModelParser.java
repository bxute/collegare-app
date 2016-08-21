import org.json.JSONException;
import org.json.JSONObject;

class SeconModelParser {

	ReactModelParser react_parser = new ReactModelParser();
	MetightModelParser metight_parser = new MetightModelParser();

	public SeconModelParser() {
	}

	public SeconModel parseSeconModel(String json_object) {

		SeconModel local_model = null;
		try {
			JSONObject jsobj = new JSONObject(json_object);

			ReactModel react = react_parser.parseReactModel(jsobj.getJSONObject("react").toString());

			MetightModel metight = metight_parser.parseMetightModel(jsobj.getJSONObject("metight").toString());

			local_model = new SeconModel(react, metight, );
		} catch (JSONException e) {

			e.printStackTrace();
		}

		return local_model;
	}
			
}