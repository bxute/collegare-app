import org.json.JSONException;
import org.json.JSONObject;

class RomeModelParser {


    public RomeModelParser() {
    }

    public RomeModel parseRomeModel(String json_object) {

        RomeModel local_model = null;
        try {
            JSONObject jsobj = new JSONObject(json_object);

            local_model = new RomeModel(jsobj.getString("type"), jsobj.getInt("ratingCount"), jsobj.getString("rate"), jsobj.getString("syndicate"), jsobj.getInt("favoriteCount"), jsobj.getString("aspectRatio"), jsobj.getString("commentVote"), jsobj.getString("uploadedon"), jsobj.getInt("viewCount"), jsobj.getString("updatedon"), jsobj.getString("uploadedby"), );
        } catch (JSONException e) {

            e.printStackTrace();
        }

        return local_model;
    }

}