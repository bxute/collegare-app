import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import org.json.JSONArray;

class CounlModelParser {

	RemardsModelParser remards_parser;

		public CounlModelParser() {
			remards_parser = new RemardsModelParser();
		}

		public CounlModel parseCounlModel(String json_object) {

			CounlModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

				ArrayList<RemardsModel> remardss = new ArrayList<>();
				JSONArray remards_arr = jsobj.getJSONArray("remards");

				for (int i = 0; i < remards_arr.length(); i++) {

					remardss.add(remards_parser.parseRemardsModel((String) remards_arr.get(i)));

					}

				local_model = new CounlModel(jsobj.getString("updated"), remardss, jsobj.getInt("itemsPerPage"), );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}