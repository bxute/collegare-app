import java.util.ArrayList;

class CopModel {

	public int tracks_ver;
	public int speakers_ver;
	public int id;
	public String end_time;
	public String location_name;
	public String organizer_description;
	public ArrayList<Social_linksModel> social_links;
	public String time_zone;
	public String type;
	public String state;
	public int sponsors_ver;
	public String topic;
	public String organizer_name;
	public VersionModel _version;
	public CreatorModel _creator;
	public String logo;
	public String name;
	public String start_time;
	public String schedule_published_on;
	public String description;
	public String privacy;
	public String email;
	public AdeesModel _adees;

	public CopModel(int tracks_ver, int speakers_ver, int id, String end_time, String location_name, String organizer_description, ArrayList<Social_linksModel> social_links, String time_zone, String type, String state, int sponsors_ver, String topic, String organizer_name, VersionModel version, CreatorModel creator, String logo, String name, String start_time, String schedule_published_on, String description, String privacy, String email, AdeesModel adees) {

		this.tracks_ver = tracks_ver;
		this.speakers_ver = speakers_ver;
		this.id = id;
		this.end_time = end_time;
		this.location_name = location_name;
		this.organizer_description = organizer_description;
		this.social_links = social_links;
		this.time_zone = time_zone;
		this.type = type;
		this.state = state;
		this.sponsors_ver = sponsors_ver;
		this.topic = topic;
		this.organizer_name = organizer_name;
		this._version = version;
		this._creator = creator;
		this.logo = logo;
		this.name = name;
		this.start_time = start_time;
		this.schedule_published_on = schedule_published_on;
		this.description = description;
		this.privacy = privacy;
		this.email = email;
		this._adees = adees;

	}

}