import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import org.json.JSONArray;

class CopModelParser {

	VersionModelParser version_parser = new VersionModelParser();
	SociallinksModelParser sociallinks_parser;
	CreatorModelParser creator_parser = new CreatorModelParser();
	AdeesModelParser adees_parser = new AdeesModelParser();

	public CopModelParser() {
		sociallinks_parser = new SociallinksModelParser();
	}

	public CopModel parseCopModel(String json_object) {

		CopModel local_model = null;
		try {
			JSONObject jsobj = new JSONObject(json_object);

			VersionModel version = version_parser.parseVersionModel(jsobj.getJSONObject("version").toString());

			ArrayList<SociallinksModel> sociallinkss = new ArrayList<>();
			JSONArray sociallinks_arr = jsobj.getJSONArray("sociallinks");

			for (int i = 0; i < sociallinks_arr.length(); i++) {

				sociallinkss.add(sociallinks_parser.parseSociallinksModel((String) sociallinks_arr.get(i)));

			}

			CreatorModel creator = creator_parser.parseCreatorModel(jsobj.getJSONObject("creator").toString());

			AdeesModel adees = adees_parser.parseAdeesModel(jsobj.getJSONObject("adees").toString());

			local_model = new CopModel(jsobj.getString("organizer_name"), jsobj.getString("state"), version, jsobj.getString("end_time"), jsobj.getString("location_name"), jsobj.getString("name"), jsobj.getString("time_zone"), jsobj.getInt("speakers_ver"), jsobj.getString("email"), sociallinkss, creator, jsobj.getInt("sponsors_ver"), jsobj.getString("privacy"), jsobj.getString("start_time"), jsobj.getInt("id"), jsobj.getString("schedulepublished_on"), jsobj.getString("logo"), jsobj.getString("description"), adees, jsobj.getString("type"), jsobj.getString("topic"), jsobj.getInt("tracks_ver"), jsobj.getString("organizer_description"), );
		} catch (JSONException e) {

			e.printStackTrace();
			}

		return local_model;
		}
			
}