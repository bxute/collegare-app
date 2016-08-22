import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import org.json.JSONArray;

class CopModelParser {

	Social_linksModelParser social_links_parser;
	AdeesModelParser adees_parser = new AdeesModelParser();
	CreatorModelParser creator_parser = new CreatorModelParser();
	VersionModelParser version_parser = new VersionModelParser();

	public CopModelParser() {
		social_links_parser = new Social_linksModelParser();
	}

	public CopModel parseCopModel(String json_object) {

		CopModel local_model = null;
		try {
			JSONObject jsobj = new JSONObject(json_object);

			ArrayList<Social_linksModel> social_linkss = new ArrayList<>();
			JSONArray social_links_arr = jsobj.getJSONArray("social_links");

			for (int i = 0; i < social_links_arr.length(); i++) {

				social_linkss.add(social_links_parser.parseSocial_linksModel((String) social_links_arr.get(i)));

			}

			AdeesModel adees = adees_parser.parseAdeesModel(jsobj.getJSONObject("adees").toString());

			CreatorModel creator = creator_parser.parseCreatorModel(jsobj.getJSONObject("creator").toString());

			VersionModel version = version_parser.parseVersionModel(jsobj.getJSONObject("version").toString());

			local_model = new CopModel(jsobj.getInt("tracks_ver"), jsobj.getString("location_name"), jsobj.getString("description"), jsobj.getString("topic"), jsobj.getString("logo"), jsobj.getString("organizer_description"), jsobj.getString("end_time"), jsobj.getInt("id"), social_linkss, jsobj.getString("name"), jsobj.getString("time_zone"), jsobj.getString("schedule_published_on"), jsobj.getString("state"), jsobj.getInt("sponsors_ver"), adees, creator, jsobj.getInt("speakers_ver"), jsobj.getString("email"), jsobj.getString("start_time"), jsobj.getString("organizer_name"), jsobj.getString("type"), version, jsobj.getString("privacy"), );
		} catch (JSONException e) {

			e.printStackTrace();
			}

		return local_model;
		}
			
}