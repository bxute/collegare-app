import java.util.ArrayList;

class RootModel {

	public String schedule_published_on;
	public String name;
	public String state;
	public CopyrightModel _copyright;
	public String end_time;
	public String privacy;
	public CreatorModel _creator;
	public String description;
	public VersionModel _version;
	public String topic;
	public String code_of_conduct;
	public ArrayList<Social_linksModel> social_links;
	public String logo;
	public String location_name;
	public String organizer_name;
	public String start_time;
	public String type;
	public String timezone;
	public String email;
	public String organizer_description;
	public String background_image;
	public Call_for_papersModel _call_for_papers;
	public int id;

	public RootModel(String schedule_published_on, String name, String state, CopyrightModel copyright, String end_time, String privacy, CreatorModel creator, String description, VersionModel version, String topic, String code_of_conduct, ArrayList<Social_linksModel> social_links, String logo, String location_name, String organizer_name, String start_time, String type, String timezone, String email, String organizer_description, String background_image, Call_for_papersModel call_for_papers, int id) {

		this.schedule_published_on = schedule_published_on;
		this.name = name;
		this.state = state;
		this._copyright = copyright;
		this.end_time = end_time;
		this.privacy = privacy;
		this._creator = creator;
		this.description = description;
		this._version = version;
		this.topic = topic;
		this.code_of_conduct = code_of_conduct;
		this.social_links = social_links;
		this.logo = logo;
		this.location_name = location_name;
		this.organizer_name = organizer_name;
		this.start_time = start_time;
		this.type = type;
		this.timezone = timezone;
		this.email = email;
		this.organizer_description = organizer_description;
		this.background_image = background_image;
		this._call_for_papers = call_for_papers;
		this.id = id;

	}

}