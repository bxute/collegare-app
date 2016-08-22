import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import org.json.JSONArray;

class CopModelParser {

	Social_linksModelParser social_links_parser;
	VersionModelParser version_parser = new VersionModelParser();
	CreatorModelParser creator_parser = new CreatorModelParser();
	AdeesModelParser adees_parser = new AdeesModelParser();

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

			VersionModel version = version_parser.parseVersionModel(jsobj.getJSONObject("version").toString());

			CreatorModel creator = creator_parser.parseCreatorModel(jsobj.getJSONObject("creator").toString());

			AdeesModel adees = adees_parser.parseAdeesModel(jsobj.getJSONObject("adees").toString());

			local_model = new CopModel(jsobj.getInt("tracks_ver"), jsobj.getInt("speakers_ver"), jsobj.getInt("id"), jsobj.getString("end_time"), jsobj.getString("location_name"), jsobj.getString("organizer_description"), social_linkss, jsobj.getString("time_zone"), jsobj.getString("type"), jsobj.getString("state"), jsobj.getInt("sponsors_ver"), jsobj.getString("topic"), jsobj.getString("organizer_name"), version, creator, jsobj.getString("logo"), jsobj.getString("name"), jsobj.getString("start_time"), jsobj.getString("schedule_published_on"), jsobj.getString("description"), jsobj.getString("privacy"), jsobj.getString("email"), adees, );
		} catch (JSONException e) {

			e.printStackTrace();
			}

		return local_model;
		}
			
}