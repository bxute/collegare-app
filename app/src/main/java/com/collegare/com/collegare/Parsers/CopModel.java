import java.util.ArrayList;

class CopModel {

	public int tracks_ver;
	public String location_name;
	public String description;
	public String topic;
	public String logo;
	public String organizer_description;
	public String end_time;
	public int id;
	public ArrayList<Social_linksModel> social_links;
	public String name;
	public String time_zone;
	public String schedule_published_on;
	public String state;
	public int sponsors_ver;
	public AdeesModel _adees;
	public CreatorModel _creator;
	public int speakers_ver;
	public String email;
	public String start_time;
	public String organizer_name;
	public String type;
	public VersionModel _version;
	public String privacy;

	public CopModel(int tracks_ver, String location_name, String description, String topic, String logo, String organizer_description, String end_time, int id, ArrayList<Social_linksModel> social_links, String name, String time_zone, String schedule_published_on, String state, int sponsors_ver, AdeesModel adees, CreatorModel creator, int speakers_ver, String email, String start_time, String organizer_name, String type, VersionModel version, String privacy) {

		this.tracks_ver = tracks_ver;
		this.location_name = location_name;
		this.description = description;
		this.topic = topic;
		this.logo = logo;
		this.organizer_description = organizer_description;
		this.end_time = end_time;
		this.id = id;
		this.social_links = social_links;
		this.name = name;
		this.time_zone = time_zone;
		this.schedule_published_on = schedule_published_on;
		this.state = state;
		this.sponsors_ver = sponsors_ver;
		this._adees = adees;
		this._creator = creator;
		this.speakers_ver = speakers_ver;
		this.email = email;
		this.start_time = start_time;
		this.organizer_name = organizer_name;
		this.type = type;
		this._version = version;
		this.privacy = privacy;

	}

}