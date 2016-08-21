import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

import org.json.JSONArray;

class RemardsModelParser {

    ContentModelParser content_parser = new ContentModelParser();
    ThumbiModelParser thumbi_parser = new ThumbiModelParser();
    SchemeModelParser scheme_parser = new SchemeModelParser();
    PlayerModelParser player_parser = new PlayerModelParser();
    MegernModelParser megern_parser = new MegernModelParser();

    public RemardsModelParser() {
    }

    public RemardsModel parseRemardsModel(String json_object) {

        RemardsModel local_model = null;
        try {
            JSONObject jsobj = new JSONObject(json_object);

            ContentModel content = content_parser.parseContentModel(jsobj.getJSONObject("content").toString());

            ThumbiModel thumbi = thumbi_parser.parseThumbiModel(jsobj.getJSONObject("thumbi").toString());

            ArrayList<String> tags = new ArrayList<>();
            JSONArray tags_arr = jsobj.getJSONArray("tags");

            for (int i = 0; i < tags_arr.length(); i++) {

                tags.add((String) tags_arr.get(i)));

            }

            SchemeModel scheme = scheme_parser.parseSchemeModel(jsobj.getJSONObject("scheme").toString());

            PlayerModel player = player_parser.parsePlayerModel(jsobj.getJSONObject("player").toString());

            MegernModel megern = megern_parser.parseMegernModel(jsobj.getJSONObject("megern").toString());

            local_model = new RemardsModel(jsobj.getInt("viewCount"), jsobj.getString("uploadedon"), jsobj.getInt("commentCount"), content, jsobj.getString("description"), thumbi, jsobj.getString("syndicate"), jsobj.getString("title"), tagsjsobj.getString("commentVote"), scheme, player, jsobj.getInt("favoriteCount"), jsobj.getString("id"), jsobj.getString("aspectRatio"), megern, jsobj.getString("rate"), jsobj.getInt("ratingCount"), );
        } catch (JSONException e) {

            e.printStackTrace();
        }

        return local_model;
    }

}