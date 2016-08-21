import org.json.JSONException;
import org.json.JSONObject;

class ShockedModelParser {


	public ShockedModelParser() {
	}

	public ShockedModel parseShockedModel(String json_object) {

		ShockedModel local_model = null;
		try {
			JSONObject jsobj = new JSONObject(json_object);

			local_model = new ShockedModel(jsobj.getString("aspectRatio"), jsobj.getString("embed"), jsobj.getString("comment"), jsobj.getInt("ratingCount"), jsobj.getString("uploadedon"), jsobj.getInt("viewCount"), jsobj.getString("commentVote"), jsobj.getString("rate"), jsobj.getString("syndicate"), jsobj.getString("id"), jsobj.getString("videoRespond"), jsobj.getString("list"), jsobj.getInt("favoriteCount"), );
		} catch (JSONException e) {

			e.printStackTrace();
		}

		return local_model;
	}
			
}