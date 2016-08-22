import java.util.ArrayList;

class CopModel {

	public String email;
	public String location_name;
	public int id;
	public String name;
	public String organizer_description;
	public String time_zone;
	public String privacy;
	public String description;
	public String organizer_name;
	public int sponsors_ver;
	public String state;
	public String start_time;
	public String schedulepublished_on;
	public CreatorModel _creator;
	public int speakers_ver;
	public String logo;
	public ArrayList<SociallinksModel> sociallinks;
	public VersionModel _version;
	public String topic;
	public String end_time;
	public AdeesModel _adees;
	public String type;
	public int tracks_ver;

	public CopModel(String email, String location_name, int id, String name, String organizer_description, String time_zone, String privacy, String description, String organizer_name, int sponsors_ver, String state, String start_time, String schedulepublished_on, CreatorModel creator, int speakers_ver, String logo, ArrayList<SociallinksModel> sociallinks, VersionModel version, String topic, String end_time, AdeesModel adees, String type, int tracks_ver) {

		this.email = email;
		this.location_name = location_name;
		this.id = id;
		this.name = name;
		this.organizer_description = organizer_description;
		this.time_zone = time_zone;
		this.privacy = privacy;
		this.description = description;
		this.organizer_name = organizer_name;
		this.sponsors_ver = sponsors_ver;
		this.state = state;
		this.start_time = start_time;
		this.schedulepublished_on = schedulepublished_on;
		this._creator = creator;
		this.speakers_ver = speakers_ver;
		this.logo = logo;
		this.sociallinks = sociallinks;
		this._version = version;
		this.topic = topic;
		this.end_time = end_time;
		this._adees = adees;
		this.type = type;
		this.tracks_ver = tracks_ver;

	}

}