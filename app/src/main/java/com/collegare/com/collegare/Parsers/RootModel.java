import java.util.ArrayList;

class RootModel {

	public String start_time;
	public String state;
	public String name;
	public ArrayList<Social_linksModel> social_links;
	public String email;
	public String schedule_published_on;
	public String organizer_name;
	public String logo;
	public int id;
	public String topic;
	public String privacy;
	public String organizer_description;
	public String type;
	public String description;
	public VersionModel _version;
	public Call_for_papersModel _call_for_papers;
	public String code_of_conduct;
	public String timezone;
	public String background_image;
	public CopyrightModel _copyright;
	public CreatorModel _creator;
	public String end_time;
	public String location_name;

	public RootModel(String start_time, String state, String name, ArrayList<Social_linksModel> social_links, String email, String schedule_published_on, String organizer_name, String logo, int id, String topic, String privacy, String organizer_description, String type, String description, VersionModel version, Call_for_papersModel call_for_papers, String code_of_conduct, String timezone, String background_image, CopyrightModel copyright, CreatorModel creator, String end_time, String location_name) {

		this.start_time = start_time;
		this.state = state;
		this.name = name;
		this.social_links = social_links;
		this.email = email;
		this.schedule_published_on = schedule_published_on;
		this.organizer_name = organizer_name;
		this.logo = logo;
		this.id = id;
		this.topic = topic;
		this.privacy = privacy;
		this.organizer_description = organizer_description;
		this.type = type;
		this.description = description;
		this._version = version;
		this._call_for_papers = call_for_papers;
		this.code_of_conduct = code_of_conduct;
		this.timezone = timezone;
		this.background_image = background_image;
		this._copyright = copyright;
		this._creator = creator;
		this.end_time = end_time;
		this.location_name = location_name;

	}

}