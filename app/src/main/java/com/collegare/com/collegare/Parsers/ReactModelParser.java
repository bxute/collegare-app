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

			local_model = new ReactModel(jsobj.getInt("viewCount"), jsobj.getString("uploadedon"), jsobj.getInt("minimum"), jsobj.getString("type"), jsobj.getString("syndicate"), jsobj.getString("list"), items, jsobj.getString("commentVote"), jsobj.getBoolean("required"), jsobj.getInt("favoriteCount"), jsobj.getString("id"), jsobj.getString("aspectRatio"), jsobj.getInt("duration"), jsobj.getString("rate"), jsobj.getInt("ratingCount"), );
		} catch (JSONException e) {

			e.printStackTrace();
		}

		return local_model;
	}
			
}