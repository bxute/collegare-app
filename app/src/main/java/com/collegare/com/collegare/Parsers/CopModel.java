import java.util.ArrayList;

class CopModel {

	public String time_zone;
	public String schedulepublished_on;
	public String start_time;
	public int speakers_ver;
	public String logo;
	public ArrayList<SociallinksModel> sociallinks;
	public String topic;
	public String type;
	public int tracks_ver;
	public int sponsors_ver;
	public String organizer_description;
	public int id;
	public AdeesModel _adees;
	public String state;
	public String description;
	public String email;
	public CreatorModel _creator;
	public String privacy;
	public String name;
	public VersionModel _version;
	public String end_time;
	public String location_name;
	public String organizer_name;

	public CopModel(String time_zone, String schedulepublished_on, String start_time, int speakers_ver, String logo, ArrayList<SociallinksModel> sociallinks, String topic, String type, int tracks_ver, int sponsors_ver, String organizer_description, int id, AdeesModel adees, String state, String description, String email, CreatorModel creator, String privacy, String name, VersionModel version, String end_time, String location_name, String organizer_name) {

		this.time_zone = time_zone;
		this.schedulepublished_on = schedulepublished_on;
		this.start_time = start_time;
		this.speakers_ver = speakers_ver;
		this.logo = logo;
		this.sociallinks = sociallinks;
		this.topic = topic;
		this.type = type;
		this.tracks_ver = tracks_ver;
		this.sponsors_ver = sponsors_ver;
		this.organizer_description = organizer_description;
		this.id = id;
		this._adees = adees;
		this.state = state;
		this.description = description;
		this.email = email;
		this._creator = creator;
		this.privacy = privacy;
		this.name = name;
		this._version = version;
		this.end_time = end_time;
		this.location_name = location_name;
		this.organizer_name = organizer_name;

	}

}