import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import org.json.JSONArray;

class RootModelParser {

	Call_for_papersModelParser call_for_papers_parser = new Call_for_papersModelParser();
	FlxwmModelParser flxwm_parser = new FlxwmModelParser();
	CreatorEmailModelParser creatorEmail_parser = new CreatorEmailModelParser();
	Callfor_papersModelParser callfor_papers_parser = new Callfor_papersModelParser();
	VersioningModelParser versioning_parser = new VersioningModelParser();
	SociallinksModelParser sociallinks_parser;
	CopyrightModelParser copyright_parser = new CopyrightModelParser();

		public RootModelParser() {
			sociallinks_parser = new SociallinksModelParser();
		}

		public RootModel parseRootModel(String json_object) {

			RootModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

				Call_for_papersModel call_for_papers = call_for_papers_parser.parseCall_for_papersModel(jsobj.getJSONObject("call_for_papers").toString());

				FlxwmModel flxwm = flxwm_parser.parseFlxwmModel(jsobj.getJSONObject("flxwm").toString());

				CreatorEmailModel creatorEmail = creatorEmail_parser.parseCreatorEmailModel(jsobj.getJSONObject("creatorEmail").toString());

				Callfor_papersModel callfor_papers = callfor_papers_parser.parseCallfor_papersModel(jsobj.getJSONObject("callfor_papers").toString());

				VersioningModel versioning = versioning_parser.parseVersioningModel(jsobj.getJSONObject("versioning").toString());

				ArrayList<SociallinksModel> sociallinkss = new ArrayList<>();
				JSONArray sociallinks_arr = jsobj.getJSONArray("sociallinks");

				for (int i = 0; i < sociallinks_arr.length(); i++) {

					sociallinkss.add(sociallinks_parser.parseSociallinksModel((String) sociallinks_arr.get(i)));

				}

				CopyrightModel copyright = copyright_parser.parseCopyrightModel(jsobj.getJSONObject("copyright").toString());

				local_model = new RootModel(call_for_papers, jsobj.getString("background_image"), flxwm, jsobj.getString("description"), jsobj.getString("email"), jsobj.getString("schedule_published_on"), creatorEmail, jsobj.getString("starttime"), jsobj.getString("privacy"), callfor_papers, versioning, jsobj.getString("organizer_name"), sociallinkss, jsobj.getString("code_of_conduct"), jsobj.getString("type"), copyright, jsobj.getString("organizer_description"), );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}