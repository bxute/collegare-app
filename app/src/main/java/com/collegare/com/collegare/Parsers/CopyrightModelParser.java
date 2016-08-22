import org.json.JSONException;
import org.json.JSONObject;

class CopyrightModelParser {

	Call_for_papersModelParser call_for_papers_parser = new Call_for_papersModelParser();

	public CopyrightModelParser() {
	}

	public CopyrightModel parseCopyrightModel(String json_object) {

		CopyrightModel local_model = null;
		try {
			JSONObject jsobj = new JSONObject(json_object);

			Call_for_papersModel call_for_papers = call_for_papers_parser.parseCall_for_papersModel(jsobj.getJSONObject("call_for_papers").toString());

			local_model = new CopyrightModel(jsobj.getString("holder"), jsobj.getString("licence_url"), jsobj.getInt("year"), jsobj.getString("end_time"), jsobj.getString("licence"), jsobj.getString("holder_url"), call_for_papers, jsobj.getString("email"), jsobj.getString("logo"), jsobj.getInt("id"), );
		} catch (JSONException e) {

			e.printStackTrace();
		}

		return local_model;
	}
			
}