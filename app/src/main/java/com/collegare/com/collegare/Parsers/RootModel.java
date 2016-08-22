import java.util.ArrayList;

class RootModel {

	public CopyrightModel _copyright;
	public String name;
	public String type;
	public String description;
	public String logo;
	public String privacy;
	public String background_image;
	public ArrayList<Social_linksModel> social_links;
	public int id;
	public String code_of_conduct;
	public String start_time;
	public String topic;
	public String organizer_description;
	public String schedule_published_on;
	public CreatorModel _creator;
	public String timezone;
	public Call_for_papersModel _call_for_papers;
	public String email;
	public String organizer_name;
	public VersionModel _version;
	public String end_time;
	public String state;
	public String location_name;

	public RootModel(CopyrightModel copyright, String name, String type, String description, String logo, String privacy, String background_image, ArrayList<Social_linksModel> social_links, int id, String code_of_conduct, String start_time, String topic, String organizer_description, String schedule_published_on, CreatorModel creator, String timezone, Call_for_papersModel call_for_papers, String email, String organizer_name, VersionModel version, String end_time, String state, String location_name) {

		this._copyright = copyright;
		this.name = name;
		this.type = type;
		this.description = description;
		this.logo = logo;
		this.privacy = privacy;
		this.background_image = background_image;
		this.social_links = social_links;
		this.id = id;
		this.code_of_conduct = code_of_conduct;
		this.start_time = start_time;
		this.topic = topic;
		this.organizer_description = organizer_description;
		this.schedule_published_on = schedule_published_on;
		this._creator = creator;
		this.timezone = timezone;
		this._call_for_papers = call_for_papers;
		this.email = email;
		this.organizer_name = organizer_name;
		this._version = version;
		this.end_time = end_time;
		this.state = state;
		this.location_name = location_name;

	}

}