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

				local_model = new RootModel(jsobj.getString("meme"), jsobj.getInt("viewCount"), jsobj.getString("updatedon"), jsobj.getString("uploadedby"), jsobj.getInt("ratingCount"), jsobj.getString("rate"), jsobj.getString("syndicate"), jsobj.getInt("favoriteCount"), jsobj.getString("commentVote"), secon, jsobj.getString("apiVersion"), counl, );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}