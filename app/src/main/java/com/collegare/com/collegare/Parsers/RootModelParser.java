import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import org.json.JSONArray;

class RootModelParser {

	Callfor_papersModelParser callfor_papers_parser = new Callfor_papersModelParser();
	CopyrightModelParser copyright_parser = new CopyrightModelParser();
	CreatorEmailModelParser creatorEmail_parser = new CreatorEmailModelParser();
	SociallinksModelParser sociallinks_parser;
	VersioningModelParser versioning_parser = new VersioningModelParser();
	Call_for_papersModelParser call_for_papers_parser = new Call_for_papersModelParser();
	FlxwmModelParser flxwm_parser = new FlxwmModelParser();

		public RootModelParser() {
			sociallinks_parser = new SociallinksModelParser();
		}

		public RootModel parseRootModel(String json_object) {

			RootModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

				Callfor_papersModel callfor_papers = callfor_papers_parser.parseCallfor_papersModel(jsobj.getJSONObject("callfor_papers").toString());

				CopyrightModel copyright = copyright_parser.parseCopyrightModel(jsobj.getJSONObject("copyright").toString());

				CreatorEmailModel creatorEmail = creatorEmail_parser.parseCreatorEmailModel(jsobj.getJSONObject("creatorEmail").toString());

				ArrayList<SociallinksModel> sociallinkss = new ArrayList<>();
				JSONArray sociallinks_arr = jsobj.getJSONArray("sociallinks");

				for (int i = 0; i < sociallinks_arr.length(); i++) {

					sociallinkss.add(sociallinks_parser.parseSociallinksModel((String) sociallinks_arr.get(i)));

				}

				VersioningModel versioning = versioning_parser.parseVersioningModel(jsobj.getJSONObject("versioning").toString());

				Call_for_papersModel call_for_papers = call_for_papers_parser.parseCall_for_papersModel(jsobj.getJSONObject("call_for_papers").toString());

				FlxwmModel flxwm = flxwm_parser.parseFlxwmModel(jsobj.getJSONObject("flxwm").toString());

				local_model = new RootModel(callfor_papers, copyright, creatorEmail, jsobj.getString("type"), sociallinkss, jsobj.getString("code_of_conduct"), jsobj.getString("background_image"), jsobj.getString("starttime"), jsobj.getString("organizer_name"), versioning, jsobj.getString("privacy"), jsobj.getString("organizer_description"), call_for_papers, jsobj.getString("description"), jsobj.getString("email"), flxwm, jsobj.getString("schedule_published_on"), );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}