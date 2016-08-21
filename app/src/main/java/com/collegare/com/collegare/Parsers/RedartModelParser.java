import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import org.json.JSONArray;

class RedartModelParser {

	RuseModelParser ruse_parser = new RuseModelParser();
	ShockedModelParser shocked_parser = new ShockedModelParser();
	ContentModelParser content_parser = new ContentModelParser();
	ThumbiModelParser thumbi_parser = new ThumbiModelParser();
	PlayerModelParser player_parser = new PlayerModelParser();

	public RedartModelParser() {
	}

	public RedartModel parseRedartModel(String json_object) {

		RedartModel local_model = null;
		try {
			JSONObject jsobj = new JSONObject(json_object);

			ArrayList<String> tags = new ArrayList<>();
			JSONArray tags_arr = jsobj.getJSONArray("tags");

			for (int i = 0; i < tags_arr.length(); i++) {

				tags.add((String) tags_arr.get(i)));

			}

			RuseModel ruse = ruse_parser.parseRuseModel(jsobj.getJSONObject("ruse").toString());

			ShockedModel shocked = shocked_parser.parseShockedModel(jsobj.getJSONObject("shocked").toString());

			ContentModel content = content_parser.parseContentModel(jsobj.getJSONObject("content").toString());

			ThumbiModel thumbi = thumbi_parser.parseThumbiModel(jsobj.getJSONObject("thumbi").toString());

			PlayerModel player = player_parser.parsePlayerModel(jsobj.getJSONObject("player").toString());

			local_model = new RedartModel(tagsruse, jsobj.getString("rate"), jsobj.getInt("ratingCount"), jsobj.getString("title"), jsobj.getString("description"), jsobj.getInt("favoriteCount"), jsobj.getString("commentVote"), jsobj.getInt("commentCount"), jsobj.getInt("viewCount"), jsobj.getString("syndicate"), shocked, jsobj.getString("uploadedon"), content, thumbi, jsobj.getString("id"), player, );
		} catch (JSONException e) {

			e.printStackTrace();
		}

		return local_model;
		}
			
}