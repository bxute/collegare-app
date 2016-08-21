import org.json.JSONException;
import org.json.JSONObject;

class RootModelParser {

	CounlModelParser counl_parser = new CounlModelParser();
	SeatModelParser seat_parser = new SeatModelParser();

		public RootModelParser() {
		}

		public RootModel parseRootModel(String json_object) {

			RootModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

				CounlModel counl = counl_parser.parseCounlModel(jsobj.getJSONObject("counl").toString());

				SeatModel seat = seat_parser.parseSeatModel(jsobj.getJSONObject("seat").toString());

				local_model = new RootModel(jsobj.getString("updatedon"), jsobj.getInt("viewCount"), jsobj.getString("meme"), counl, jsobj.getString("commentVote"), jsobj.getString("syndicate"), jsobj.getString("uploadedby"), jsobj.getString("rate"), seat, jsobj.getInt("favoriteCount"), jsobj.getString("apiVersion"), jsobj.getInt("ratingCount"), );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}