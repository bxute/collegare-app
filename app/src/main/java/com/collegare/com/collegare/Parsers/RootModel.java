import java.util.ArrayList;

class RootModel {

	public String location_name;
	public String topic;
	public String description;
	public String start_time;
	public String organizer_name;
	public CreatorModel _creator;
	public CopyrightModel _copyright;
	public String end_time;
	public VersionModel _version;
	public String privacy;
	public String logo;
	public Call_for_papersModel _call_for_papers;
	public String type;
	public ArrayList<Social_linksModel> social_links;
	public int id;
	public String organizer_description;
	public String state;
	public String background_image;
	public String code_of_conduct;
	public String schedule_published_on;
	public String name;
	public String email;
	public String timezone;

	public RootModel(String location_name, String topic, String description, String start_time, String organizer_name, CreatorModel creator, CopyrightModel copyright, String end_time, VersionModel version, String privacy, String logo, Call_for_papersModel call_for_papers, String type, ArrayList<Social_linksModel> social_links, int id, String organizer_description, String state, String background_image, String code_of_conduct, String schedule_published_on, String name, String email, String timezone) {

		this.location_name = location_name;
		this.topic = topic;
		this.description = description;
		this.start_time = start_time;
		this.organizer_name = organizer_name;
		this._creator = creator;
		this._copyright = copyright;
		this.end_time = end_time;
		this._version = version;
		this.privacy = privacy;
		this.logo = logo;
		this._call_for_papers = call_for_papers;
		this.type = type;
		this.social_links = social_links;
		this.id = id;
		this.organizer_description = organizer_description;
		this.state = state;
		this.background_image = background_image;
		this.code_of_conduct = code_of_conduct;
		this.schedule_published_on = schedule_published_on;
		this.name = name;
		this.email = email;
		this.timezone = timezone;

	}

}