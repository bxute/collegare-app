import java.util.ArrayList;

class RootModel {

	public String privacy;
	public String start_time;
	public String type;
	public String schedule_published_on;
	public String end_time;
	public String description;
	public String background_image;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_description;
	public String code_of_conduct;
	public String location_name;
	public String name;
	public Call_for_papersModel _call_for_papers;
	public VersionModel _version;
	public CopyrightModel _copyright;
	public String state;
	public String organizer_name;
	public String timezone;
	public String email;
	public CreatorModel _creator;
	public String topic;
	public String logo;
	public int id;

	public RootModel(String privacy, String start_time, String type, String schedule_published_on, String end_time, String description, String background_image, ArrayList<Social_linksModel> social_links, String organizer_description, String code_of_conduct, String location_name, String name, Call_for_papersModel call_for_papers, VersionModel version, CopyrightModel copyright, String state, String organizer_name, String timezone, String email, CreatorModel creator, String topic, String logo, int id) {

		this.privacy = privacy;
		this.start_time = start_time;
		this.type = type;
		this.schedule_published_on = schedule_published_on;
		this.end_time = end_time;
		this.description = description;
		this.background_image = background_image;
		this.social_links = social_links;
		this.organizer_description = organizer_description;
		this.code_of_conduct = code_of_conduct;
		this.location_name = location_name;
		this.name = name;
		this._call_for_papers = call_for_papers;
		this._version = version;
		this._copyright = copyright;
		this.state = state;
		this.organizer_name = organizer_name;
		this.timezone = timezone;
		this.email = email;
		this._creator = creator;
		this.topic = topic;
		this.logo = logo;
		this.id = id;

	}

}