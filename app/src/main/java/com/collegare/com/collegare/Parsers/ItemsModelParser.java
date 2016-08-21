import org.json.JSONException;
import org.json.JSONObject;

class ItemsModelParser {


		public ItemsModelParser() {
		}

		public ItemsModel parseItemsModel(String json_object) {

			ItemsModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

				local_model = new ItemsModel(jsobj.getString("uploadedon"), jsobj.getInt("viewCount"), jsobj.getString("commentVote"), jsobj.getInt("favoriteCount"), jsobj.getString("syndicate"), jsobj.getInt("ratingCount"), jsobj.getString("type"), jsobj.getString("rate"), jsobj.getString("id"), );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}