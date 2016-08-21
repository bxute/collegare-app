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

			local_model = new MetightModel(jsobj.getInt("ratingCount"), jsobj.getString("rate"), rome, jsobj.getInt("favoriteCount"), jsobj.getString("aspectRatio"), jsobj.getString("syndicate"), jsobj.getInt("viewCount"), jsobj.getString("commentVote"), jsobj.getString("type"), jsobj.getString("uploadedon"), );
		} catch (JSONException e) {

			e.printStackTrace();
		}

		return local_model;
	}
			
}