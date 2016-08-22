import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import org.json.JSONArray;

class RootModelParser {

	VersioningModelParser versioning_parser = new VersioningModelParser();
	CreatorEmailModelParser creatorEmail_parser = new CreatorEmailModelParser();
	FlxwmModelParser flxwm_parser = new FlxwmModelParser();
	CopyrightModelParser copyright_parser = new CopyrightModelParser();
	SociallinksModelParser sociallinks_parser;
	Call_for_papersModelParser call_for_papers_parser = new Call_for_papersModelParser();

		public RootModelParser() {
			sociallinks_parser = new SociallinksModelParser();
		}

		public RootModel parseRootModel(String json_object) {

			RootModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

				VersioningModel versioning = versioning_parser.parseVersioningModel(jsobj.getJSONObject("versioning").toString());

				CreatorEmailModel creatorEmail = creatorEmail_parser.parseCreatorEmailModel(jsobj.getJSONObject("creatorEmail").toString());

				FlxwmModel flxwm = flxwm_parser.parseFlxwmModel(jsobj.getJSONObject("flxwm").toString());

				CopyrightModel copyright = copyright_parser.parseCopyrightModel(jsobj.getJSONObject("copyright").toString());

				ArrayList<SociallinksModel> sociallinkss = new ArrayList<>();
				JSONArray sociallinks_arr = jsobj.getJSONArray("sociallinks");

				for (int i = 0; i < sociallinks_arr.length(); i++) {

					sociallinkss.add(sociallinks_parser.parseSociallinksModel((String) sociallinks_arr.get(i)));

				}

				Call_for_papersModel call_for_papers = call_for_papers_parser.parseCall_for_papersModel(jsobj.getJSONObject("call_for_papers").toString());

				local_model = new RootModel(jsobj.getString("organizer_name"), jsobj.getString("email"), versioning, jsobj.getString("code_of_conduct"), creatorEmail, jsobj.getString("organizer_description"), flxwm, jsobj.getString("background_image"), copyright, jsobj.getString("description"), jsobj.getString("starttime"), jsobj.getString("schedule_published_on"), jsobj.getString("type"), jsobj.getString("privacy"), sociallinkss, call_for_papers, );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}