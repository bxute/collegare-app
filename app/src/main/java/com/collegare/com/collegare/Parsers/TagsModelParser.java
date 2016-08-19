import org.json.JSONException;
import org.json.JSONObject;

class TagsModelParser {

		ItemsModelParser items_parser = new ItemsModelParser();

		public TagsModelParser() {
		}

		public TagsModel parseTagsModel(String json_object) {

			TagsModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					ItemsModel items = items_parser.parseItemsModel(jsobj.getJSONObject("items").toString());

					local_model = new TagsModel(jsobj.getString("type") , items, );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}