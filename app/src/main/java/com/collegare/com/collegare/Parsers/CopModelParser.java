import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import org.json.JSONArray;

class CopModelParser {

	AdeesModelParser adees_parser = new AdeesModelParser();
	VersionModelParser version_parser = new VersionModelParser();
	CreatorModelParser creator_parser = new CreatorModelParser();
	SociallinksModelParser sociallinks_parser;

	public CopModelParser() {
		sociallinks_parser = new SociallinksModelParser();
	}

	public CopModel parseCopModel(String json_object) {

		CopModel local_model = null;
		try {
			JSONObject jsobj = new JSONObject(json_object);

			AdeesModel adees = adees_parser.parseAdeesModel(jsobj.getJSONObject("adees").toString());

			VersionModel version = version_parser.parseVersionModel(jsobj.getJSONObject("version").toString());

			CreatorModel creator = creator_parser.parseCreatorModel(jsobj.getJSONObject("creator").toString());

			ArrayList<SociallinksModel> sociallinkss = new ArrayList<>();
			JSONArray sociallinks_arr = jsobj.getJSONArray("sociallinks");

			for (int i = 0; i < sociallinks_arr.length(); i++) {

				sociallinkss.add(sociallinks_parser.parseSociallinksModel((String) sociallinks_arr.get(i)));

			}

			local_model = new CopModel(jsobj.getString("logo"), jsobj.getString("type"), adees, version, jsobj.getString("privacy"), jsobj.getString("time_zone"), jsobj.getString("organizer_description"), jsobj.getString("start_time"), jsobj.getString("organizer_name"), jsobj.getString("email"), creator, jsobj.getString("topic"), jsobj.getString("end_time"), jsobj.getString("state"), jsobj.getString("description"), jsobj.getString("schedulepublished_on"), jsobj.getInt("tracks_ver"), jsobj.getString("location_name"), jsobj.getString("name"), jsobj.getInt("id"), sociallinkss, jsobj.getInt("speakers_ver"), jsobj.getInt("sponsors_ver"), );
		} catch (JSONException e) {

			e.printStackTrace();
			}

		return local_model;
		}
			
}