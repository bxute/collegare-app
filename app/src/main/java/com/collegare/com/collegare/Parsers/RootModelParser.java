import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import org.json.JSONArray;

class RootModelParser {

	SociallinksModelParser sociallinks_parser;
	Call_for_papersModelParser call_for_papers_parser = new Call_for_papersModelParser();
	CreatorEmailModelParser creatorEmail_parser = new CreatorEmailModelParser();
	FlxwmModelParser flxwm_parser = new FlxwmModelParser();
	CopyrightModelParser copyright_parser = new CopyrightModelParser();
	VersioningModelParser versioning_parser = new VersioningModelParser();
	Callfor_papersModelParser callfor_papers_parser = new Callfor_papersModelParser();

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

				FlxwmModel flxwm = flxwm_parser.parseFlxwmModel(jsobj.getJSONObject("flxwm").toString());

				CopyrightModel copyright = copyright_parser.parseCopyrightModel(jsobj.getJSONObject("copyright").toString());

				VersioningModel versioning = versioning_parser.parseVersioningModel(jsobj.getJSONObject("versioning").toString());

				Callfor_papersModel callfor_papers = callfor_papers_parser.parseCallfor_papersModel(jsobj.getJSONObject("callfor_papers").toString());

				local_model = new RootModel(jsobj.getString("organizer_description"), sociallinkss, call_for_papers, creatorEmail, jsobj.getString("privacy"), flxwm, jsobj.getString("starttime"), jsobj.getString("organizer_name"), copyright, jsobj.getString("type"), jsobj.getString("email"), versioning, callfor_papers, jsobj.getString("background_image"), jsobj.getString("code_of_conduct"), jsobj.getString("description"), jsobj.getString("schedule_published_on"), );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}