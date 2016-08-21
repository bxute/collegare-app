import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

import org.json.JSONArray;

class WrappersModelParser {

    ReckleModelParser reckle_parser;

    public WrappersModelParser() {
        reckle_parser = new ReckleModelParser();
    }

    public WrappersModel parseWrappersModel(String json_object) {

        WrappersModel local_model = null;
        try {
            JSONObject jsobj = new JSONObject(json_object);

            ArrayList<ReckleModel> reckles = new ArrayList<>();
            JSONArray reckle_arr = jsobj.getJSONArray("reckle");

            for (int i = 0; i < reckle_arr.length(); i++) {

                reckles.add(reckle_parser.parseReckleModel((String) reckle_arr.get(i)));

            }

            local_model = new WrappersModel(jsobj.getInt("itemsPerPage"), reckles, jsobj.getString("redeem"), );
        } catch (JSONException e) {

            e.printStackTrace();
        }

        return local_model;
    }

}