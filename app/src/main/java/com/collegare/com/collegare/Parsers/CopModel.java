import java.util.ArrayList;

class CopModel {

	public String logo;
	public String type;
	public AdeesModel _adees;
	public VersionModel _version;
	public String privacy;
	public String time_zone;
	public String organizer_description;
	public String start_time;
	public String organizer_name;
	public String email;
	public CreatorModel _creator;
	public String topic;
	public String end_time;
	public String state;
	public String description;
	public String schedulepublished_on;
	public int tracks_ver;
	public String location_name;
	public String name;
	public int id;
	public ArrayList<SociallinksModel> sociallinks;
	public int speakers_ver;
	public int sponsors_ver;

	public CopModel(String logo, String type, AdeesModel adees, VersionModel version, String privacy, String time_zone, String organizer_description, String start_time, String organizer_name, String email, CreatorModel creator, String topic, String end_time, String state, String description, String schedulepublished_on, int tracks_ver, String location_name, String name, int id, ArrayList<SociallinksModel> sociallinks, int speakers_ver, int sponsors_ver) {

		this.logo = logo;
		this.type = type;
		this._adees = adees;
		this._version = version;
		this.privacy = privacy;
		this.time_zone = time_zone;
		this.organizer_description = organizer_description;
		this.start_time = start_time;
		this.organizer_name = organizer_name;
		this.email = email;
		this._creator = creator;
		this.topic = topic;
		this.end_time = end_time;
		this.state = state;
		this.description = description;
		this.schedulepublished_on = schedulepublished_on;
		this.tracks_ver = tracks_ver;
		this.location_name = location_name;
		this.name = name;
		this.id = id;
		this.sociallinks = sociallinks;
		this.speakers_ver = speakers_ver;
		this.sponsors_ver = sponsors_ver;

	}

}