import java.util.ArrayList;

class RootModel {

	public CopyrightModel _copyright;
	public String state;
	public CreatorModel _creator;
	public Call_for_papersModel _call_for_papers;
	public String organizer_description;
	public String schedule_published_on;
	public String description;
	public String organizer_name;
	public VersionModel _version;
	public int id;
	public String code_of_conduct;
	public String end_time;
	public String logo;
	public ArrayList<Social_linksModel> social_links;
	public String timezone;
	public String start_time;
	public String location_name;
	public String topic;
	public String background_image;
	public String email;
	public String type;
	public String privacy;
	public String name;

	public RootModel(CopyrightModel copyright, String state, CreatorModel creator, Call_for_papersModel call_for_papers, String organizer_description, String schedule_published_on, String description, String organizer_name, VersionModel version, int id, String code_of_conduct, String end_time, String logo, ArrayList<Social_linksModel> social_links, String timezone, String start_time, String location_name, String topic, String background_image, String email, String type, String privacy, String name) {

		this._copyright = copyright;
		this.state = state;
		this._creator = creator;
		this._call_for_papers = call_for_papers;
		this.organizer_description = organizer_description;
		this.schedule_published_on = schedule_published_on;
		this.description = description;
		this.organizer_name = organizer_name;
		this._version = version;
		this.id = id;
		this.code_of_conduct = code_of_conduct;
		this.end_time = end_time;
		this.logo = logo;
		this.social_links = social_links;
		this.timezone = timezone;
		this.start_time = start_time;
		this.location_name = location_name;
		this.topic = topic;
		this.background_image = background_image;
		this.email = email;
		this.type = type;
		this.privacy = privacy;
		this.name = name;

	}

}