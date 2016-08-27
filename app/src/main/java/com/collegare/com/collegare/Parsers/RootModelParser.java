import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import org.json.JSONArray;

class RootModelParser {

		CopyrightModelParser copyright_parser = new CopyrightModelParser();
		VersionModelParser version_parser = new VersionModelParser();
		Call_for_papersModelParser call_for_papers_parser = new Call_for_papersModelParser();
		CreatorModelParser creator_parser = new CreatorModelParser();
		Social_linksModelParser social_links_parser;

		public RootModelParser() {
			social_links_parser = new Social_linksModelParser();
		}

		public RootModel parseRootModel(String json_object) {

			RootModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					CopyrightModel copyright = copyright_parser.parseCopyrightModel(jsobj.getJSONObject("copyright").toString());

					VersionModel version = version_parser.parseVersionModel(jsobj.getJSONObject("version").toString());

					Call_for_papersModel call_for_papers = call_for_papers_parser.parseCall_for_papersModel(jsobj.getJSONObject("call_for_papers").toString());

					CreatorModel creator = creator_parser.parseCreatorModel(jsobj.getJSONObject("creator").toString());

					ArrayList<Social_linksModel> social_linkss = new ArrayList<>();
					JSONArray social_links_arr = jsobj.getJSONArray("social_links");
			
					for(int i = 0 ;i<social_links_arr.length();i++){

 						social_linkss.add(social_links_parser.parseSocial_linksModel((String)social_links_arr.get(i)));

					}

					local_model = new RootModel(copyright, version, jsobj.getString("timezone") , jsobj.getString("organizer_description") , jsobj.getString("privacy") , jsobj.getString("state") , jsobj.getString("location_name") , jsobj.getString("logo") , call_for_papers, creator, jsobj.getString("organizer_name") , jsobj.getString("background_image") , jsobj.getString("end_time") , social_linkss, jsobj.getString("code_of_conduct") , jsobj.getString("topic") , jsobj.getString("name") , jsobj.getString("type") , jsobj.getString("email") , jsobj.getString("schedule_published_on") , jsobj.getInt("id") , jsobj.getString("start_time") , jsobj.getString("description") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}