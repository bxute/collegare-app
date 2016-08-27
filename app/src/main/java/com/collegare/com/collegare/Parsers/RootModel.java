import java.util.ArrayList;

class RootModel {

	public String email;
	public CopyrightModel _copyright;
	public String location_name;
	public CreatorModel _creator;
	public String name;
	public String background_image;
	public String organizer_description;
	public String timezone;
	public String state;
	public ArrayList<Social_linksModel> social_links;
	public String privacy;
	public Call_for_papersModel _call_for_papers;
	public String type;
	public String start_time;
	public String logo;
	public VersionModel _version;
	public String end_time;
	public String description;
	public String topic;
	public String organizer_name;
	public String code_of_conduct;
	public String schedule_published_on;
	public int id;

	public RootModel(String email, CopyrightModel copyright, String location_name, CreatorModel creator, String name, String background_image, String organizer_description, String timezone, String state, ArrayList<Social_linksModel> social_links, String privacy, Call_for_papersModel call_for_papers, String type, String start_time, String logo, VersionModel version, String end_time, String description, String topic, String organizer_name, String code_of_conduct, String schedule_published_on, int id) {

		this.email = email;
		this._copyright = copyright;
		this.location_name = location_name;
		this._creator = creator;
		this.name = name;
		this.background_image = background_image;
		this.organizer_description = organizer_description;
		this.timezone = timezone;
		this.state = state;
		this.social_links = social_links;
		this.privacy = privacy;
		this._call_for_papers = call_for_papers;
		this.type = type;
		this.start_time = start_time;
		this.logo = logo;
		this._version = version;
		this.end_time = end_time;
		this.description = description;
		this.topic = topic;
		this.organizer_name = organizer_name;
		this.code_of_conduct = code_of_conduct;
		this.schedule_published_on = schedule_published_on;
		this.id = id;

	}

}