import org.json.JSONException;
import org.json.JSONObject;

class ContentModelParser {


		public ContentModelParser() {
		}

		public ContentModel parseContentModel(String json_object) {

			ContentModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					local_model = new ContentModel(jsobj.getString("5") , jsobj.getString("1") , jsobj.getString("6") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}