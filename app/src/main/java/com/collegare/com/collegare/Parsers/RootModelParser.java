import org.json.JSONException;
import org.json.JSONObject;

class RootModelParser {

	LooseModelParser loose_parser = new LooseModelParser();
	SeconModelParser secon_parser = new SeconModelParser();

		public RootModelParser() {
		}

		public RootModel parseRootModel(String json_object) {

			RootModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

				LooseModel loose = loose_parser.parseLooseModel(jsobj.getJSONObject("loose").toString());

				SeconModel secon = secon_parser.parseSeconModel(jsobj.getJSONObject("secon").toString());

				local_model = new RootModel(loose, jsobj.getString("apiVersion"), jsobj.getString("meme"), jsobj.getString("rate"), jsobj.getString("updatedon"), secon, jsobj.getInt("viewCount"), jsobj.getString("commentVote"), jsobj.getInt("ratingCount"), jsobj.getString("syndicate"), jsobj.getInt("favoriteCount"), jsobj.getString("uploadedby"), );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}