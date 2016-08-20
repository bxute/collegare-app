import org.json.JSONException;
import org.json.JSONObject;

class SecdomModelParser {

		ItemsModelParser items_parser = new ItemsModelParser();

		public SecdomModelParser() {
		}

		public SecdomModel parseSecdomModel(String json_object) {

			SecdomModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					ItemsModel items = items_parser.parseItemsModel(jsobj.getJSONObject("items").toString());

					local_model = new SecdomModel(jsobj.getString("list") , jsobj.getString("type") , items, jsobj.getString("commentVote") , jsobj.getString("aspectRatio") , jsobj.getString("syndicate") , jsobj.getString("rate") , jsobj.getInt("viewCount") , jsobj.getInt("favoriteCount") , jsobj.getInt("ratingCount") , jsobj.getBoolean("required") , jsobj.getString("updatededon") , jsobj.getInt("minimum") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}