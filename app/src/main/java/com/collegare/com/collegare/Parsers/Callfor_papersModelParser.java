import org.json.JSONException;
import org.json.JSONObject;

class Callfor_papersModelParser {


	public Callfor_papersModelParser() {
	}

	public Callfor_papersModel parseCallfor_papersModel(String json_object) {

		Callfor_papersModel local_model = null;
		try {
			JSONObject jsobj = new JSONObject(json_object);

			local_model = new Callfor_papersModel(jsobj.getString("privacy"), jsobj.getString("announcement"), jsobj.getString("start_date"), jsobj.getString("end_date"), jsobj.getString("timezone"), );
		} catch (JSONException e) {

			e.printStackTrace();
		}

		return local_model;
	}
			
}