import java.util.ArrayList;

class CopModel {

	public AdeesModel _adees;
	public String privacy;
	public int speakers_ver;
	public String topic;
	public String type;
	public int tracks_ver;
	public String schedulepublished_on;
	public VersionModel _version;
	public String location_name;
	public String logo;
	public String description;
	public String time_zone;
	public int sponsors_ver;
	public String name;
	public ArrayList<SociallinksModel> sociallinks;
	public CreatorModel _creator;
	public String organizer_description;
	public String state;
	public String end_time;
	public String organizer_name;
	public String email;
	public int id;
	public String start_time;

	public CopModel(AdeesModel adees, String privacy, int speakers_ver, String topic, String type, int tracks_ver, String schedulepublished_on, VersionModel version, String location_name, String logo, String description, String time_zone, int sponsors_ver, String name, ArrayList<SociallinksModel> sociallinks, CreatorModel creator, String organizer_description, String state, String end_time, String organizer_name, String email, int id, String start_time) {

		this._adees = adees;
		this.privacy = privacy;
		this.speakers_ver = speakers_ver;
		this.topic = topic;
		this.type = type;
		this.tracks_ver = tracks_ver;
		this.schedulepublished_on = schedulepublished_on;
		this._version = version;
		this.location_name = location_name;
		this.logo = logo;
		this.description = description;
		this.time_zone = time_zone;
		this.sponsors_ver = sponsors_ver;
		this.name = name;
		this.sociallinks = sociallinks;
		this._creator = creator;
		this.organizer_description = organizer_description;
		this.state = state;
		this.end_time = end_time;
		this.organizer_name = organizer_name;
		this.email = email;
		this.id = id;
		this.start_time = start_time;

	}

}