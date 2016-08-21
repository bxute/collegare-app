import org.json.JSONException;
import org.json.JSONObject;

class RomeModelParser {


	public RomeModelParser() {
	}

	public RomeModel parseRomeModel(String json_object) {

		RomeModel local_model = null;
		try {
			JSONObject jsobj = new JSONObject(json_object);

			local_model = new RomeModel(jsobj.getString("type"), jsobj.getString("uploadedby"), jsobj.getInt("viewCount"), jsobj.getString("updatedon"), jsobj.getInt("favoriteCount"), );
		} catch (JSONException e) {

			e.printStackTrace();
		}

		return local_model;
	}
			
}