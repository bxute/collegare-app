import org.json.JSONException;
import org.json.JSONObject;

class S_o_ughModelParser {

    ItemsModelParser items_parser = new ItemsModelParser();

    public S_o_ughModelParser() {
    }

    public S_o_ughModel parseS_o_ughModel(String json_object) {

        S_o_ughModel local_model = null;
        try {
            JSONObject jsobj = new JSONObject(json_object);

            ItemsModel items = items_parser.parseItemsModel(jsobj.getJSONObject("items").toString());

            local_model = new S_o_ughModel(items, jsobj.getInt("minimum"), jsobj.getString("list"), jsobj.getString("commentVote"), jsobj.getInt("favoriteCount"), jsobj.getString("aspectRatio"), jsobj.getString("type"), jsobj.getInt("viewCount"), jsobj.getString("rate"), jsobj.getString("syndicate"), jsobj.getString("updatededon"), jsobj.getInt("ratingCount"), jsobj.getBoolean("required"), );
        } catch (JSONException e) {

            e.printStackTrace();
        }

        return local_model;
    }

}