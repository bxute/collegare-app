import org.json.JSONException;
import org.json.JSONObject;

class ReactModelParser {

    ItemsModelParser items_parser = new ItemsModelParser();

    public ReactModelParser() {
    }

    public ReactModel parseReactModel(String json_object) {

        ReactModel local_model = null;
        try {
            JSONObject jsobj = new JSONObject(json_object);

            ItemsModel items = items_parser.parseItemsModel(jsobj.getJSONObject("items").toString());

            local_model = new ReactModel(jsobj.getString("commentVote"), jsobj.getInt("duration"), jsobj.getString("updatededon"), jsobj.getInt("ratingCount"), jsobj.getString("rate"), jsobj.getString("aspectRatio"), items, jsobj.getInt("viewCount"), jsobj.getString("type"), jsobj.getString("uploadedon"), jsobj.getInt("minimum"), jsobj.getString("list"), jsobj.getString("syndicate"), jsobj.getBoolean("required"), jsobj.getInt("favoriteCount"), );
        } catch (JSONException e) {

            e.printStackTrace();
        }

        return local_model;
    }

}