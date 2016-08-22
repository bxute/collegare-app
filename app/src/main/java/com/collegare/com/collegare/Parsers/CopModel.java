import java.util.ArrayList;

class CopModel {

	public String description;
	public int id;
	public int tracks_ver;
	public String email;
	public String name;
	public String state;
	public String schedulepublished_on;
	public VersionModel _version;
	public String location_name;
	public String type;
	public ArrayList<SociallinksModel> sociallinks;
	public String end_time;
	public String organizer_name;
	public String logo;
	public String time_zone;
	public AdeesModel _adees;
	public String start_time;
	public int sponsors_ver;
	public CreatorModel _creator;
	public String privacy;
	public String topic;
	public String organizer_description;
	public int speakers_ver;

	public CopModel(String description, int id, int tracks_ver, String email, String name, String state, String schedulepublished_on, VersionModel version, String location_name, String type, ArrayList<SociallinksModel> sociallinks, String end_time, String organizer_name, String logo, String time_zone, AdeesModel adees, String start_time, int sponsors_ver, CreatorModel creator, String privacy, String topic, String organizer_description, int speakers_ver) {

		this.description = description;
		this.id = id;
		this.tracks_ver = tracks_ver;
		this.email = email;
		this.name = name;
		this.state = state;
		this.schedulepublished_on = schedulepublished_on;
		this._version = version;
		this.location_name = location_name;
		this.type = type;
		this.sociallinks = sociallinks;
		this.end_time = end_time;
		this.organizer_name = organizer_name;
		this.logo = logo;
		this.time_zone = time_zone;
		this._adees = adees;
		this.start_time = start_time;
		this.sponsors_ver = sponsors_ver;
		this._creator = creator;
		this.privacy = privacy;
		this.topic = topic;
		this.organizer_description = organizer_description;
		this.speakers_ver = speakers_ver;

	}

}