import org.json.JSONException;
import org.json.JSONObject;

class PricemModelParser {

		ItemsModelParser items_parser = new ItemsModelParser();

		public PricemModelParser() {
		}

		public PricemModel parsePricemModel(String json_object) {

			PricemModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					ItemsModel items = items_parser.parseItemsModel(jsobj.getJSONObject("items").toString());

					local_model = new PricemModel(jsobj.getString("rate") , jsobj.getInt("minimum") , items, jsobj.getInt("favoriteCount") , jsobj.getString("syndicate") , jsobj.getString("updatededon") , jsobj.getString("uploadedby") , jsobj.getString("updatedon") , jsobj.getString("aspectRatio") , jsobj.getBoolean("required") , jsobj.getString("commentVote") , jsobj.getInt("viewCount") , jsobj.getInt("ratingCount") , jsobj.getString("uploadedon") , jsobj.getString("list") , jsobj.getString("type") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}