import java.util.ArrayList;

class CopModel {

	public String organizer_name;
	public String state;
	public VersionModel _version;
	public String end_time;
	public String location_name;
	public String name;
	public String time_zone;
	public int speakers_ver;
	public String email;
	public ArrayList<SociallinksModel> sociallinks;
	public CreatorModel _creator;
	public int sponsors_ver;
	public String privacy;
	public String start_time;
	public int id;
	public String schedulepublished_on;
	public String logo;
	public String description;
	public AdeesModel _adees;
	public String type;
	public String topic;
	public int tracks_ver;
	public String organizer_description;

	public CopModel(String organizer_name, String state, VersionModel version, String end_time, String location_name, String name, String time_zone, int speakers_ver, String email, ArrayList<SociallinksModel> sociallinks, CreatorModel creator, int sponsors_ver, String privacy, String start_time, int id, String schedulepublished_on, String logo, String description, AdeesModel adees, String type, String topic, int tracks_ver, String organizer_description) {

		this.organizer_name = organizer_name;
		this.state = state;
		this._version = version;
		this.end_time = end_time;
		this.location_name = location_name;
		this.name = name;
		this.time_zone = time_zone;
		this.speakers_ver = speakers_ver;
		this.email = email;
		this.sociallinks = sociallinks;
		this._creator = creator;
		this.sponsors_ver = sponsors_ver;
		this.privacy = privacy;
		this.start_time = start_time;
		this.id = id;
		this.schedulepublished_on = schedulepublished_on;
		this.logo = logo;
		this.description = description;
		this._adees = adees;
		this.type = type;
		this.topic = topic;
		this.tracks_ver = tracks_ver;
		this.organizer_description = organizer_description;

	}

}