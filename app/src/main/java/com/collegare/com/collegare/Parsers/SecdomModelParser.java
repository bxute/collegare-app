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

					local_model = new SecdomModel(jsobj.getString("syndicate") , jsobj.getInt("viewCount") , jsobj.getString("aspectRatio") , jsobj.getInt("ratingCount") , jsobj.getString("commentVote") , jsobj.getInt("minimum") , jsobj.getInt("favoriteCount") , jsobj.getString("updatededon") , items, jsobj.getString("rate") , jsobj.getString("list") , jsobj.getBoolean("required") , jsobj.getString("type") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}