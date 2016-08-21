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

			local_model = new MetightModel(jsobj.getString("aspectRatio"), jsobj.getString("syndicate"), rome, jsobj.getInt("ratingCount"), jsobj.getString("uploadedon"), jsobj.getInt("viewCount"), jsobj.getString("commentVote"), jsobj.getString("type"), jsobj.getString("rate"), jsobj.getInt("favoriteCount"), );
		} catch (JSONException e) {

			e.printStackTrace();
		}

		return local_model;
	}
			
}