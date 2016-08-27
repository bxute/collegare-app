import java.util.ArrayList;

class RootModel {

	public CopyrightModel _copyright;
	public String organizer_name;
	public String logo;
	public String email;
	public CreatorModel _creator;
	public String description;
	public String privacy;
	public VersionModel _version;
	public String timezone;
	public String organizer_description;
	public String topic;
	public String start_time;
	public int id;
	public String state;
	public String schedule_published_on;
	public String code_of_conduct;
	public String type;
	public Call_for_papersModel _call_for_papers;
	public String end_time;
	public String name;
	public String location_name;
	public ArrayList<Social_linksModel> social_links;
	public String background_image;

	public RootModel(CopyrightModel copyright, String organizer_name, String logo, String email, CreatorModel creator, String description, String privacy, VersionModel version, String timezone, String organizer_description, String topic, String start_time, int id, String state, String schedule_published_on, String code_of_conduct, String type, Call_for_papersModel call_for_papers, String end_time, String name, String location_name, ArrayList<Social_linksModel> social_links, String background_image) {

		this._copyright = copyright;
		this.organizer_name = organizer_name;
		this.logo = logo;
		this.email = email;
		this._creator = creator;
		this.description = description;
		this.privacy = privacy;
		this._version = version;
		this.timezone = timezone;
		this.organizer_description = organizer_description;
		this.topic = topic;
		this.start_time = start_time;
		this.id = id;
		this.state = state;
		this.schedule_published_on = schedule_published_on;
		this.code_of_conduct = code_of_conduct;
		this.type = type;
		this._call_for_papers = call_for_papers;
		this.end_time = end_time;
		this.name = name;
		this.location_name = location_name;
		this.social_links = social_links;
		this.background_image = background_image;

	}

}