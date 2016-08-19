import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import org.json.JSONArray;

class ResModelParser {

		SigModelParser sig_parser = new SigModelParser();
		QstatusModelParser qstatus_parser = new QstatusModelParser();
		SemanticsModelParser semantics_parser = new SemanticsModelParser();
		McontentModelParser mcontent_parser = new McontentModelParser();
		ThumbnailModelParser thumbnail_parser = new ThumbnailModelParser();

		public ResModelParser() {
		}

		public ResModel parseResModel(String json_object) {

			ResModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					SigModel sig = sig_parser.parseSigModel(jsobj.getJSONObject("sig").toString());

					QstatusModel qstatus = qstatus_parser.parseQstatusModel(jsobj.getJSONObject("qstatus").toString()); 

					ArrayList<String> tags = new ArrayList<>();
					JSONArray tags_arr = jsobj.getJSONArray("tags");
			
					for(int i = 0 ;i<tags_arr.length();i++){

 						tags.add((String)tags_arr.get(i)));

					}

					SemanticsModel semantics = semantics_parser.parseSemanticsModel(jsobj.getJSONObject("semantics").toString());

					McontentModel mcontent = mcontent_parser.parseMcontentModel(jsobj.getJSONObject("mcontent").toString());

					ThumbnailModel thumbnail = thumbnail_parser.parseThumbnailModel(jsobj.getJSONObject("thumbnail").toString());

					local_model = new ResModel(jsobj.getInt("ratingCount") , sig, jsobj.getString("title") , jsobj.getString("category") , jsobj.getInt("viewCount") , jsobj.getString("aspectRatio") , jsobj.getString("uploaded") , jsobj.getInt("favoriteCount") , jsobj.getString("updated") , jsobj.getString("id") , jsobj.getInt("duration") , qstatus, tagsjsobj.getInt("commentCount") , semantics, mcontent, jsobj.getString("uploader") , thumbnail, jsobj.getString("description") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}