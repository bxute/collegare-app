import org.json.JSONException;
import org.json.JSONObject;

class RootModelParser {

		SeperModelParser seper_parser = new SeperModelParser();
	CounlModelParser counl_parser = new CounlModelParser();

		public RootModelParser() {
		}

		public RootModel parseRootModel(String json_object) {

			RootModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					SeperModel seper = seper_parser.parseSeperModel(jsobj.getJSONObject("seper").toString());

				CounlModel counl = counl_parser.parseCounlModel(jsobj.getJSONObject("counl").toString());

				local_model = new RootModel(jsobj.getInt("viewCount"), jsobj.getString("rate"), jsobj.getString("apiVersion"), jsobj.getInt("ratingCount"), jsobj.getString("commentVote"), jsobj.getString("syndicate"), seper, jsobj.getString("uploadedon"), jsobj.getInt("duration"), jsobj.getInt("favoriteCount"), jsobj.getString("updatedon"), jsobj.getString("uploadedby"), counl, jsobj.getString("set"), );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}