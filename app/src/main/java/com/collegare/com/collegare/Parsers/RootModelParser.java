import org.json.JSONException;
import org.json.JSONObject;

class RootModelParser {

	CounlModelParser counl_parser = new CounlModelParser();
	SeconModelParser secon_parser = new SeconModelParser();

		public RootModelParser() {
		}

		public RootModel parseRootModel(String json_object) {

			RootModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

				CounlModel counl = counl_parser.parseCounlModel(jsobj.getJSONObject("counl").toString());

				SeconModel secon = secon_parser.parseSeconModel(jsobj.getJSONObject("secon").toString());

				local_model = new RootModel(jsobj.getString("meme"), jsobj.getInt("viewCount"), counl, jsobj.getString("commentVote"), jsobj.getString("apiVersion"), jsobj.getString("rate"), jsobj.getInt("favoriteCount"), jsobj.getString("updatedon"), jsobj.getInt("ratingCount"), jsobj.getString("uploadedby"), jsobj.getString("syndicate"), secon, );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}