import java.util.ArrayList;

class RootModel {

	public String schedule_published_on;
	public int id;
	public String end_time;
	public String description;
	public String privacy;
	public ArrayList<Social_linksModel> social_links;
	public Call_for_papersModel _call_for_papers;
	public CopyrightModel _copyright;
	public String timezone;
	public String code_of_conduct;
	public String type;
	public String background_image;
	public String topic;
	public CreatorModel _creator;
	public String organizer_name;
	public String name;
	public String email;
	public String organizer_description;
	public VersionModel _version;
	public String logo;
	public String state;
	public String start_time;
	public String location_name;

	public RootModel(String schedule_published_on, int id, String end_time, String description, String privacy, ArrayList<Social_linksModel> social_links, Call_for_papersModel call_for_papers, CopyrightModel copyright, String timezone, String code_of_conduct, String type, String background_image, String topic, CreatorModel creator, String organizer_name, String name, String email, String organizer_description, VersionModel version, String logo, String state, String start_time, String location_name) {

		this.schedule_published_on = schedule_published_on;
		this.id = id;
		this.end_time = end_time;
		this.description = description;
		this.privacy = privacy;
		this.social_links = social_links;
		this._call_for_papers = call_for_papers;
		this._copyright = copyright;
		this.timezone = timezone;
		this.code_of_conduct = code_of_conduct;
		this.type = type;
		this.background_image = background_image;
		this.topic = topic;
		this._creator = creator;
		this.organizer_name = organizer_name;
		this.name = name;
		this.email = email;
		this.organizer_description = organizer_description;
		this._version = version;
		this.logo = logo;
		this.state = state;
		this.start_time = start_time;
		this.location_name = location_name;

	}

}