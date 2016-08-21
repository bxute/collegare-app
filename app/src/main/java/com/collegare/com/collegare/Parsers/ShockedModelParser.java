import org.json.JSONException;
import org.json.JSONObject;

class ShockedModelParser {


	public ShockedModelParser() {
	}

	public ShockedModel parseShockedModel(String json_object) {

		ShockedModel local_model = null;
		try {
			JSONObject jsobj = new JSONObject(json_object);

			local_model = new ShockedModel(jsobj.getString("rate"), jsobj.getString("list"), jsobj.getInt("ratingCount"), jsobj.getString("embed"), jsobj.getString("uploadedon"), jsobj.getString("comment"), jsobj.getInt("favoriteCount"), jsobj.getString("id"), jsobj.getString("commentVote"), jsobj.getInt("viewCount"), jsobj.getString("syndicate"), jsobj.getString("videoRespond"), jsobj.getString("aspectRatio"), );
		} catch (JSONException e) {

			e.printStackTrace();
		}

		return local_model;
	}
			
}