import org.json.JSONException;
import org.json.JSONObject;

class MetightModelParser {

	ItemsModelParser items_parser = new ItemsModelParser();

	public MetightModelParser() {
	}

	public MetightModel parseMetightModel(String json_object) {

		MetightModel local_model = null;
		try {
			JSONObject jsobj = new JSONObject(json_object);

			ItemsModel items = items_parser.parseItemsModel(jsobj.getJSONObject("items").toString());

			local_model = new MetightModel(jsobj.getString("type"), items, );
		} catch (JSONException e) {

			e.printStackTrace();
		}

		return local_model;
	}
			
}