import org.json.JSONException;
import org.json.JSONObject;

class ItemsModelParser {


		public ItemsModelParser() {
		}

		public ItemsModel parseItemsModel(String json_object) {

			ItemsModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

				local_model = new ItemsModel(jsobj.getInt("ratingCount"), jsobj.getInt("viewCount"), jsobj.getString("rate"), jsobj.getString("type"), jsobj.getString("updatedon"), jsobj.getString("uploadedby"), jsobj.getString("aspectRatio"), jsobj.getString("commentVote"), jsobj.getString("syndicate"), jsobj.getString("uploadedon"), jsobj.getInt("favoriteCount"), );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}