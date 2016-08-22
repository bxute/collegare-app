import org.json.JSONException;
import org.json.JSONObject;

class SociallinksModelParser {

	Call_for_papersModelParser call_for_papers_parser = new Call_for_papersModelParser();

	public SociallinksModelParser() {
	}

	public SociallinksModel parseSociallinksModel(String json_object) {

		SociallinksModel local_model = null;
		try {
			JSONObject jsobj = new JSONObject(json_object);

			Call_for_papersModel call_for_papers = call_for_papers_parser.parseCall_for_papersModel(jsobj.getJSONObject("call_for_papers").toString());

			local_model = new SociallinksModel(jsobj.getInt("id"), call_for_papers, );
		} catch (JSONException e) {

			e.printStackTrace();
		}

		return local_model;
	}
			
}