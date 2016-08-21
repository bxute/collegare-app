import org.json.JSONException;
import org.json.JSONObject;

class ItemsModelParser {


		public ItemsModelParser() {
		}

		public ItemsModel parseItemsModel(String json_object) {

			ItemsModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

				local_model = new ItemsModel(jsobj.getString("commentVote"), jsobj.getInt("ratingCount"), jsobj.getString("syndicate"), jsobj.getString("aspectRatio"), jsobj.getInt("favoriteCount"), jsobj.getString("uploadedon"), jsobj.getString("uploadedby"), jsobj.getString("rate"), jsobj.getInt("viewCount"), jsobj.getString("updatedon"), jsobj.getString("type"), );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}