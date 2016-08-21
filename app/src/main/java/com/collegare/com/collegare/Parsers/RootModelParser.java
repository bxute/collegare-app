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

				local_model = new RootModel(secon, jsobj.getInt("ratingCount"), jsobj.getInt("viewCount"), jsobj.getString("commentVote"), jsobj.getString("rate"), loose, jsobj.getString("meme"), jsobj.getString("syndicate"), jsobj.getString("apiVersion"), jsobj.getString("updatedon"), jsobj.getString("uploadedby"), jsobj.getInt("favoriteCount"), );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}