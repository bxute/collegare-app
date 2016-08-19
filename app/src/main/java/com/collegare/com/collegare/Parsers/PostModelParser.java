import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import org.json.JSONArray;

class PostModelParser {

		FromModelParser from_parser = new FromModelParser();
		ActionModelParser action_parser;

		public PostModelParser() {
			action_parser = new ActionModelParser();
		}

		public PostModel parsePostModel(String json_object) {

			PostModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					FromModel from = from_parser.parseFromModel(jsobj.getJSONObject("from").toString());

					ArrayList<ActionModel> actions = new ArrayList<>();
					JSONArray action_arr = jsobj.getJSONArray("action");
			
					for(int i = 0 ;i<action_arr.length();i++){

 						actions.add(action_parser.parseActionModel((String)action_arr.get(i)));

					}

					local_model = new PostModel(jsobj.getString("id") , jsobj.getString("created_time") , jsobj.getString("updated_time") , jsobj.getString("message") , from, actions, jsobj.getString("type") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}