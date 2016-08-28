import java.util.ArrayList;

class RootModel {

	public String background_image;
	public CreatorModel _creator;
	public String type;
	public String location_name;
	public int id;
	public String logo;
	public String timezone;
	public CopyrightModel _copyright;
	public String schedule_published_on;
	public String email;
	public Call_for_papersModel _call_for_papers;
	public String organizer_description;
	public String start_time;
	public ArrayList<Social_linksModel> social_links;
	public String privacy;
	public String state;
	public String description;
	public String topic;
	public String name;
	public String end_time;
	public String code_of_conduct;
	public VersionModel _version;
	public String organizer_name;

	public RootModel(String background_image, CreatorModel creator, String type, String location_name, int id, String logo, String timezone, CopyrightModel copyright, String schedule_published_on, String email, Call_for_papersModel call_for_papers, String organizer_description, String start_time, ArrayList<Social_linksModel> social_links, String privacy, String state, String description, String topic, String name, String end_time, String code_of_conduct, VersionModel version, String organizer_name) {

		this.background_image = background_image;
		this._creator = creator;
		this.type = type;
		this.location_name = location_name;
		this.id = id;
		this.logo = logo;
		this.timezone = timezone;
		this._copyright = copyright;
		this.schedule_published_on = schedule_published_on;
		this.email = email;
		this._call_for_papers = call_for_papers;
		this.organizer_description = organizer_description;
		this.start_time = start_time;
		this.social_links = social_links;
		this.privacy = privacy;
		this.state = state;
		this.description = description;
		this.topic = topic;
		this.name = name;
		this.end_time = end_time;
		this.code_of_conduct = code_of_conduct;
		this._version = version;
		this.organizer_name = organizer_name;

	}

}