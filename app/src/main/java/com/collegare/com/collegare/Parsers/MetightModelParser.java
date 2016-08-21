import org.json.JSONException;
import org.json.JSONObject;

class MetightModelParser {

	RomeModelParser rome_parser = new RomeModelParser();

	public MetightModelParser() {
	}

	public MetightModel parseMetightModel(String json_object) {

		MetightModel local_model = null;
		try {
			JSONObject jsobj = new JSONObject(json_object);

			RomeModel rome = rome_parser.parseRomeModel(jsobj.getJSONObject("rome").toString());

			local_model = new MetightModel(jsobj.getInt("ratingCount"), jsobj.getString("uploadedon"), jsobj.getString("aspectRatio"), jsobj.getString("rate"), jsobj.getInt("viewCount"), jsobj.getInt("favoriteCount"), jsobj.getString("type"), rome, jsobj.getString("syndicate"), jsobj.getString("commentVote"), );
		} catch (JSONException e) {

			e.printStackTrace();
		}

		return local_model;
	}
			
}