import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import org.json.JSONArray;

class RemardsModelParser {

	SchemeModelParser scheme_parser = new SchemeModelParser();
	PlayerModelParser player_parser = new PlayerModelParser();
	MegernModelParser megern_parser = new MegernModelParser();
	ContentModelParser content_parser = new ContentModelParser();
	ThumbiModelParser thumbi_parser = new ThumbiModelParser();

	public RemardsModelParser() {
	}

	public RemardsModel parseRemardsModel(String json_object) {

		RemardsModel local_model = null;
		try {
			JSONObject jsobj = new JSONObject(json_object);

			SchemeModel scheme = scheme_parser.parseSchemeModel(jsobj.getJSONObject("scheme").toString());

			PlayerModel player = player_parser.parsePlayerModel(jsobj.getJSONObject("player").toString());

			MegernModel megern = megern_parser.parseMegernModel(jsobj.getJSONObject("megern").toString());

			ArrayList<String> tags = new ArrayList<>();
			JSONArray tags_arr = jsobj.getJSONArray("tags");

			for (int i = 0; i < tags_arr.length(); i++) {

				tags.add((String) tags_arr.get(i)));

			}

			ContentModel content = content_parser.parseContentModel(jsobj.getJSONObject("content").toString());

			ThumbiModel thumbi = thumbi_parser.parseThumbiModel(jsobj.getJSONObject("thumbi").toString());

			local_model = new RemardsModel(scheme, jsobj.getString("description"), jsobj.getInt("commentCount"), player, megern, tagscontent, jsobj.getString("title"), thumbi, );
		} catch (JSONException e) {

			e.printStackTrace();
		}

		return local_model;
	}
			
}