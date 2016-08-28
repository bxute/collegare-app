import java.util.ArrayList;

class RootModel {

	public String end_time;
	public Call_for_papersModel _call_for_papers;
	public ArrayList<Social_linksModel> social_links;
	public String name;
	public String description;
	public String schedule_published_on;
	public String email;
	public String type;
	public String state;
	public String organizer_name;
	public VersionModel _version;
	public String privacy;
	public String location_name;
	public String topic;
	public CopyrightModel _copyright;
	public String logo;
	public String start_time;
	public String timezone;
	public CreatorModel _creator;
	public int id;
	public String code_of_conduct;
	public String organizer_description;
	public String background_image;

	public RootModel(String end_time, Call_for_papersModel call_for_papers, ArrayList<Social_linksModel> social_links, String name, String description, String schedule_published_on, String email, String type, String state, String organizer_name, VersionModel version, String privacy, String location_name, String topic, CopyrightModel copyright, String logo, String start_time, String timezone, CreatorModel creator, int id, String code_of_conduct, String organizer_description, String background_image) {

		this.end_time = end_time;
		this._call_for_papers = call_for_papers;
		this.social_links = social_links;
		this.name = name;
		this.description = description;
		this.schedule_published_on = schedule_published_on;
		this.email = email;
		this.type = type;
		this.state = state;
		this.organizer_name = organizer_name;
		this._version = version;
		this.privacy = privacy;
		this.location_name = location_name;
		this.topic = topic;
		this._copyright = copyright;
		this.logo = logo;
		this.start_time = start_time;
		this.timezone = timezone;
		this._creator = creator;
		this.id = id;
		this.code_of_conduct = code_of_conduct;
		this.organizer_description = organizer_description;
		this.background_image = background_image;

	}

}