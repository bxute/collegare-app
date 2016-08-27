import java.util.ArrayList;

class RootModel {

	public String timezone;
	public String topic;
	public String state;
	public String organizer_name;
	public String type;
	public String background_image;
	public String schedule_published_on;
	public Call_for_papersModel _call_for_papers;
	public String description;
	public String end_time;
	public String logo;
	public String location_name;
	public CreatorModel _creator;
	public CopyrightModel _copyright;
	public String organizer_description;
	public String privacy;
	public String start_time;
	public String email;
	public ArrayList<Social_linksModel> social_links;
	public VersionModel _version;
	public String code_of_conduct;
	public String name;
	public int id;

	public RootModel(String timezone, String topic, String state, String organizer_name, String type, String background_image, String schedule_published_on, Call_for_papersModel call_for_papers, String description, String end_time, String logo, String location_name, CreatorModel creator, CopyrightModel copyright, String organizer_description, String privacy, String start_time, String email, ArrayList<Social_linksModel> social_links, VersionModel version, String code_of_conduct, String name, int id) {

		this.timezone = timezone;
		this.topic = topic;
		this.state = state;
		this.organizer_name = organizer_name;
		this.type = type;
		this.background_image = background_image;
		this.schedule_published_on = schedule_published_on;
		this._call_for_papers = call_for_papers;
		this.description = description;
		this.end_time = end_time;
		this.logo = logo;
		this.location_name = location_name;
		this._creator = creator;
		this._copyright = copyright;
		this.organizer_description = organizer_description;
		this.privacy = privacy;
		this.start_time = start_time;
		this.email = email;
		this.social_links = social_links;
		this._version = version;
		this.code_of_conduct = code_of_conduct;
		this.name = name;
		this.id = id;

	}

}