import org.json.JSONException;
import org.json.JSONObject;

class FlxwmModelParser {

	CopModelParser cop_parser = new CopModelParser();
	Call_for_papersModelParser call_for_papers_parser = new Call_for_papersModelParser();

	public FlxwmModelParser() {
	}

	public FlxwmModel parseFlxwmModel(String json_object) {

		FlxwmModel local_model = null;
		try {
			JSONObject jsobj = new JSONObject(json_object);

			CopModel cop = cop_parser.parseCopModel(jsobj.getJSONObject("cop").toString());

			Call_for_papersModel call_for_papers = call_for_papers_parser.parseCall_for_papersModel(jsobj.getJSONObject("call_for_papers").toString());

			local_model = new FlxwmModel(cop, jsobj.getString("code_of_conduct"), jsobj.getString("background_image"), call_for_papers, );
		} catch (JSONException e) {

			e.printStackTrace();
		}

		return local_model;
	}
			
}