import org.json.JSONException;
import org.json.JSONObject;

class SoughModelParser {

    ItemsModelParser items_parser = new ItemsModelParser();

    public SoughModelParser() {
    }

    public SoughModel parseSoughModel(String json_object) {

        SoughModel local_model = null;
        try {
            JSONObject jsobj = new JSONObject(json_object);

            ItemsModel items = items_parser.parseItemsModel(jsobj.getJSONObject("items").toString());

            local_model = new SoughModel(jsobj.getString("aspectRatio"), jsobj.getString("syndicate"), jsobj.getString("rate"), jsobj.getInt("favoriteCount"), jsobj.getBoolean("required"), jsobj.getString("commentVote"), jsobj.getInt("minimum"), jsobj.getString("type"), jsobj.getString("updatededon"), items, jsobj.getInt("viewCount"), jsobj.getInt("ratingCount"), jsobj.getString("list"), );
        } catch (JSONException e) {

            e.printStackTrace();
        }

        return local_model;
    }

}