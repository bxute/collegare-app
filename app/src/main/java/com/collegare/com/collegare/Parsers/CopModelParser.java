import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import org.json.JSONArray;

class CopModelParser {

	CreatorModelParser creator_parser = new CreatorModelParser();
	AdeesModelParser adees_parser = new AdeesModelParser();
	SociallinksModelParser sociallinks_parser;
	VersionModelParser version_parser = new VersionModelParser();

	public CopModelParser() {
		sociallinks_parser = new SociallinksModelParser();
	}

	public CopModel parseCopModel(String json_object) {

		CopModel local_model = null;
		try {
			JSONObject jsobj = new JSONObject(json_object);

			CreatorModel creator = creator_parser.parseCreatorModel(jsobj.getJSONObject("creator").toString());

			AdeesModel adees = adees_parser.parseAdeesModel(jsobj.getJSONObject("adees").toString());

			ArrayList<SociallinksModel> sociallinkss = new ArrayList<>();
			JSONArray sociallinks_arr = jsobj.getJSONArray("sociallinks");

			for (int i = 0; i < sociallinks_arr.length(); i++) {

				sociallinkss.add(sociallinks_parser.parseSociallinksModel((String) sociallinks_arr.get(i)));

			}

			VersionModel version = version_parser.parseVersionModel(jsobj.getJSONObject("version").toString());

			local_model = new CopModel(jsobj.getString("logo"), jsobj.getString("end_time"), jsobj.getString("privacy"), jsobj.getString("organizer_name"), creator, jsobj.getInt("tracks_ver"), jsobj.getString("topic"), jsobj.getInt("speakers_ver"), jsobj.getString("description"), jsobj.getString("email"), adees, jsobj.getString("schedulepublished_on"), jsobj.getString("name"), jsobj.getString("type"), jsobj.getString("time_zone"), sociallinkss, jsobj.getString("start_time"), jsobj.getString("location_name"), jsobj.getInt("sponsors_ver"), jsobj.getString("state"), jsobj.getString("organizer_description"), version, jsobj.getInt("id"), );
		} catch (JSONException e) {

			e.printStackTrace();
			}

		return local_model;
		}
			
}