import org.json.JSONException;
import org.json.JSONObject;

class ItemsModelParser {


		public ItemsModelParser() {
		}

		public ItemsModel parseItemsModel(String json_object) {

			ItemsModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

				local_model = new ItemsModel(jsobj.getString("aspectRatio"), jsobj.getString("syndicate"), jsobj.getString("rate"), jsobj.getString("uploadedon"), jsobj.getString("uploadedby"), jsobj.getInt("favoriteCount"), jsobj.getInt("ratingCount"), jsobj.getInt("viewCount"), jsobj.getString("commentVote"), jsobj.getString("updatedon"), jsobj.getString("type"), );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}