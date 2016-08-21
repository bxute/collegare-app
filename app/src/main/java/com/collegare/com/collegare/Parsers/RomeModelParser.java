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

			local_model = new RomeModel(jsobj.getString("rate"), jsobj.getString("uploadedby"), shocked, jsobj.getString("commentVote"), jsobj.getInt("favoriteCount"), jsobj.getString("type"), jsobj.getString("uploadedon"), jsobj.getString("updatedon"), jsobj.getInt("viewCount"), jsobj.getString("syndicate"), jsobj.getString("id"), jsobj.getInt("ratingCount"), );
		} catch (JSONException e) {

			e.printStackTrace();
		}

		return local_model;
	}
			
}