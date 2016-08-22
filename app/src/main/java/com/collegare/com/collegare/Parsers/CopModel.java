import java.util.ArrayList;

class CopModel {

	public ArrayList<SociallinksModel> sociallinks;
	public String start_time;
	public VersionModel _version;
	public String time_zone;
	public int id;
	public int speakers_ver;
	public String end_time;
	public int tracks_ver;
	public String description;
	public String schedulepublished_on;
	public String location_name;
	public String email;
	public String logo;
	public String name;
	public String state;
	public CreatorModel _creator;
	public AdeesModel _adees;
	public String privacy;
	public String type;
	public String topic;
	public String organizer_name;
	public String organizer_description;
	public int sponsors_ver;

	public CopModel(ArrayList<SociallinksModel> sociallinks, String start_time, VersionModel version, String time_zone, int id, int speakers_ver, String end_time, int tracks_ver, String description, String schedulepublished_on, String location_name, String email, String logo, String name, String state, CreatorModel creator, AdeesModel adees, String privacy, String type, String topic, String organizer_name, String organizer_description, int sponsors_ver) {

		this.sociallinks = sociallinks;
		this.start_time = start_time;
		this._version = version;
		this.time_zone = time_zone;
		this.id = id;
		this.speakers_ver = speakers_ver;
		this.end_time = end_time;
		this.tracks_ver = tracks_ver;
		this.description = description;
		this.schedulepublished_on = schedulepublished_on;
		this.location_name = location_name;
		this.email = email;
		this.logo = logo;
		this.name = name;
		this.state = state;
		this._creator = creator;
		this._adees = adees;
		this.privacy = privacy;
		this.type = type;
		this.topic = topic;
		this.organizer_name = organizer_name;
		this.organizer_description = organizer_description;
		this.sponsors_ver = sponsors_ver;

	}

}