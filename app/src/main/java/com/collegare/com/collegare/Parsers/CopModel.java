import java.util.ArrayList;

class CopModel {

	public ArrayList<SociallinksModel> sociallinks;
	public String time_zone;
	public String privacy;
	public int id;
	public String description;
	public int tracks_ver;
	public String logo;
	public String schedulepublished_on;
	public String name;
	public CreatorModel _creator;
	public String location_name;
	public AdeesModel _adees;
	public int speakers_ver;
	public String start_time;
	public VersionModel _version;
	public int sponsors_ver;
	public String end_time;
	public String organizer_name;
	public String topic;
	public String state;
	public String type;
	public String email;
	public String organizer_description;

	public CopModel(ArrayList<SociallinksModel> sociallinks, String time_zone, String privacy, int id, String description, int tracks_ver, String logo, String schedulepublished_on, String name, CreatorModel creator, String location_name, AdeesModel adees, int speakers_ver, String start_time, VersionModel version, int sponsors_ver, String end_time, String organizer_name, String topic, String state, String type, String email, String organizer_description) {

		this.sociallinks = sociallinks;
		this.time_zone = time_zone;
		this.privacy = privacy;
		this.id = id;
		this.description = description;
		this.tracks_ver = tracks_ver;
		this.logo = logo;
		this.schedulepublished_on = schedulepublished_on;
		this.name = name;
		this._creator = creator;
		this.location_name = location_name;
		this._adees = adees;
		this.speakers_ver = speakers_ver;
		this.start_time = start_time;
		this._version = version;
		this.sponsors_ver = sponsors_ver;
		this.end_time = end_time;
		this.organizer_name = organizer_name;
		this.topic = topic;
		this.state = state;
		this.type = type;
		this.email = email;
		this.organizer_description = organizer_description;

	}

}