import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import org.json.JSONArray;

class RootModelParser {

	SociallinksModelParser sociallinks_parser;
	Call_for_papersModelParser call_for_papers_parser = new Call_for_papersModelParser();
	CreatorEmailModelParser creatorEmail_parser = new CreatorEmailModelParser();
	CopyrightModelParser copyright_parser = new CopyrightModelParser();
	FlxwmModelParser flxwm_parser = new FlxwmModelParser();
	VersioningModelParser versioning_parser = new VersioningModelParser();

		public RootModelParser() {
			sociallinks_parser = new SociallinksModelParser();
		}

		public RootModel parseRootModel(String json_object) {

			RootModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

				ArrayList<SociallinksModel> sociallinkss = new ArrayList<>();
				JSONArray sociallinks_arr = jsobj.getJSONArray("sociallinks");

				for (int i = 0; i < sociallinks_arr.length(); i++) {

					sociallinkss.add(sociallinks_parser.parseSociallinksModel((String) sociallinks_arr.get(i)));

				}

				Call_for_papersModel call_for_papers = call_for_papers_parser.parseCall_for_papersModel(jsobj.getJSONObject("call_for_papers").toString());

				CreatorEmailModel creatorEmail = creatorEmail_parser.parseCreatorEmailModel(jsobj.getJSONObject("creatorEmail").toString());

				CopyrightModel copyright = copyright_parser.parseCopyrightModel(jsobj.getJSONObject("copyright").toString());

				FlxwmModel flxwm = flxwm_parser.parseFlxwmModel(jsobj.getJSONObject("flxwm").toString());

				VersioningModel versioning = versioning_parser.parseVersioningModel(jsobj.getJSONObject("versioning").toString());

				local_model = new RootModel(sociallinkss, jsobj.getString("description"), call_for_papers, jsobj.getString("organizer_description"), jsobj.getString("type"), jsobj.getString("code_of_conduct"), jsobj.getString("organizer_name"), creatorEmail, jsobj.getString("starttime"), jsobj.getString("privacy"), jsobj.getString("background_image"), jsobj.getString("schedule_published_on"), copyright, flxwm, jsobj.getString("email"), versioning, );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}