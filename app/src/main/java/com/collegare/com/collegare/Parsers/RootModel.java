import java.util.ArrayList;

class RootModel {

	public String privacy;
	public String logo;
	public String code_of_conduct;
	public String organizer_description;
	public ArrayList<Social_linksModel> social_links;
	public CopyrightModel _copyright;
	public CreatorModel _creator;
	public int id;
	public String timezone;
	public String type;
	public String location_name;
	public String state;
	public String email;
	public String name;
	public VersionModel _version;
	public String start_time;
	public String schedule_published_on;
	public String description;
	public String organizer_name;
	public String topic;
	public Call_for_papersModel _call_for_papers;
	public String end_time;
	public String background_image;

	public RootModel(String privacy, String logo, String code_of_conduct, String organizer_description, ArrayList<Social_linksModel> social_links, CopyrightModel copyright, CreatorModel creator, int id, String timezone, String type, String location_name, String state, String email, String name, VersionModel version, String start_time, String schedule_published_on, String description, String organizer_name, String topic, Call_for_papersModel call_for_papers, String end_time, String background_image) {

		this.privacy = privacy;
		this.logo = logo;
		this.code_of_conduct = code_of_conduct;
		this.organizer_description = organizer_description;
		this.social_links = social_links;
		this._copyright = copyright;
		this._creator = creator;
		this.id = id;
		this.timezone = timezone;
		this.type = type;
		this.location_name = location_name;
		this.state = state;
		this.email = email;
		this.name = name;
		this._version = version;
		this.start_time = start_time;
		this.schedule_published_on = schedule_published_on;
		this.description = description;
		this.organizer_name = organizer_name;
		this.topic = topic;
		this._call_for_papers = call_for_papers;
		this.end_time = end_time;
		this.background_image = background_image;

	}

}