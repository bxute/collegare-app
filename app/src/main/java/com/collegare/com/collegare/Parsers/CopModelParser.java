import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import org.json.JSONArray;

class CopModelParser {

	CreatorModelParser creator_parser = new CreatorModelParser();
	SociallinksModelParser sociallinks_parser;
	VersionModelParser version_parser = new VersionModelParser();
	AdeesModelParser adees_parser = new AdeesModelParser();

	public CopModelParser() {
		sociallinks_parser = new SociallinksModelParser();
	}

	public CopModel parseCopModel(String json_object) {

		CopModel local_model = null;
		try {
			JSONObject jsobj = new JSONObject(json_object);

			CreatorModel creator = creator_parser.parseCreatorModel(jsobj.getJSONObject("creator").toString());

			ArrayList<SociallinksModel> sociallinkss = new ArrayList<>();
			JSONArray sociallinks_arr = jsobj.getJSONArray("sociallinks");

			for (int i = 0; i < sociallinks_arr.length(); i++) {

				sociallinkss.add(sociallinks_parser.parseSociallinksModel((String) sociallinks_arr.get(i)));

			}

			VersionModel version = version_parser.parseVersionModel(jsobj.getJSONObject("version").toString());

			AdeesModel adees = adees_parser.parseAdeesModel(jsobj.getJSONObject("adees").toString());

			local_model = new CopModel(jsobj.getString("email"), jsobj.getString("location_name"), jsobj.getInt("id"), jsobj.getString("name"), jsobj.getString("organizer_description"), jsobj.getString("time_zone"), jsobj.getString("privacy"), jsobj.getString("description"), jsobj.getString("organizer_name"), jsobj.getInt("sponsors_ver"), jsobj.getString("state"), jsobj.getString("start_time"), jsobj.getString("schedulepublished_on"), creator, jsobj.getInt("speakers_ver"), jsobj.getString("logo"), sociallinkss, version, jsobj.getString("topic"), jsobj.getString("end_time"), adees, jsobj.getString("type"), jsobj.getInt("tracks_ver"), );
		} catch (JSONException e) {

			e.printStackTrace();
			}

		return local_model;
		}
			
}