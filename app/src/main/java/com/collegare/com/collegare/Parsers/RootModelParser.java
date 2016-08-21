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

				local_model = new RootModel(jsobj.getString("uploadedon"), jsobj.getInt("viewCount"), counl, secon, jsobj.getString("commentVote"), jsobj.getString("uploadedby"), jsobj.getString("updatedon"), jsobj.getString("syndicate"), jsobj.getString("aspectRatio"), jsobj.getString("meme"), jsobj.getString("rate"), jsobj.getInt("favoriteCount"), jsobj.getString("apiVersion"), jsobj.getInt("ratingCount"), );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}