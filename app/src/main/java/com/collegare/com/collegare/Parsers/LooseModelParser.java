import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import org.json.JSONArray;

class LooseModelParser {

	RedartModelParser redart_parser;

	public LooseModelParser() {
		redart_parser = new RedartModelParser();
	}

	public LooseModel parseLooseModel(String json_object) {

		LooseModel local_model = null;
		try {
			JSONObject jsobj = new JSONObject(json_object);

			ArrayList<RedartModel> redarts = new ArrayList<>();
			JSONArray redart_arr = jsobj.getJSONArray("redart");

			for (int i = 0; i < redart_arr.length(); i++) {

				redarts.add(redart_parser.parseRedartModel((String) redart_arr.get(i)));

			}

			local_model = new LooseModel(redarts, jsobj.getString("updated"), jsobj.getString("commentVote"), jsobj.getString("rate"), jsobj.getInt("itemsPerPage"), jsobj.getInt("ratingCount"), jsobj.getString("uploadedon"), jsobj.getString("syndicate"), jsobj.getInt("viewCount"), jsobj.getInt("favoriteCount"), jsobj.getString("id"), );
		} catch (JSONException e) {

			e.printStackTrace();
			}

		return local_model;
		}
			
}