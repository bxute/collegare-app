import java.util.ArrayList;

class RootModel {

	public String topic;
	public String type;
	public String privacy;
	public Call_for_papersModel _call_for_papers;
	public ArrayList<Social_linksModel> social_links;
	public CopyrightModel _copyright;
	public String start_time;
	public String logo;
	public String background_image;
	public VersionModel _version;
	public String organizer_description;
	public String organizer_name;
	public String state;
	public String code_of_conduct;
	public String end_time;
	public CreatorModel _creator;
	public String description;
	public String email;
	public int id;
	public String timezone;
	public String schedule_published_on;
	public String location_name;
	public String name;

	public RootModel(String topic, String type, String privacy, Call_for_papersModel call_for_papers, ArrayList<Social_linksModel> social_links, CopyrightModel copyright, String start_time, String logo, String background_image, VersionModel version, String organizer_description, String organizer_name, String state, String code_of_conduct, String end_time, CreatorModel creator, String description, String email, int id, String timezone, String schedule_published_on, String location_name, String name) {

		this.topic = topic;
		this.type = type;
		this.privacy = privacy;
		this._call_for_papers = call_for_papers;
		this.social_links = social_links;
		this._copyright = copyright;
		this.start_time = start_time;
		this.logo = logo;
		this.background_image = background_image;
		this._version = version;
		this.organizer_description = organizer_description;
		this.organizer_name = organizer_name;
		this.state = state;
		this.code_of_conduct = code_of_conduct;
		this.end_time = end_time;
		this._creator = creator;
		this.description = description;
		this.email = email;
		this.id = id;
		this.timezone = timezone;
		this.schedule_published_on = schedule_published_on;
		this.location_name = location_name;
		this.name = name;

	}

}