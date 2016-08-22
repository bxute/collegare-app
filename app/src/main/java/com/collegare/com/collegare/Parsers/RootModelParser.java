import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import org.json.JSONArray;

class RootModelParser {

	CopyrightModelParser copyright_parser = new CopyrightModelParser();
	CreatorEmailModelParser creatorEmail_parser = new CreatorEmailModelParser();
	Call_for_papersModelParser call_for_papers_parser = new Call_for_papersModelParser();
	FlxwmModelParser flxwm_parser = new FlxwmModelParser();
	SociallinksModelParser sociallinks_parser;
	VersionModelParser version_parser = new VersionModelParser();

		public RootModelParser() {
			sociallinks_parser = new SociallinksModelParser();
		}

		public RootModel parseRootModel(String json_object) {

			RootModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

				CopyrightModel copyright = copyright_parser.parseCopyrightModel(jsobj.getJSONObject("copyright").toString());

				CreatorEmailModel creatorEmail = creatorEmail_parser.parseCreatorEmailModel(jsobj.getJSONObject("creatorEmail").toString());

				Call_for_papersModel call_for_papers = call_for_papers_parser.parseCall_for_papersModel(jsobj.getJSONObject("call_for_papers").toString());

				FlxwmModel flxwm = flxwm_parser.parseFlxwmModel(jsobj.getJSONObject("flxwm").toString());

				ArrayList<SociallinksModel> sociallinkss = new ArrayList<>();
				JSONArray sociallinks_arr = jsobj.getJSONArray("sociallinks");

				for (int i = 0; i < sociallinks_arr.length(); i++) {

					sociallinkss.add(sociallinks_parser.parseSociallinksModel((String) sociallinks_arr.get(i)));

				}

				VersionModel version = version_parser.parseVersionModel(jsobj.getJSONObject("version").toString());

				local_model = new RootModel(copyright, creatorEmail, jsobj.getString("description"), jsobj.getString("background_image"), jsobj.getString("code_of_conduct"), jsobj.getString("organizer_description"), call_for_papers, flxwm, sociallinkss, jsobj.getString("starttime"), jsobj.getString("organizer_name"), jsobj.getString("schedule_published_on"), jsobj.getString("email"), jsobj.getString("type"), version, jsobj.getString("privacy"), );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}