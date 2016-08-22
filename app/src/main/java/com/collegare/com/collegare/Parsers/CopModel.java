import java.util.ArrayList;

class CopModel {

	public String schedulepublished_on;
	public String organizer_description;
	public String time_zone;
	public String topic;
	public String logo;
	public VersionModel _version;
	public String type;
	public CreatorModel _creator;
	public String name;
	public String description;
	public String privacy;
	public String state;
	public int tracks_ver;
	public String email;
	public String organizer_name;
	public ArrayList<SociallinksModel> sociallinks;
	public AdeesModel _adees;
	public String start_time;
	public String location_name;
	public int speakers_ver;
	public String end_time;
	public int sponsors_ver;
	public int id;

	public CopModel(String schedulepublished_on, String organizer_description, String time_zone, String topic, String logo, VersionModel version, String type, CreatorModel creator, String name, String description, String privacy, String state, int tracks_ver, String email, String organizer_name, ArrayList<SociallinksModel> sociallinks, AdeesModel adees, String start_time, String location_name, int speakers_ver, String end_time, int sponsors_ver, int id) {

		this.schedulepublished_on = schedulepublished_on;
		this.organizer_description = organizer_description;
		this.time_zone = time_zone;
		this.topic = topic;
		this.logo = logo;
		this._version = version;
		this.type = type;
		this._creator = creator;
		this.name = name;
		this.description = description;
		this.privacy = privacy;
		this.state = state;
		this.tracks_ver = tracks_ver;
		this.email = email;
		this.organizer_name = organizer_name;
		this.sociallinks = sociallinks;
		this._adees = adees;
		this.start_time = start_time;
		this.location_name = location_name;
		this.speakers_ver = speakers_ver;
		this.end_time = end_time;
		this.sponsors_ver = sponsors_ver;
		this.id = id;

	}

}