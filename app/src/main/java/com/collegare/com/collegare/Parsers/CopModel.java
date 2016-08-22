import java.util.ArrayList;

class CopModel {

	public String logo;
	public String end_time;
	public String privacy;
	public String organizer_name;
	public CreatorModel _creator;
	public int tracks_ver;
	public String topic;
	public int speakers_ver;
	public String description;
	public String email;
	public AdeesModel _adees;
	public String schedulepublished_on;
	public String name;
	public String type;
	public String time_zone;
	public ArrayList<SociallinksModel> sociallinks;
	public String start_time;
	public String location_name;
	public int sponsors_ver;
	public String state;
	public String organizer_description;
	public VersionModel _version;
	public int id;

	public CopModel(String logo, String end_time, String privacy, String organizer_name, CreatorModel creator, int tracks_ver, String topic, int speakers_ver, String description, String email, AdeesModel adees, String schedulepublished_on, String name, String type, String time_zone, ArrayList<SociallinksModel> sociallinks, String start_time, String location_name, int sponsors_ver, String state, String organizer_description, VersionModel version, int id) {

		this.logo = logo;
		this.end_time = end_time;
		this.privacy = privacy;
		this.organizer_name = organizer_name;
		this._creator = creator;
		this.tracks_ver = tracks_ver;
		this.topic = topic;
		this.speakers_ver = speakers_ver;
		this.description = description;
		this.email = email;
		this._adees = adees;
		this.schedulepublished_on = schedulepublished_on;
		this.name = name;
		this.type = type;
		this.time_zone = time_zone;
		this.sociallinks = sociallinks;
		this.start_time = start_time;
		this.location_name = location_name;
		this.sponsors_ver = sponsors_ver;
		this.state = state;
		this.organizer_description = organizer_description;
		this._version = version;
		this.id = id;

	}

}