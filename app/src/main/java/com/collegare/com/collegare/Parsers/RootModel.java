import java.util.ArrayList;

class RootModel {

	public String state;
	public VersionModel _version;
	public String code_of_conduct;
	public CreatorModel _creator;
	public String topic;
	public String privacy;
	public String description;
	public String logo;
	public String name;
	public String timezone;
	public String organizer_description;
	public String schedule_published_on;
	public String background_image;
	public String email;
	public Call_for_papersModel _call_for_papers;
	public String organizer_name;
	public int id;
	public String type;
	public CopyrightModel _copyright;
	public ArrayList<Social_linksModel> social_links;
	public String start_time;
	public String end_time;
	public String location_name;

	public RootModel(String state, VersionModel version, String code_of_conduct, CreatorModel creator, String topic, String privacy, String description, String logo, String name, String timezone, String organizer_description, String schedule_published_on, String background_image, String email, Call_for_papersModel call_for_papers, String organizer_name, int id, String type, CopyrightModel copyright, ArrayList<Social_linksModel> social_links, String start_time, String end_time, String location_name) {

		this.state = state;
		this._version = version;
		this.code_of_conduct = code_of_conduct;
		this._creator = creator;
		this.topic = topic;
		this.privacy = privacy;
		this.description = description;
		this.logo = logo;
		this.name = name;
		this.timezone = timezone;
		this.organizer_description = organizer_description;
		this.schedule_published_on = schedule_published_on;
		this.background_image = background_image;
		this.email = email;
		this._call_for_papers = call_for_papers;
		this.organizer_name = organizer_name;
		this.id = id;
		this.type = type;
		this._copyright = copyright;
		this.social_links = social_links;
		this.start_time = start_time;
		this.end_time = end_time;
		this.location_name = location_name;

	}

}