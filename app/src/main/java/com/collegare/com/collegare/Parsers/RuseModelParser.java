import org.json.JSONException;
import org.json.JSONObject;

class RuseModelParser {

	ShockedModelParser shocked_parser = new ShockedModelParser();

	public RuseModelParser() {
	}

	public RuseModel parseRuseModel(String json_object) {

		RuseModel local_model = null;
		try {
			JSONObject jsobj = new JSONObject(json_object);

			ShockedModel shocked = shocked_parser.parseShockedModel(jsobj.getJSONObject("shocked").toString());

			local_model = new RuseModel(jsobj.getString("title"), jsobj.getString("reason"), jsobj.getString("embed"), jsobj.getString("aspectRatio"), shocked, jsobj.getString("list"), jsobj.getString("comment"), );
		} catch (JSONException e) {

			e.printStackTrace();
		}

		return local_model;
	}
			
}