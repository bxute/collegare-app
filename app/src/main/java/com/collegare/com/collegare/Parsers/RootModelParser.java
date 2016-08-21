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

				local_model = new RootModel(jsobj.getString("commentVote"), loose, jsobj.getString("syndicate"), jsobj.getString("apiVersion"), jsobj.getInt("favoriteCount"), jsobj.getInt("ratingCount"), jsobj.getString("meme"), jsobj.getInt("viewCount"), jsobj.getString("rate"), jsobj.getString("uploadedby"), secon, jsobj.getString("updatedon"), );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}