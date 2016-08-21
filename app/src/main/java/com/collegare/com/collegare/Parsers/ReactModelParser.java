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

			local_model = new ReactModel(items, jsobj.getString("aspectRatio"), jsobj.getInt("duration"), jsobj.getInt("favoriteCount"), jsobj.getString("syndicate"), jsobj.getInt("minimum"), jsobj.getBoolean("required"), jsobj.getString("uploadedon"), jsobj.getInt("viewCount"), jsobj.getString("rate"), jsobj.getString("commentVote"), jsobj.getString("type"), jsobj.getInt("ratingCount"), jsobj.getString("list"), jsobj.getString("updatededon"), );
		} catch (JSONException e) {

			e.printStackTrace();
		}

		return local_model;
	}
			
}