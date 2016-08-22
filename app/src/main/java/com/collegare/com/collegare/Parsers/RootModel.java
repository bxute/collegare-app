import java.util.ArrayList;

class RootModel {

	public String organizer_description;
	public String privacy;
	public String timezone;
	public String schedule_published_on;
	public VersionModel _version;
	public String organizer_name;
	public String background_image;
	public String state;
	public String type;
	public String location_name;
	public String end_time;
	public CreatorModel _creator;
	public String logo;
	public String email;
	public String start_time;
	public ArrayList<Social_linksModel> social_links;
	public CopyrightModel _copyright;
	public String description;
	public Call_for_papersModel _call_for_papers;
	public int id;
	public String topic;
	public String code_of_conduct;
	public String name;

	public RootModel(String organizer_description, String privacy, String timezone, String schedule_published_on, VersionModel version, String organizer_name, String background_image, String state, String type, String location_name, String end_time, CreatorModel creator, String logo, String email, String start_time, ArrayList<Social_linksModel> social_links, CopyrightModel copyright, String description, Call_for_papersModel call_for_papers, int id, String topic, String code_of_conduct, String name) {

		this.organizer_description = organizer_description;
		this.privacy = privacy;
		this.timezone = timezone;
		this.schedule_published_on = schedule_published_on;
		this._version = version;
		this.organizer_name = organizer_name;
		this.background_image = background_image;
		this.state = state;
		this.type = type;
		this.location_name = location_name;
		this.end_time = end_time;
		this._creator = creator;
		this.logo = logo;
		this.email = email;
		this.start_time = start_time;
		this.social_links = social_links;
		this._copyright = copyright;
		this.description = description;
		this._call_for_papers = call_for_papers;
		this.id = id;
		this.topic = topic;
		this.code_of_conduct = code_of_conduct;
		this.name = name;

	}

}