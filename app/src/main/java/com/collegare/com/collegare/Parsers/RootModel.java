import java.util.ArrayList;

class RootModel {

	public String privacy;
	public String type;
	public Call_for_papersModel _call_for_papers;
	public String background_image;
	public String logo;
	public String topic;
	public ArrayList<Social_linksModel> social_links;
	public String end_time;
	public String start_time;
	public String location_name;
	public String description;
	public CreatorModel _creator;
	public CopyrightModel _copyright;
	public VersionModel _version;
	public String organizer_name;
	public String name;
	public String organizer_description;
	public String email;
	public String state;
	public String schedule_published_on;
	public String code_of_conduct;
	public int id;
	public String timezone;

	public RootModel(String privacy, String type, Call_for_papersModel call_for_papers, String background_image, String logo, String topic, ArrayList<Social_linksModel> social_links, String end_time, String start_time, String location_name, String description, CreatorModel creator, CopyrightModel copyright, VersionModel version, String organizer_name, String name, String organizer_description, String email, String state, String schedule_published_on, String code_of_conduct, int id, String timezone) {

		this.privacy = privacy;
		this.type = type;
		this._call_for_papers = call_for_papers;
		this.background_image = background_image;
		this.logo = logo;
		this.topic = topic;
		this.social_links = social_links;
		this.end_time = end_time;
		this.start_time = start_time;
		this.location_name = location_name;
		this.description = description;
		this._creator = creator;
		this._copyright = copyright;
		this._version = version;
		this.organizer_name = organizer_name;
		this.name = name;
		this.organizer_description = organizer_description;
		this.email = email;
		this.state = state;
		this.schedule_published_on = schedule_published_on;
		this.code_of_conduct = code_of_conduct;
		this.id = id;
		this.timezone = timezone;

	}

}