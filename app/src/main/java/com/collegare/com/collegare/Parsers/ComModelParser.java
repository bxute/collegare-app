import org.json.JSONException;
import org.json.JSONObject;

class ComModelParser {

	ItemsModelParser items_parser = new ItemsModelParser();

	public ComModelParser() {
	}

	public ComModel parseComModel(String json_object) {

		ComModel local_model = null;
		try {
			JSONObject jsobj = new JSONObject(json_object);

			ItemsModel items = items_parser.parseItemsModel(jsobj.getJSONObject("items").toString());

			local_model = new ComModel(jsobj.getInt("viewCount"), jsobj.getString("uploadedon"), jsobj.getInt("favoriteCount"), jsobj.getString("rate"), jsobj.getString("commentVote"), jsobj.getString("syndicate"), jsobj.getString("aspectRatio"), jsobj.getString("updatededon"), jsobj.getString("type"), jsobj.getInt("duration"), jsobj.getBoolean("required"), jsobj.getString("list"), jsobj.getInt("minimum"), jsobj.getInt("ratingCount"), items, );
		} catch (JSONException e) {

			e.printStackTrace();
		}

		return local_model;
	}
			
}