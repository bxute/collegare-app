import java.util.ArrayList;

class RootModel {

	public String location_name;
	public String logo;
	public ArrayList<Social_linksModel> social_links;
	public String code_of_conduct;
	public VersionModel _version;
	public String start_time;
	public CopyrightModel _copyright;
	public Call_for_papersModel _call_for_papers;
	public int id;
	public String email;
	public String state;
	public String topic;
	public String end_time;
	public String privacy;
	public String name;
	public String timezone;
	public String organizer_description;
	public CreatorModel _creator;
	public String description;
	public String schedule_published_on;
	public String background_image;
	public String type;
	public String organizer_name;

	public RootModel(String location_name, String logo, ArrayList<Social_linksModel> social_links, String code_of_conduct, VersionModel version, String start_time, CopyrightModel copyright, Call_for_papersModel call_for_papers, int id, String email, String state, String topic, String end_time, String privacy, String name, String timezone, String organizer_description, CreatorModel creator, String description, String schedule_published_on, String background_image, String type, String organizer_name) {

		this.location_name = location_name;
		this.logo = logo;
		this.social_links = social_links;
		this.code_of_conduct = code_of_conduct;
		this._version = version;
		this.start_time = start_time;
		this._copyright = copyright;
		this._call_for_papers = call_for_papers;
		this.id = id;
		this.email = email;
		this.state = state;
		this.topic = topic;
		this.end_time = end_time;
		this.privacy = privacy;
		this.name = name;
		this.timezone = timezone;
		this.organizer_description = organizer_description;
		this._creator = creator;
		this.description = description;
		this.schedule_published_on = schedule_published_on;
		this.background_image = background_image;
		this.type = type;
		this.organizer_name = organizer_name;

	}

}