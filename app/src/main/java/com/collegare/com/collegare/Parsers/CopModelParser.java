import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import org.json.JSONArray;

class CopModelParser {

	VersionModelParser version_parser = new VersionModelParser();
	SociallinksModelParser sociallinks_parser;
	AdeesModelParser adees_parser = new AdeesModelParser();
	CreatorModelParser creator_parser = new CreatorModelParser();

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

			AdeesModel adees = adees_parser.parseAdeesModel(jsobj.getJSONObject("adees").toString());

			CreatorModel creator = creator_parser.parseCreatorModel(jsobj.getJSONObject("creator").toString());

			local_model = new CopModel(jsobj.getString("description"), jsobj.getInt("id"), jsobj.getInt("tracks_ver"), jsobj.getString("email"), jsobj.getString("name"), jsobj.getString("state"), jsobj.getString("schedulepublished_on"), version, jsobj.getString("location_name"), jsobj.getString("type"), sociallinkss, jsobj.getString("end_time"), jsobj.getString("organizer_name"), jsobj.getString("logo"), jsobj.getString("time_zone"), adees, jsobj.getString("start_time"), jsobj.getInt("sponsors_ver"), creator, jsobj.getString("privacy"), jsobj.getString("topic"), jsobj.getString("organizer_description"), jsobj.getInt("speakers_ver"), );
		} catch (JSONException e) {

			e.printStackTrace();
			}

		return local_model;
		}
			
}