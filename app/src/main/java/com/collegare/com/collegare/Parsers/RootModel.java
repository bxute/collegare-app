import java.util.ArrayList;

class RootModel {

	public String email;
	public String privacy;
	public String end_time;
	public String logo;
	public String topic;
	public String organizer_name;
	public String state;
	public CreatorModel _creator;
	public int id;
	public String name;
	public String background_image;
	public String type;
	public String code_of_conduct;
	public VersionModel _version;
	public CopyrightModel _copyright;
	public String organizer_description;
	public String start_time;
	public String schedule_published_on;
	public String location_name;
	public ArrayList<Social_linksModel> social_links;
	public String description;
	public String timezone;
	public Call_for_papersModel _call_for_papers;

	public RootModel(String email, String privacy, String end_time, String logo, String topic, String organizer_name, String state, CreatorModel creator, int id, String name, String background_image, String type, String code_of_conduct, VersionModel version, CopyrightModel copyright, String organizer_description, String start_time, String schedule_published_on, String location_name, ArrayList<Social_linksModel> social_links, String description, String timezone, Call_for_papersModel call_for_papers) {

		this.email = email;
		this.privacy = privacy;
		this.end_time = end_time;
		this.logo = logo;
		this.topic = topic;
		this.organizer_name = organizer_name;
		this.state = state;
		this._creator = creator;
		this.id = id;
		this.name = name;
		this.background_image = background_image;
		this.type = type;
		this.code_of_conduct = code_of_conduct;
		this._version = version;
		this._copyright = copyright;
		this.organizer_description = organizer_description;
		this.start_time = start_time;
		this.schedule_published_on = schedule_published_on;
		this.location_name = location_name;
		this.social_links = social_links;
		this.description = description;
		this.timezone = timezone;
		this._call_for_papers = call_for_papers;

	}

}