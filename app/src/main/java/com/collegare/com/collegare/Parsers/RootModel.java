import java.util.ArrayList;

class RootModel {

	public String end_time;
	public String code_of_conduct;
	public String email;
	public CopyrightModel _copyright;
	public String logo;
	public String privacy;
	public String state;
	public ArrayList<Social_linksModel> social_links;
	public VersionModel _version;
	public String organizer_description;
	public int id;
	public String timezone;
	public String organizer_name;
	public String name;
	public CreatorModel _creator;
	public String description;
	public String type;
	public String topic;
	public String schedule_published_on;
	public String background_image;
	public String location_name;
	public String start_time;
	public Call_for_papersModel _call_for_papers;

	public RootModel(String end_time, String code_of_conduct, String email, CopyrightModel copyright, String logo, String privacy, String state, ArrayList<Social_linksModel> social_links, VersionModel version, String organizer_description, int id, String timezone, String organizer_name, String name, CreatorModel creator, String description, String type, String topic, String schedule_published_on, String background_image, String location_name, String start_time, Call_for_papersModel call_for_papers) {

		this.end_time = end_time;
		this.code_of_conduct = code_of_conduct;
		this.email = email;
		this._copyright = copyright;
		this.logo = logo;
		this.privacy = privacy;
		this.state = state;
		this.social_links = social_links;
		this._version = version;
		this.organizer_description = organizer_description;
		this.id = id;
		this.timezone = timezone;
		this.organizer_name = organizer_name;
		this.name = name;
		this._creator = creator;
		this.description = description;
		this.type = type;
		this.topic = topic;
		this.schedule_published_on = schedule_published_on;
		this.background_image = background_image;
		this.location_name = location_name;
		this.start_time = start_time;
		this._call_for_papers = call_for_papers;

	}

}