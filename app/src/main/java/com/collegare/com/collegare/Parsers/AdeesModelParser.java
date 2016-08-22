import org.json.JSONException;
import org.json.JSONObject;

class AdeesModelParser {

	ContentModelParser content_parser = new ContentModelParser();

	public AdeesModelParser() {
	}

	public AdeesModel parseAdeesModel(String json_object) {

		AdeesModel local_model = null;
		try {
			JSONObject jsobj = new JSONObject(json_object);

			ContentModel content = content_parser.parseContentModel(jsobj.getJSONObject("content").toString());

			local_model = new AdeesModel(jsobj.getString("com"), jsobj.getString("reasonads"), jsobj.getInt("duration"), jsobj.getString("list"), content, jsobj.getString("aspectRatio"), jsobj.getString("videoRespond"), jsobj.getString("value"), );
		} catch (JSONException e) {

			e.printStackTrace();
		}

		return local_model;
	}
			
}