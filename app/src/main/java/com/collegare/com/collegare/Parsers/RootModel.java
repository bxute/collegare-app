import java.util.ArrayList;

class RootModel {

	public String timezone;
	public Call_for_papersModel _call_for_papers;
	public String end_time;
	public ArrayList<Social_linksModel> social_links;
	public String start_time;
	public VersionModel _version;
	public String code_of_conduct;
	public String schedule_published_on;
	public String organizer_description;
	public String organizer_name;
	public String type;
	public String privacy;
	public String email;
	public CopyrightModel _copyright;
	public String location_name;
	public String name;
	public int id;
	public CreatorModel _creator;
	public String topic;
	public String state;
	public String logo;
	public String description;
	public String background_image;

	public RootModel(String timezone, Call_for_papersModel call_for_papers, String end_time, ArrayList<Social_linksModel> social_links, String start_time, VersionModel version, String code_of_conduct, String schedule_published_on, String organizer_description, String organizer_name, String type, String privacy, String email, CopyrightModel copyright, String location_name, String name, int id, CreatorModel creator, String topic, String state, String logo, String description, String background_image) {

		this.timezone = timezone;
		this._call_for_papers = call_for_papers;
		this.end_time = end_time;
		this.social_links = social_links;
		this.start_time = start_time;
		this._version = version;
		this.code_of_conduct = code_of_conduct;
		this.schedule_published_on = schedule_published_on;
		this.organizer_description = organizer_description;
		this.organizer_name = organizer_name;
		this.type = type;
		this.privacy = privacy;
		this.email = email;
		this._copyright = copyright;
		this.location_name = location_name;
		this.name = name;
		this.id = id;
		this._creator = creator;
		this.topic = topic;
		this.state = state;
		this.logo = logo;
		this.description = description;
		this.background_image = background_image;

	}

}