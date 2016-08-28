import java.util.ArrayList;

class RootModel {

	public String start_time;
	public Call_for_papersModel _call_for_papers;
	public String description;
	public String timezone;
	public String organizer_name;
	public String type;
	public String email;
	public String logo;
	public String code_of_conduct;
	public VersionModel _version;
	public ArrayList<Social_linksModel> social_links;
	public String location_name;
	public String privacy;
	public String state;
	public int id;
	public String end_time;
	public CopyrightModel _copyright;
	public CreatorModel _creator;
	public String organizer_description;
	public String background_image;
	public String schedule_published_on;
	public String name;
	public String topic;

	public RootModel(String start_time, Call_for_papersModel call_for_papers, String description, String timezone, String organizer_name, String type, String email, String logo, String code_of_conduct, VersionModel version, ArrayList<Social_linksModel> social_links, String location_name, String privacy, String state, int id, String end_time, CopyrightModel copyright, CreatorModel creator, String organizer_description, String background_image, String schedule_published_on, String name, String topic) {

		this.start_time = start_time;
		this._call_for_papers = call_for_papers;
		this.description = description;
		this.timezone = timezone;
		this.organizer_name = organizer_name;
		this.type = type;
		this.email = email;
		this.logo = logo;
		this.code_of_conduct = code_of_conduct;
		this._version = version;
		this.social_links = social_links;
		this.location_name = location_name;
		this.privacy = privacy;
		this.state = state;
		this.id = id;
		this.end_time = end_time;
		this._copyright = copyright;
		this._creator = creator;
		this.organizer_description = organizer_description;
		this.background_image = background_image;
		this.schedule_published_on = schedule_published_on;
		this.name = name;
		this.topic = topic;

	}

}