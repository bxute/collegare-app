import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import org.json.JSONArray;

class CopModelParser {

	SociallinksModelParser sociallinks_parser;
	VersionModelParser version_parser = new VersionModelParser();
	CreatorModelParser creator_parser = new CreatorModelParser();
	AdeesModelParser adees_parser = new AdeesModelParser();

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

			VersionModel version = version_parser.parseVersionModel(jsobj.getJSONObject("version").toString());

			CreatorModel creator = creator_parser.parseCreatorModel(jsobj.getJSONObject("creator").toString());

			AdeesModel adees = adees_parser.parseAdeesModel(jsobj.getJSONObject("adees").toString());

			local_model = new CopModel(sociallinkss, jsobj.getString("start_time"), version, jsobj.getString("time_zone"), jsobj.getInt("id"), jsobj.getInt("speakers_ver"), jsobj.getString("end_time"), jsobj.getInt("tracks_ver"), jsobj.getString("description"), jsobj.getString("schedulepublished_on"), jsobj.getString("location_name"), jsobj.getString("email"), jsobj.getString("logo"), jsobj.getString("name"), jsobj.getString("state"), creator, adees, jsobj.getString("privacy"), jsobj.getString("type"), jsobj.getString("topic"), jsobj.getString("organizer_name"), jsobj.getString("organizer_description"), jsobj.getInt("sponsors_ver"), );
		} catch (JSONException e) {

			e.printStackTrace();
			}

		return local_model;
		}
			
}