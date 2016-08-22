import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import org.json.JSONArray;

class CopModelParser {

	AdeesModelParser adees_parser = new AdeesModelParser();
	VersionModelParser version_parser = new VersionModelParser();
	SociallinksModelParser sociallinks_parser;
	CreatorModelParser creator_parser = new CreatorModelParser();

	public CopModelParser() {
		sociallinks_parser = new SociallinksModelParser();
	}

	public CopModel parseCopModel(String json_object) {

		CopModel local_model = null;
		try {
			JSONObject jsobj = new JSONObject(json_object);

			AdeesModel adees = adees_parser.parseAdeesModel(jsobj.getJSONObject("adees").toString());

			VersionModel version = version_parser.parseVersionModel(jsobj.getJSONObject("version").toString());

			ArrayList<SociallinksModel> sociallinkss = new ArrayList<>();
			JSONArray sociallinks_arr = jsobj.getJSONArray("sociallinks");

			for (int i = 0; i < sociallinks_arr.length(); i++) {

				sociallinkss.add(sociallinks_parser.parseSociallinksModel((String) sociallinks_arr.get(i)));

			}

			CreatorModel creator = creator_parser.parseCreatorModel(jsobj.getJSONObject("creator").toString());

			local_model = new CopModel(adees, jsobj.getString("privacy"), jsobj.getInt("speakers_ver"), jsobj.getString("topic"), jsobj.getString("type"), jsobj.getInt("tracks_ver"), jsobj.getString("schedulepublished_on"), version, jsobj.getString("location_name"), jsobj.getString("logo"), jsobj.getString("description"), jsobj.getString("time_zone"), jsobj.getInt("sponsors_ver"), jsobj.getString("name"), sociallinkss, creator, jsobj.getString("organizer_description"), jsobj.getString("state"), jsobj.getString("end_time"), jsobj.getString("organizer_name"), jsobj.getString("email"), jsobj.getInt("id"), jsobj.getString("start_time"), );
		} catch (JSONException e) {

			e.printStackTrace();
			}

		return local_model;
		}
			
}