import java.util.ArrayList;

class CopModel {

	public int id;
	public String end_time;
	public int speakers_ver;
	public AdeesModel _adees;
	public String type;
	public VersionModel _version;
	public String state;
	public String schedule_published_on;
	public String privacy;
	public int tracks_ver;
	public String location_name;
	public String start_time;
	public int sponsors_ver;
	public CreatorModel _creator;
	public String name;
	public String time_zone;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_description;
	public String description;
	public String organizer_name;
	public String email;
	public String logo;
	public String topic;

	public CopModel(int id, String end_time, int speakers_ver, AdeesModel adees, String type, VersionModel version, String state, String schedule_published_on, String privacy, int tracks_ver, String location_name, String start_time, int sponsors_ver, CreatorModel creator, String name, String time_zone, ArrayList<Social_linksModel> social_links, String organizer_description, String description, String organizer_name, String email, String logo, String topic) {

		this.id = id;
		this.end_time = end_time;
		this.speakers_ver = speakers_ver;
		this._adees = adees;
		this.type = type;
		this._version = version;
		this.state = state;
		this.schedule_published_on = schedule_published_on;
		this.privacy = privacy;
		this.tracks_ver = tracks_ver;
		this.location_name = location_name;
		this.start_time = start_time;
		this.sponsors_ver = sponsors_ver;
		this._creator = creator;
		this.name = name;
		this.time_zone = time_zone;
		this.social_links = social_links;
		this.organizer_description = organizer_description;
		this.description = description;
		this.organizer_name = organizer_name;
		this.email = email;
		this.logo = logo;
		this.topic = topic;

	}

}