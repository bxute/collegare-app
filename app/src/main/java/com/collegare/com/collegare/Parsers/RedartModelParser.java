import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import org.json.JSONArray;

class RedartModelParser {

	RuseModelParser ruse_parser = new RuseModelParser();
	PlayerModelParser player_parser = new PlayerModelParser();
	ThumbiModelParser thumbi_parser = new ThumbiModelParser();
	ShockedModelParser shocked_parser = new ShockedModelParser();
	ContentModelParser content_parser = new ContentModelParser();

	public RedartModelParser() {
	}

	public RedartModel parseRedartModel(String json_object) {

		RedartModel local_model = null;
		try {
			JSONObject jsobj = new JSONObject(json_object);

			RuseModel ruse = ruse_parser.parseRuseModel(jsobj.getJSONObject("ruse").toString());

			PlayerModel player = player_parser.parsePlayerModel(jsobj.getJSONObject("player").toString());

			ArrayList<String> tags = new ArrayList<>();
			JSONArray tags_arr = jsobj.getJSONArray("tags");

			for (int i = 0; i < tags_arr.length(); i++) {

				tags.add((String) tags_arr.get(i)));

			}

			ThumbiModel thumbi = thumbi_parser.parseThumbiModel(jsobj.getJSONObject("thumbi").toString());

			ShockedModel shocked = shocked_parser.parseShockedModel(jsobj.getJSONObject("shocked").toString());

			ContentModel content = content_parser.parseContentModel(jsobj.getJSONObject("content").toString());

			local_model = new RedartModel(jsobj.getString("title"), ruse, player, jsobj.getString("description"), tagsjsobj.getInt("commentCount"), thumbi, shocked, content, );
		} catch (JSONException e) {

			e.printStackTrace();
		}

		return local_model;
	}
			
}