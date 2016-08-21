import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import org.json.JSONArray;

class RedartModelParser {

	ShockedModelParser shocked_parser = new ShockedModelParser();
	ThumbiModelParser thumbi_parser = new ThumbiModelParser();
	ContentModelParser content_parser = new ContentModelParser();
	RuseModelParser ruse_parser = new RuseModelParser();
	PlayerModelParser player_parser = new PlayerModelParser();

	public RedartModelParser() {
	}

	public RedartModel parseRedartModel(String json_object) {

		RedartModel local_model = null;
		try {
			JSONObject jsobj = new JSONObject(json_object);

			ShockedModel shocked = shocked_parser.parseShockedModel(jsobj.getJSONObject("shocked").toString());

			ThumbiModel thumbi = thumbi_parser.parseThumbiModel(jsobj.getJSONObject("thumbi").toString());

			ContentModel content = content_parser.parseContentModel(jsobj.getJSONObject("content").toString());

			ArrayList<String> tags = new ArrayList<>();
			JSONArray tags_arr = jsobj.getJSONArray("tags");

			for (int i = 0; i < tags_arr.length(); i++) {

				tags.add((String) tags_arr.get(i)));

			}

			RuseModel ruse = ruse_parser.parseRuseModel(jsobj.getJSONObject("ruse").toString());

			PlayerModel player = player_parser.parsePlayerModel(jsobj.getJSONObject("player").toString());

			local_model = new RedartModel(jsobj.getString("description"), jsobj.getString("rate"), jsobj.getString("title"), jsobj.getInt("commentCount"), shocked, jsobj.getInt("favoriteCount"), thumbi, jsobj.getString("commentVote"), jsobj.getString("uploadedon"), jsobj.getInt("viewCount"), content, jsobj.getString("syndicate"), tagsjsobj.getString("id"), jsobj.getInt("ratingCount"), ruse, player, );
		} catch (JSONException e) {

			e.printStackTrace();
		}

		return local_model;
		}
			
}