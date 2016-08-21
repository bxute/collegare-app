import org.json.JSONException;
import org.json.JSONObject;

class RomeModelParser {

	ShockedModelParser shocked_parser = new ShockedModelParser();

	public RomeModelParser() {
	}

	public RomeModel parseRomeModel(String json_object) {

		RomeModel local_model = null;
		try {
			JSONObject jsobj = new JSONObject(json_object);

			ShockedModel shocked = shocked_parser.parseShockedModel(jsobj.getJSONObject("shocked").toString());

			local_model = new RomeModel(jsobj.getString("commentVote"), jsobj.getString("syndicate"), shocked, jsobj.getString("id"), jsobj.getInt("favoriteCount"), jsobj.getInt("ratingCount"), jsobj.getInt("viewCount"), jsobj.getString("rate"), jsobj.getString("uploadedon"), jsobj.getString("uploadedby"), jsobj.getString("type"), jsobj.getString("updatedon"), );
		} catch (JSONException e) {

			e.printStackTrace();
		}

		return local_model;
	}
			
}