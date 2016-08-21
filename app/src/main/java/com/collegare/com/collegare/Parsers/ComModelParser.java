import org.json.JSONException;
import org.json.JSONObject;

class ComModelParser {

    ItemsModelParser items_parser = new ItemsModelParser();

    public ComModelParser() {
    }

    public ComModel parseComModel(String json_object) {

        ComModel local_model = null;
        try {
            JSONObject jsobj = new JSONObject(json_object);

            ItemsModel items = items_parser.parseItemsModel(jsobj.getJSONObject("items").toString());

            local_model = new ComModel(jsobj.getString("commentVote"), jsobj.getInt("ratingCount"), jsobj.getString("list"), jsobj.getString("rate"), jsobj.getInt("minimum"), jsobj.getBoolean("required"), jsobj.getInt("favoriteCount"), jsobj.getString("syndicate"), jsobj.getString("aspectRatio"), items, jsobj.getString("type"), jsobj.getInt("viewCount"), jsobj.getString("updatededon"), );
        } catch (JSONException e) {

            e.printStackTrace();
        }

        return local_model;
    }

}