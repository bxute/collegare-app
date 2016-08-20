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

				local_model = new SecdomModel(jsobj.getString("commentVote"), jsobj.getInt("viewCount"), jsobj.getString("type"), jsobj.getString("list"), jsobj.getBoolean("required"), jsobj.getString("updatededon"), jsobj.getInt("minimum"), jsobj.getString("rate"), jsobj.getInt("favoriteCount"), jsobj.getString("aspectRatio"), jsobj.getInt("ratingCount"), items, jsobj.getString("syndicate"), );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}