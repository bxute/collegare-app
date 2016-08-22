import org.json.JSONException;
import org.json.JSONObject;

class CopyrightModelParser {

	Callfor_papersModelParser callfor_papers_parser = new Callfor_papersModelParser();

	public CopyrightModelParser() {
	}

	public CopyrightModel parseCopyrightModel(String json_object) {

		CopyrightModel local_model = null;
		try {
			JSONObject jsobj = new JSONObject(json_object);

			Callfor_papersModel callfor_papers = callfor_papers_parser.parseCallfor_papersModel(jsobj.getJSONObject("callfor_papers").toString());

			local_model = new CopyrightModel(jsobj.getString("licence_url"), jsobj.getString("licence"), jsobj.getString("holder_url"), jsobj.getString("holdon"), jsobj.getString("email"), callfor_papers, jsobj.getInt("year"), jsobj.getString("endtime"), jsobj.getString("logo"), jsobj.getInt("extem"), );
		} catch (JSONException e) {

			e.printStackTrace();
		}

		return local_model;
		}
			
}