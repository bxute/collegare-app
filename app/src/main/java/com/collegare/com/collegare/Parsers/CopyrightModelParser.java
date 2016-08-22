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

			local_model = new CopyrightModel(jsobj.getString("email"), jsobj.getString("logo"), jsobj.getInt("year"), callfor_papers, jsobj.getString("endtime"), jsobj.getString("holdon"), jsobj.getInt("extem"), jsobj.getString("licence"), jsobj.getString("licence_url"), jsobj.getString("holder_url"), );
		} catch (JSONException e) {

			e.printStackTrace();
		}

		return local_model;
		}
			
}