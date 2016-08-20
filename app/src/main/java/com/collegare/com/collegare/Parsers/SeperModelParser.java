import org.json.JSONException;
import org.json.JSONObject;

class SeperModelParser {

	MetightModelParser metight_parser = new MetightModelParser();
	S_o_ughModelParser s_o_ugh_parser = new S_o_ughModelParser();

	public SeperModelParser() {
	}

	public SeperModel parseSeperModel(String json_object) {

		SeperModel local_model = null;
		try {
			JSONObject jsobj = new JSONObject(json_object);

			MetightModel metight = metight_parser.parseMetightModel(jsobj.getJSONObject("metight").toString());

			S_o_ughModel s_o_ugh = s_o_ugh_parser.parseS_o_ughModel(jsobj.getJSONObject("s_o_ugh").toString());

			local_model = new SeperModel(metight, s_o_ugh, );
		} catch (JSONException e) {

			e.printStackTrace();
		}

		return local_model;
	}
			
}