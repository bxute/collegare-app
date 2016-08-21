import org.json.JSONException;
import org.json.JSONObject;

class ReactModelParser {

	ItemsModelParser items_parser = new ItemsModelParser();

	public ReactModelParser() {
	}

	public ReactModel parseReactModel(String json_object) {

		ReactModel local_model = null;
		try {
			JSONObject jsobj = new JSONObject(json_object);

			ItemsModel items = items_parser.parseItemsModel(jsobj.getJSONObject("items").toString());

			local_model = new ReactModel(jsobj.getBoolean("required"), jsobj.getString("commentVote"), jsobj.getString("type"), jsobj.getString("uploadedon"), jsobj.getInt("minimum"), jsobj.getString("rate"), jsobj.getInt("favoriteCount"), jsobj.getString("aspectRatio"), items, jsobj.getInt("ratingCount"), jsobj.getString("id"), jsobj.getString("syndicate"), jsobj.getInt("viewCount"), jsobj.getString("list"), jsobj.getInt("duration"), );
		} catch (JSONException e) {

			e.printStackTrace();
		}

		return local_model;
	}
			
}