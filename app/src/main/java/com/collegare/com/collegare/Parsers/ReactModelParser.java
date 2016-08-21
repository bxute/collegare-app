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

			local_model = new ReactModel(jsobj.getString("updatededon"), jsobj.getInt("favoriteCount"), jsobj.getInt("duration"), jsobj.getBoolean("required"), jsobj.getInt("viewCount"), items, jsobj.getString("list"), jsobj.getString("type"), jsobj.getInt("ratingCount"), jsobj.getString("rate"), jsobj.getString("syndicate"), jsobj.getString("aspectRatio"), jsobj.getString("commentVote"), jsobj.getString("uploadedon"), jsobj.getInt("minimum"), );
		} catch (JSONException e) {

			e.printStackTrace();
		}

		return local_model;
	}
			
}