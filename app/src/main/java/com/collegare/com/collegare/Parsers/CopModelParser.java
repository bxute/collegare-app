import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import org.json.JSONArray;

class CopModelParser {

	AdeesModelParser adees_parser = new AdeesModelParser();
	VersionModelParser version_parser = new VersionModelParser();
	CreatorModelParser creator_parser = new CreatorModelParser();
	Social_linksModelParser social_links_parser;

	public CopModelParser() {
		social_links_parser = new Social_linksModelParser();
	}

	public CopModel parseCopModel(String json_object) {

		CopModel local_model = null;
		try {
			JSONObject jsobj = new JSONObject(json_object);

			AdeesModel adees = adees_parser.parseAdeesModel(jsobj.getJSONObject("adees").toString());

			VersionModel version = version_parser.parseVersionModel(jsobj.getJSONObject("version").toString());

			CreatorModel creator = creator_parser.parseCreatorModel(jsobj.getJSONObject("creator").toString());

			ArrayList<Social_linksModel> social_linkss = new ArrayList<>();
			JSONArray social_links_arr = jsobj.getJSONArray("social_links");

			for (int i = 0; i < social_links_arr.length(); i++) {

				social_linkss.add(social_links_parser.parseSocial_linksModel((String) social_links_arr.get(i)));

			}

			local_model = new CopModel(jsobj.getInt("id"), jsobj.getString("end_time"), jsobj.getInt("speakers_ver"), adees, jsobj.getString("type"), version, jsobj.getString("state"), jsobj.getString("schedule_published_on"), jsobj.getString("privacy"), jsobj.getInt("tracks_ver"), jsobj.getString("location_name"), jsobj.getString("start_time"), jsobj.getInt("sponsors_ver"), creator, jsobj.getString("name"), jsobj.getString("time_zone"), social_linkss, jsobj.getString("organizer_description"), jsobj.getString("description"), jsobj.getString("organizer_name"), jsobj.getString("email"), jsobj.getString("logo"), jsobj.getString("topic"), );
		} catch (JSONException e) {

			e.printStackTrace();
		}

		return local_model;
	}
			
}