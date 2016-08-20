import org.json.JSONException;
import org.json.JSONObject;

class SrimModelParser {

    ItemsModelParser items_parser = new ItemsModelParser();

    public SrimModelParser() {
    }

    public SrimModel parseSrimModel(String json_object) {

        SrimModel local_model = null;
        try {
            JSONObject jsobj = new JSONObject(json_object);

            ItemsModel items = items_parser.parseItemsModel(jsobj.getJSONObject("items").toString());

            local_model = new SrimModel(jsobj.getInt("viewCount"), jsobj.getString("rate"), jsobj.getString("updatededon"), jsobj.getString("aspectRatio"), jsobj.getString("commentVote"), jsobj.getString("syndicate"), jsobj.getString("list"), jsobj.getInt("minimum"), jsobj.getInt("ratingCount"), items, jsobj.getInt("favoriteCount"), jsobj.getBoolean("required"), jsobj.getString("type"), );
        } catch (JSONException e) {

            e.printStackTrace();
        }

        return local_model;
    }

}