import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import org.json.JSONArray;

class RootModelParser {

	FlxwmModelParser flxwm_parser = new FlxwmModelParser();
	Call_for_papersModelParser call_for_papers_parser = new Call_for_papersModelParser();
	VersioningModelParser versioning_parser = new VersioningModelParser();
	CreatorEmailModelParser creatorEmail_parser = new CreatorEmailModelParser();
	Callfor_papersModelParser callfor_papers_parser = new Callfor_papersModelParser();
	CopyrightModelParser copyright_parser = new CopyrightModelParser();
	SociallinksModelParser sociallinks_parser;

		public RootModelParser() {
			sociallinks_parser = new SociallinksModelParser();
		}

		public RootModel parseRootModel(String json_object) {

			RootModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

				FlxwmModel flxwm = flxwm_parser.parseFlxwmModel(jsobj.getJSONObject("flxwm").toString());

				Call_for_papersModel call_for_papers = call_for_papers_parser.parseCall_for_papersModel(jsobj.getJSONObject("call_for_papers").toString());

				VersioningModel versioning = versioning_parser.parseVersioningModel(jsobj.getJSONObject("versioning").toString());

				CreatorEmailModel creatorEmail = creatorEmail_parser.parseCreatorEmailModel(jsobj.getJSONObject("creatorEmail").toString());

				Callfor_papersModel callfor_papers = callfor_papers_parser.parseCallfor_papersModel(jsobj.getJSONObject("callfor_papers").toString());

				CopyrightModel copyright = copyright_parser.parseCopyrightModel(jsobj.getJSONObject("copyright").toString());

				ArrayList<SociallinksModel> sociallinkss = new ArrayList<>();
				JSONArray sociallinks_arr = jsobj.getJSONArray("sociallinks");

				for (int i = 0; i < sociallinks_arr.length(); i++) {

					sociallinkss.add(sociallinks_parser.parseSociallinksModel((String) sociallinks_arr.get(i)));

				}

				local_model = new RootModel(jsobj.getString("email"), flxwm, jsobj.getString("code_of_conduct"), call_for_papers, versioning, jsobj.getString("organizer_description"), jsobj.getString("background_image"), jsobj.getString("privacy"), creatorEmail, jsobj.getString("description"), callfor_papers, copyright, jsobj.getString("schedule_published_on"), jsobj.getString("organizer_name"), sociallinkss, jsobj.getString("starttime"), jsobj.getString("type"), );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}