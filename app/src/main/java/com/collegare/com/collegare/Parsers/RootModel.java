import java.util.ArrayList;

class RootModel {

	public String privacy;
	public CopyrightModel _copyright;
	public String timezone;
	public String end_time;
	public CreatorModel _creator;
	public String email;
	public String start_time;
	public ArrayList<Social_linksModel> social_links;
	public String description;
	public String topic;
	public String logo;
	public Call_for_papersModel _call_for_papers;
	public String schedule_published_on;
	public String code_of_conduct;
	public String state;
	public VersionModel _version;
	public String background_image;
	public String type;
	public int id;
	public String organizer_name;
	public String organizer_description;
	public String location_name;
	public String name;

	public RootModel(String privacy, CopyrightModel copyright, String timezone, String end_time, CreatorModel creator, String email, String start_time, ArrayList<Social_linksModel> social_links, String description, String topic, String logo, Call_for_papersModel call_for_papers, String schedule_published_on, String code_of_conduct, String state, VersionModel version, String background_image, String type, int id, String organizer_name, String organizer_description, String location_name, String name) {

		this.privacy = privacy;
		this._copyright = copyright;
		this.timezone = timezone;
		this.end_time = end_time;
		this._creator = creator;
		this.email = email;
		this.start_time = start_time;
		this.social_links = social_links;
		this.description = description;
		this.topic = topic;
		this.logo = logo;
		this._call_for_papers = call_for_papers;
		this.schedule_published_on = schedule_published_on;
		this.code_of_conduct = code_of_conduct;
		this.state = state;
		this._version = version;
		this.background_image = background_image;
		this.type = type;
		this.id = id;
		this.organizer_name = organizer_name;
		this.organizer_description = organizer_description;
		this.location_name = location_name;
		this.name = name;

	}

}