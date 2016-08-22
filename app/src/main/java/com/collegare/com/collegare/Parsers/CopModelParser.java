import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import org.json.JSONArray;

class CopModelParser {

	SociallinksModelParser sociallinks_parser;
	AdeesModelParser adees_parser = new AdeesModelParser();
	CreatorModelParser creator_parser = new CreatorModelParser();
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

			AdeesModel adees = adees_parser.parseAdeesModel(jsobj.getJSONObject("adees").toString());

			CreatorModel creator = creator_parser.parseCreatorModel(jsobj.getJSONObject("creator").toString());

			VersionModel version = version_parser.parseVersionModel(jsobj.getJSONObject("version").toString());

			local_model = new CopModel(jsobj.getString("time_zone"), jsobj.getString("schedulepublished_on"), jsobj.getString("start_time"), jsobj.getInt("speakers_ver"), jsobj.getString("logo"), sociallinkss, jsobj.getString("topic"), jsobj.getString("type"), jsobj.getInt("tracks_ver"), jsobj.getInt("sponsors_ver"), jsobj.getString("organizer_description"), jsobj.getInt("id"), adees, jsobj.getString("state"), jsobj.getString("description"), jsobj.getString("email"), creator, jsobj.getString("privacy"), jsobj.getString("name"), version, jsobj.getString("end_time"), jsobj.getString("location_name"), jsobj.getString("organizer_name"), );
		} catch (JSONException e) {

			e.printStackTrace();
			}

		return local_model;
		}
			
}