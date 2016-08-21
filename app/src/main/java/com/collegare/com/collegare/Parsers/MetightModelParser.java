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

			local_model = new MetightModel(jsobj.getInt("favoriteCount"), jsobj.getInt("viewCount"), jsobj.getString("commentVote"), jsobj.getString("uploadedon"), jsobj.getString("type"), jsobj.getInt("ratingCount"), jsobj.getString("syndicate"), jsobj.getString("aspectRatio"), rome, jsobj.getString("rate"), );
		} catch (JSONException e) {

			e.printStackTrace();
		}

		return local_model;
	}
			
}