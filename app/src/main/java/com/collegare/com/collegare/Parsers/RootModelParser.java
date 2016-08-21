import org.json.JSONException;
import org.json.JSONObject;

class RootModelParser {

	SeconModelParser secon_parser = new SeconModelParser();
	CounlModelParser counl_parser = new CounlModelParser();

		public RootModelParser() {
		}

		public RootModel parseRootModel(String json_object) {

			RootModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

				SeconModel secon = secon_parser.parseSeconModel(jsobj.getJSONObject("secon").toString());

				CounlModel counl = counl_parser.parseCounlModel(jsobj.getJSONObject("counl").toString());

				local_model = new RootModel(jsobj.getString("updatedon"), jsobj.getInt("favoriteCount"), jsobj.getInt("ratingCount"), secon, jsobj.getString("syndicate"), jsobj.getString("meme"), jsobj.getInt("viewCount"), counl, jsobj.getString("rate"), jsobj.getString("commentVote"), jsobj.getString("apiVersion"), jsobj.getString("uploadedby"), );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}