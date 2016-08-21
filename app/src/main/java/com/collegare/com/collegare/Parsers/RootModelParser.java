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

				local_model = new RootModel(jsobj.getString("rate"), jsobj.getString("uploadedby"), jsobj.getString("apiVersion"), jsobj.getString("commentVote"), jsobj.getInt("favoriteCount"), jsobj.getString("syndicate"), jsobj.getString("updatedon"), jsobj.getInt("viewCount"), jsobj.getString("meme"), jsobj.getInt("ratingCount"), secon, loose, );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}