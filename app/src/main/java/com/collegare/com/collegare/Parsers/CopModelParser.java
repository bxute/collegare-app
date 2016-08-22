import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import org.json.JSONArray;

class CopModelParser {

	CreatorModelParser creator_parser = new CreatorModelParser();
	AdeesModelParser adees_parser = new AdeesModelParser();
	Social_linksModelParser social_links_parser;
	VersionModelParser version_parser = new VersionModelParser();

	public CopModelParser() {
		social_links_parser = new Social_linksModelParser();
	}

	public CopModel parseCopModel(String json_object) {

		CopModel local_model = null;
		try {
			JSONObject jsobj = new JSONObject(json_object);

			CreatorModel creator = creator_parser.parseCreatorModel(jsobj.getJSONObject("creator").toString());

			AdeesModel adees = adees_parser.parseAdeesModel(jsobj.getJSONObject("adees").toString());

			ArrayList<Social_linksModel> social_linkss = new ArrayList<>();
			JSONArray social_links_arr = jsobj.getJSONArray("social_links");

			for (int i = 0; i < social_links_arr.length(); i++) {

				social_linkss.add(social_links_parser.parseSocial_linksModel((String) social_links_arr.get(i)));

			}

			VersionModel version = version_parser.parseVersionModel(jsobj.getJSONObject("version").toString());

			local_model = new CopModel(creator, jsobj.getInt("speakers_ver"), jsobj.getString("end_time"), jsobj.getString("topic"), jsobj.getString("state"), jsobj.getString("description"), jsobj.getString("location_name"), jsobj.getString("time_zone"), jsobj.getString("start_time"), adees, jsobj.getString("privacy"), jsobj.getString("logo"), social_linkss, jsobj.getString("organizer_name"), jsobj.getInt("sponsors_ver"), jsobj.getInt("id"), jsobj.getInt("tracks_ver"), version, jsobj.getString("organizer_description"), jsobj.getString("type"), jsobj.getString("name"), jsobj.getString("schedule_published_on"), jsobj.getString("email"), );
		} catch (JSONException e) {

			e.printStackTrace();
			}

		return local_model;
		}
			
}