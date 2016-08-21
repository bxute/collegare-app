import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import org.json.JSONArray;

class RedartModelParser {

	ShockedModelParser shocked_parser = new ShockedModelParser();
	ContentModelParser content_parser = new ContentModelParser();
	ThumbiModelParser thumbi_parser = new ThumbiModelParser();
	PlayerModelParser player_parser = new PlayerModelParser();
	RuseModelParser ruse_parser = new RuseModelParser();

	public RedartModelParser() {
	}

	public RedartModel parseRedartModel(String json_object) {

		RedartModel local_model = null;
		try {
			JSONObject jsobj = new JSONObject(json_object);

			ShockedModel shocked = shocked_parser.parseShockedModel(jsobj.getJSONObject("shocked").toString());

			ContentModel content = content_parser.parseContentModel(jsobj.getJSONObject("content").toString());

			ThumbiModel thumbi = thumbi_parser.parseThumbiModel(jsobj.getJSONObject("thumbi").toString());

			PlayerModel player = player_parser.parsePlayerModel(jsobj.getJSONObject("player").toString());

			RuseModel ruse = ruse_parser.parseRuseModel(jsobj.getJSONObject("ruse").toString());

			ArrayList<String> tags = new ArrayList<>();
			JSONArray tags_arr = jsobj.getJSONArray("tags");

			for (int i = 0; i < tags_arr.length(); i++) {

				tags.add((String) tags_arr.get(i)));

			}

			local_model = new RedartModel(shocked, content, thumbi, jsobj.getString("commentVote"), jsobj.getString("rate"), jsobj.getString("title"), jsobj.getString("uploadedon"), jsobj.getString("id"), player, jsobj.getString("description"), jsobj.getInt("viewCount"), ruse, jsobj.getInt("commentCount"), jsobj.getInt("ratingCount"), jsobj.getInt("favoriteCount"), tagsjsobj.getString("syndicate"), );
		} catch (JSONException e) {

			e.printStackTrace();
		}

		return local_model;
		}
			
}