import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import org.json.JSONArray;

class RedartModelParser {

	ContentModelParser content_parser = new ContentModelParser();
	ShockedModelParser shocked_parser = new ShockedModelParser();
	PlayerModelParser player_parser = new PlayerModelParser();
	ThumbiModelParser thumbi_parser = new ThumbiModelParser();
	RuseModelParser ruse_parser = new RuseModelParser();

	public RedartModelParser() {
	}

	public RedartModel parseRedartModel(String json_object) {

		RedartModel local_model = null;
		try {
			JSONObject jsobj = new JSONObject(json_object);

			ContentModel content = content_parser.parseContentModel(jsobj.getJSONObject("content").toString());

			ArrayList<String> tags = new ArrayList<>();
			JSONArray tags_arr = jsobj.getJSONArray("tags");

			for (int i = 0; i < tags_arr.length(); i++) {

				tags.add((String) tags_arr.get(i)));

			}

			ShockedModel shocked = shocked_parser.parseShockedModel(jsobj.getJSONObject("shocked").toString());

			PlayerModel player = player_parser.parsePlayerModel(jsobj.getJSONObject("player").toString());

			ThumbiModel thumbi = thumbi_parser.parseThumbiModel(jsobj.getJSONObject("thumbi").toString());

			RuseModel ruse = ruse_parser.parseRuseModel(jsobj.getJSONObject("ruse").toString());

			local_model = new RedartModel(content, jsobj.getString("description"), jsobj.getInt("commentCount"), jsobj.getInt("ratingCount"), jsobj.getString("uploadedon"), jsobj.getInt("viewCount"), jsobj.getString("commentVote"), tagsjsobj.getString("rate"), shocked, jsobj.getString("syndicate"), player, jsobj.getString("id"), thumbi, ruse, jsobj.getString("title"), jsobj.getInt("favoriteCount"), );
		} catch (JSONException e) {

			e.printStackTrace();
		}

		return local_model;
		}
			
}