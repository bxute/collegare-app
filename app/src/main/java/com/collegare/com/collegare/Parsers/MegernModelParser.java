import org.json.JSONException;
import org.json.JSONObject;

class MegernModelParser {


	public MegernModelParser() {
	}

	public MegernModel parseMegernModel(String json_object) {

		MegernModel local_model = null;
		try {
			JSONObject jsobj = new JSONObject(json_object);

			local_model = new MegernModel(jsobj.getString("embed"), jsobj.getString("comment"), jsobj.getString("list"), jsobj.getString("commentVote"), jsobj.getString("videoRespond"), jsobj.getString("updatedon"), jsobj.getString("uploadedon"), jsobj.getString("aspectRatio"), jsobj.getInt("viewCount"), jsobj.getString("rate"), jsobj.getString("syndicate"), jsobj.getInt("ratingCount"), jsobj.getString("uploadedby"), jsobj.getInt("favoriteCount"), jsobj.getInt("duration"), );
		} catch (JSONException e) {

			e.printStackTrace();
		}

		return local_model;
	}
			
}