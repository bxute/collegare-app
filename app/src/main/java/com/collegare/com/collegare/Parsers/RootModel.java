import java.util.ArrayList;

class RootModel {

	public String type;
	public String end_time;
	public String organizer_name;
	public String organizer_description;
	public String timezone;
	public String location_name;
	public String code_of_conduct;
	public String description;
	public CopyrightModel _copyright;
	public String schedule_published_on;
	public String background_image;
	public String logo;
	public String topic;
	public int id;
	public CreatorModel _creator;
	public String privacy;
	public Call_for_papersModel _call_for_papers;
	public String email;
	public ArrayList<Social_linksModel> social_links;
	public String state;
	public VersionModel _version;
	public String start_time;
	public String name;

	public RootModel(String type, String end_time, String organizer_name, String organizer_description, String timezone, String location_name, String code_of_conduct, String description, CopyrightModel copyright, String schedule_published_on, String background_image, String logo, String topic, int id, CreatorModel creator, String privacy, Call_for_papersModel call_for_papers, String email, ArrayList<Social_linksModel> social_links, String state, VersionModel version, String start_time, String name) {

		this.type = type;
		this.end_time = end_time;
		this.organizer_name = organizer_name;
		this.organizer_description = organizer_description;
		this.timezone = timezone;
		this.location_name = location_name;
		this.code_of_conduct = code_of_conduct;
		this.description = description;
		this._copyright = copyright;
		this.schedule_published_on = schedule_published_on;
		this.background_image = background_image;
		this.logo = logo;
		this.topic = topic;
		this.id = id;
		this._creator = creator;
		this.privacy = privacy;
		this._call_for_papers = call_for_papers;
		this.email = email;
		this.social_links = social_links;
		this.state = state;
		this._version = version;
		this.start_time = start_time;
		this.name = name;

	}

}