import org.json.JSONException;
import org.json.JSONObject;

class MegernModelParser {


    public MegernModelParser() {
    }

    public MegernModel parseMegernModel(String json_object) {

        MegernModel local_model = null;
        try {
            JSONObject jsobj = new JSONObject(json_object);

            local_model = new MegernModel(jsobj.getString("aspectRatio"), jsobj.getString("syndicate"), jsobj.getString("rate"), jsobj.getInt("favoriteCount"), jsobj.getString("comment"), jsobj.getString("commentVote"), jsobj.getString("updatedon"), jsobj.getInt("duration"), jsobj.getString("uploadedon"), jsobj.getString("videoRespond"), jsobj.getInt("viewCount"), jsobj.getString("embed"), jsobj.getInt("ratingCount"), jsobj.getString("uploadedby"), jsobj.getString("list"), );
        } catch (JSONException e) {

            e.printStackTrace();
        }

        return local_model;
    }

}