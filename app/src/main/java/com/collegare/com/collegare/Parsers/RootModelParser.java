import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import org.json.JSONArray;

class RootModelParser {

	CopyrightModelParser copyright_parser = new CopyrightModelParser();
	Call_for_papersModelParser call_for_papers_parser = new Call_for_papersModelParser();
	Callfor_papersModelParser callfor_papers_parser = new Callfor_papersModelParser();
	FlxwmModelParser flxwm_parser = new FlxwmModelParser();
	SociallinksModelParser sociallinks_parser;
	VersioningModelParser versioning_parser = new VersioningModelParser();
	CreatorEmailModelParser creatorEmail_parser = new CreatorEmailModelParser();

		public RootModelParser() {
			sociallinks_parser = new SociallinksModelParser();
		}

		public RootModel parseRootModel(String json_object) {

			RootModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

				CopyrightModel copyright = copyright_parser.parseCopyrightModel(jsobj.getJSONObject("copyright").toString());

				Call_for_papersModel call_for_papers = call_for_papers_parser.parseCall_for_papersModel(jsobj.getJSONObject("call_for_papers").toString());

				Callfor_papersModel callfor_papers = callfor_papers_parser.parseCallfor_papersModel(jsobj.getJSONObject("callfor_papers").toString());

				FlxwmModel flxwm = flxwm_parser.parseFlxwmModel(jsobj.getJSONObject("flxwm").toString());

				ArrayList<SociallinksModel> sociallinkss = new ArrayList<>();
				JSONArray sociallinks_arr = jsobj.getJSONArray("sociallinks");

				for (int i = 0; i < sociallinks_arr.length(); i++) {

					sociallinkss.add(sociallinks_parser.parseSociallinksModel((String) sociallinks_arr.get(i)));

				}

				VersioningModel versioning = versioning_parser.parseVersioningModel(jsobj.getJSONObject("versioning").toString());

				CreatorEmailModel creatorEmail = creatorEmail_parser.parseCreatorEmailModel(jsobj.getJSONObject("creatorEmail").toString());

				local_model = new RootModel(jsobj.getString("background_image"), jsobj.getString("organizer_name"), jsobj.getString("privacy"), jsobj.getString("code_of_conduct"), jsobj.getString("email"), jsobj.getString("starttime"), copyright, jsobj.getString("organizer_description"), call_for_papers, jsobj.getString("schedule_published_on"), jsobj.getString("type"), callfor_papers, flxwm, sociallinkss, versioning, jsobj.getString("description"), creatorEmail, );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}