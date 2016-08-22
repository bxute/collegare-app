import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import org.json.JSONArray;

class CopModelParser {

	SociallinksModelParser sociallinks_parser;
	CreatorModelParser creator_parser = new CreatorModelParser();
	AdeesModelParser adees_parser = new AdeesModelParser();
	VersionModelParser version_parser = new VersionModelParser();

	public CopModelParser() {
		sociallinks_parser = new SociallinksModelParser();
	}

	public CopModel parseCopModel(String json_object) {

		CopModel local_model = null;
		try {
			JSONObject jsobj = new JSONObject(json_object);

			ArrayList<SociallinksModel> sociallinkss = new ArrayList<>();
			JSONArray sociallinks_arr = jsobj.getJSONArray("sociallinks");

			for (int i = 0; i < sociallinks_arr.length(); i++) {

				sociallinkss.add(sociallinks_parser.parseSociallinksModel((String) sociallinks_arr.get(i)));

			}

			CreatorModel creator = creator_parser.parseCreatorModel(jsobj.getJSONObject("creator").toString());

			AdeesModel adees = adees_parser.parseAdeesModel(jsobj.getJSONObject("adees").toString());

			VersionModel version = version_parser.parseVersionModel(jsobj.getJSONObject("version").toString());

			local_model = new CopModel(sociallinkss, jsobj.getString("time_zone"), jsobj.getString("privacy"), jsobj.getInt("id"), jsobj.getString("description"), jsobj.getInt("tracks_ver"), jsobj.getString("logo"), jsobj.getString("schedulepublished_on"), jsobj.getString("name"), creator, jsobj.getString("location_name"), adees, jsobj.getInt("speakers_ver"), jsobj.getString("start_time"), version, jsobj.getInt("sponsors_ver"), jsobj.getString("end_time"), jsobj.getString("organizer_name"), jsobj.getString("topic"), jsobj.getString("state"), jsobj.getString("type"), jsobj.getString("email"), jsobj.getString("organizer_description"), );
		} catch (JSONException e) {

			e.printStackTrace();
			}

		return local_model;
		}
			
}