import org.json.JSONException;
import org.json.JSONObject;

class ItemsModelParser {


		public ItemsModelParser() {
		}

		public ItemsModel parseItemsModel(String json_object) {

			ItemsModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

				local_model = new ItemsModel(jsobj.getString("rate"), jsobj.getString("updatedon"), jsobj.getInt("favoriteCount"), jsobj.getString("commentVote"), jsobj.getInt("ratingCount"), jsobj.getString("type"), jsobj.getString("syndicate"), jsobj.getString("aspectRatio"), jsobj.getInt("viewCount"), jsobj.getString("uploadedon"), jsobj.getString("uploadedby"), );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}