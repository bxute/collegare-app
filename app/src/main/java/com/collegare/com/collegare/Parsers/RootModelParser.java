import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import org.json.JSONArray;

class RootModelParser {

	CreatorEmailModelParser creatorEmail_parser = new CreatorEmailModelParser();
	SociallinksModelParser sociallinks_parser;
	CopyrightModelParser copyright_parser = new CopyrightModelParser();
	FlxwmModelParser flxwm_parser = new FlxwmModelParser();
	Call_for_papersModelParser call_for_papers_parser = new Call_for_papersModelParser();
	VersioningModelParser versioning_parser = new VersioningModelParser();
	Callfor_papersModelParser callfor_papers_parser = new Callfor_papersModelParser();

		public RootModelParser() {
			sociallinks_parser = new SociallinksModelParser();
		}

		public RootModel parseRootModel(String json_object) {

			RootModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

				CreatorEmailModel creatorEmail = creatorEmail_parser.parseCreatorEmailModel(jsobj.getJSONObject("creatorEmail").toString());

				ArrayList<SociallinksModel> sociallinkss = new ArrayList<>();
				JSONArray sociallinks_arr = jsobj.getJSONArray("sociallinks");

				for (int i = 0; i < sociallinks_arr.length(); i++) {

					sociallinkss.add(sociallinks_parser.parseSociallinksModel((String) sociallinks_arr.get(i)));

				}

				CopyrightModel copyright = copyright_parser.parseCopyrightModel(jsobj.getJSONObject("copyright").toString());

				FlxwmModel flxwm = flxwm_parser.parseFlxwmModel(jsobj.getJSONObject("flxwm").toString());

				Call_for_papersModel call_for_papers = call_for_papers_parser.parseCall_for_papersModel(jsobj.getJSONObject("call_for_papers").toString());

				VersioningModel versioning = versioning_parser.parseVersioningModel(jsobj.getJSONObject("versioning").toString());

				Callfor_papersModel callfor_papers = callfor_papers_parser.parseCallfor_papersModel(jsobj.getJSONObject("callfor_papers").toString());

				local_model = new RootModel(jsobj.getString("organizer_description"), creatorEmail, jsobj.getString("organizer_name"), jsobj.getString("description"), sociallinkss, copyright, flxwm, jsobj.getString("privacy"), jsobj.getString("schedule_published_on"), call_for_papers, versioning, jsobj.getString("type"), jsobj.getString("code_of_conduct"), callfor_papers, jsobj.getString("starttime"), jsobj.getString("email"), jsobj.getString("background_image"), );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}