import org.json.JSONException;
import org.json.JSONObject;

class ShockedModelParser {


	public ShockedModelParser() {
	}

	public ShockedModel parseShockedModel(String json_object) {

		ShockedModel local_model = null;
		try {
			JSONObject jsobj = new JSONObject(json_object);

			local_model = new ShockedModel(jsobj.getString("rate"), jsobj.getString("uploadedon"), jsobj.getString("commentVote"), jsobj.getString("id"), jsobj.getString("aspectRatio"), jsobj.getString("videoRespond"), jsobj.getString("embed"), jsobj.getString("list"), jsobj.getString("comment"), );
		} catch (JSONException e) {

			e.printStackTrace();
		}

		return local_model;
	}
			
}