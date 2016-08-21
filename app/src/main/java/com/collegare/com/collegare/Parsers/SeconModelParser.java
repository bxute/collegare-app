import org.json.JSONException;
import org.json.JSONObject;

class SeconModelParser {

	MetightModelParser metight_parser = new MetightModelParser();
	ReactModelParser react_parser = new ReactModelParser();

	public SeconModelParser() {
	}

	public SeconModel parseSeconModel(String json_object) {

		SeconModel local_model = null;
		try {
			JSONObject jsobj = new JSONObject(json_object);

			MetightModel metight = metight_parser.parseMetightModel(jsobj.getJSONObject("metight").toString());

			ReactModel react = react_parser.parseReactModel(jsobj.getJSONObject("react").toString());

			local_model = new SeconModel(metight, react, );
		} catch (JSONException e) {

			e.printStackTrace();
		}

		return local_model;
	}
			
}