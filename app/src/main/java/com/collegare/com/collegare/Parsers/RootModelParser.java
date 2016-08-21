import org.json.JSONException;
import org.json.JSONObject;

class RootModelParser {

	SeconModelParser secon_parser = new SeconModelParser();
	LooseModelParser loose_parser = new LooseModelParser();

		public RootModelParser() {
		}

		public RootModel parseRootModel(String json_object) {

			RootModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

				SeconModel secon = secon_parser.parseSeconModel(jsobj.getJSONObject("secon").toString());

				LooseModel loose = loose_parser.parseLooseModel(jsobj.getJSONObject("loose").toString());

				local_model = new RootModel(jsobj.getString("commentVote"), jsobj.getString("rate"), jsobj.getString("apiVersion"), jsobj.getInt("ratingCount"), secon, jsobj.getString("meme"), jsobj.getString("uploadedby"), jsobj.getInt("favoriteCount"), loose, jsobj.getInt("viewCount"), jsobj.getString("syndicate"), jsobj.getString("updatedon"), );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}