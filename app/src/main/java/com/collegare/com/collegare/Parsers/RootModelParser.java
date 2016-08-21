import org.json.JSONException;
import org.json.JSONObject;

class RootModelParser {

	SeatModelParser seat_parser = new SeatModelParser();
	CounlModelParser counl_parser = new CounlModelParser();

		public RootModelParser() {
		}

		public RootModel parseRootModel(String json_object) {

			RootModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

				SeatModel seat = seat_parser.parseSeatModel(jsobj.getJSONObject("seat").toString());

				CounlModel counl = counl_parser.parseCounlModel(jsobj.getJSONObject("counl").toString());

				local_model = new RootModel(jsobj.getString("commentVote"), jsobj.getInt("ratingCount"), seat, jsobj.getString("syndicate"), jsobj.getInt("duration"), jsobj.getInt("favoriteCount"), jsobj.getString("rate"), jsobj.getString("meme"), jsobj.getString("uploadedon"), counl, jsobj.getString("uploadedby"), jsobj.getString("apiVersion"), jsobj.getInt("viewCount"), jsobj.getString("updatedon"), );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}