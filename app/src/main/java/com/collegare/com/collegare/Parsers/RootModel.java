import java.util.ArrayList;

class RootModel {

	public String end_time;
	public String name;
	public Call_for_papersModel _call_for_papers;
	public String logo;
	public int id;
	public CopyrightModel _copyright;
	public String topic;
	public String start_time;
	public String organizer_name;
	public CreatorModel _creator;
	public String state;
	public String email;
	public String description;
	public String code_of_conduct;
	public VersionModel _version;
	public String type;
	public String location_name;
	public String schedule_published_on;
	public String privacy;
	public String organizer_description;
	public ArrayList<Social_linksModel> social_links;
	public String background_image;
	public String timezone;

	public RootModel(String end_time, String name, Call_for_papersModel call_for_papers, String logo, int id, CopyrightModel copyright, String topic, String start_time, String organizer_name, CreatorModel creator, String state, String email, String description, String code_of_conduct, VersionModel version, String type, String location_name, String schedule_published_on, String privacy, String organizer_description, ArrayList<Social_linksModel> social_links, String background_image, String timezone) {

		this.end_time = end_time;
		this.name = name;
		this._call_for_papers = call_for_papers;
		this.logo = logo;
		this.id = id;
		this._copyright = copyright;
		this.topic = topic;
		this.start_time = start_time;
		this.organizer_name = organizer_name;
		this._creator = creator;
		this.state = state;
		this.email = email;
		this.description = description;
		this.code_of_conduct = code_of_conduct;
		this._version = version;
		this.type = type;
		this.location_name = location_name;
		this.schedule_published_on = schedule_published_on;
		this.privacy = privacy;
		this.organizer_description = organizer_description;
		this.social_links = social_links;
		this.background_image = background_image;
		this.timezone = timezone;

	}

}