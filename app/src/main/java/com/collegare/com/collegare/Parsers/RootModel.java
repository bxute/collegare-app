import java.util.ArrayList;

class RootModel {

	public String logo;
	public String location_name;
	public Call_for_papersModel _call_for_papers;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_description;
	public String email;
	public VersionModel _version;
	public String organizer_name;
	public String code_of_conduct;
	public int id;
	public String privacy;
	public String schedule_published_on;
	public CreatorModel _creator;
	public String state;
	public String start_time;
	public String description;
	public CopyrightModel _copyright;
	public String timezone;
	public String name;
	public String end_time;
	public String background_image;
	public String type;
	public String topic;

	public RootModel(String logo, String location_name, Call_for_papersModel call_for_papers, ArrayList<Social_linksModel> social_links, String organizer_description, String email, VersionModel version, String organizer_name, String code_of_conduct, int id, String privacy, String schedule_published_on, CreatorModel creator, String state, String start_time, String description, CopyrightModel copyright, String timezone, String name, String end_time, String background_image, String type, String topic) {

		this.logo = logo;
		this.location_name = location_name;
		this._call_for_papers = call_for_papers;
		this.social_links = social_links;
		this.organizer_description = organizer_description;
		this.email = email;
		this._version = version;
		this.organizer_name = organizer_name;
		this.code_of_conduct = code_of_conduct;
		this.id = id;
		this.privacy = privacy;
		this.schedule_published_on = schedule_published_on;
		this._creator = creator;
		this.state = state;
		this.start_time = start_time;
		this.description = description;
		this._copyright = copyright;
		this.timezone = timezone;
		this.name = name;
		this.end_time = end_time;
		this.background_image = background_image;
		this.type = type;
		this.topic = topic;

	}

}