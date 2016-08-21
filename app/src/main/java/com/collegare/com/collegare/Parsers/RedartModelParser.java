import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

import org.json.JSONArray;

class RedartModelParser {

    ShockedModelParser shocked_parser = new ShockedModelParser();
    ContentModelParser content_parser = new ContentModelParser();
    RomeModelParser rome_parser = new RomeModelParser();
    ThumbiModelParser thumbi_parser = new ThumbiModelParser();
    PlayerModelParser player_parser = new PlayerModelParser();

    public RedartModelParser() {
    }

    public RedartModel parseRedartModel(String json_object) {

        RedartModel local_model = null;
        try {
            JSONObject jsobj = new JSONObject(json_object);

            ShockedModel shocked = shocked_parser.parseShockedModel(jsobj.getJSONObject("shocked").toString());

            ContentModel content = content_parser.parseContentModel(jsobj.getJSONObject("content").toString());

            RomeModel rome = rome_parser.parseRomeModel(jsobj.getJSONObject("rome").toString());

            ArrayList<String> tags = new ArrayList<>();
            JSONArray tags_arr = jsobj.getJSONArray("tags");

            for (int i = 0; i < tags_arr.length(); i++) {

                tags.add((String) tags_arr.get(i)));

            }

            ThumbiModel thumbi = thumbi_parser.parseThumbiModel(jsobj.getJSONObject("thumbi").toString());

            PlayerModel player = player_parser.parsePlayerModel(jsobj.getJSONObject("player").toString());

            local_model = new RedartModel(shocked, jsobj.getString("description"), content, jsobj.getInt("commentCount"), jsobj.getString("title"), rome, tagsthumbi, player, );
        } catch (JSONException e) {

            e.printStackTrace();
        }

        return local_model;
    }

}