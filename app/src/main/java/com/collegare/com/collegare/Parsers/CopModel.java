import java.util.ArrayList;

class CopModel {

	public CreatorModel _creator;
	public int speakers_ver;
	public String end_time;
	public String topic;
	public String state;
	public String description;
	public String location_name;
	public String time_zone;
	public String start_time;
	public AdeesModel _adees;
	public String privacy;
	public String logo;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_name;
	public int sponsors_ver;
	public int id;
	public int tracks_ver;
	public VersionModel _version;
	public String organizer_description;
	public String type;
	public String name;
	public String schedule_published_on;
	public String email;

	public CopModel(CreatorModel creator, int speakers_ver, String end_time, String topic, String state, String description, String location_name, String time_zone, String start_time, AdeesModel adees, String privacy, String logo, ArrayList<Social_linksModel> social_links, String organizer_name, int sponsors_ver, int id, int tracks_ver, VersionModel version, String organizer_description, String type, String name, String schedule_published_on, String email) {

		this._creator = creator;
		this.speakers_ver = speakers_ver;
		this.end_time = end_time;
		this.topic = topic;
		this.state = state;
		this.description = description;
		this.location_name = location_name;
		this.time_zone = time_zone;
		this.start_time = start_time;
		this._adees = adees;
		this.privacy = privacy;
		this.logo = logo;
		this.social_links = social_links;
		this.organizer_name = organizer_name;
		this.sponsors_ver = sponsors_ver;
		this.id = id;
		this.tracks_ver = tracks_ver;
		this._version = version;
		this.organizer_description = organizer_description;
		this.type = type;
		this.name = name;
		this.schedule_published_on = schedule_published_on;
		this.email = email;

	}

}