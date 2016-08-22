import java.util.ArrayList;

class CopModel {

	public String location_name;
	public String organizer_description;
	public String organizer_name;
	public int speakers_ver;
	public int tracks_ver;
	public String name;
	public int sponsors_ver;
	public String description;
	public String schedulepublished_on;
	public String privacy;
	public ArrayList<SociallinksModel> sociallinks;
	public String end_time;
	public CreatorModel _creator;
	public String logo;
	public VersionModel _version;
	public String time_zone;
	public String type;
	public String start_time;
	public AdeesModel _adees;
	public String topic;
	public String state;
	public String email;
	public int id;

	public CopModel(String location_name, String organizer_description, String organizer_name, int speakers_ver, int tracks_ver, String name, int sponsors_ver, String description, String schedulepublished_on, String privacy, ArrayList<SociallinksModel> sociallinks, String end_time, CreatorModel creator, String logo, VersionModel version, String time_zone, String type, String start_time, AdeesModel adees, String topic, String state, String email, int id) {

		this.location_name = location_name;
		this.organizer_description = organizer_description;
		this.organizer_name = organizer_name;
		this.speakers_ver = speakers_ver;
		this.tracks_ver = tracks_ver;
		this.name = name;
		this.sponsors_ver = sponsors_ver;
		this.description = description;
		this.schedulepublished_on = schedulepublished_on;
		this.privacy = privacy;
		this.sociallinks = sociallinks;
		this.end_time = end_time;
		this._creator = creator;
		this.logo = logo;
		this._version = version;
		this.time_zone = time_zone;
		this.type = type;
		this.start_time = start_time;
		this._adees = adees;
		this.topic = topic;
		this.state = state;
		this.email = email;
		this.id = id;

	}

}