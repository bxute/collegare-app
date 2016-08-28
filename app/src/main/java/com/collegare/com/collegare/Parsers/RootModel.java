import java.util.ArrayList;

class RootModel {

	public String logo;
	public String start_time;
	public String end_time;
	public String code_of_conduct;
	public String topic;
	public String privacy;
	public String organizer_name;
	public String background_image;
	public Call_for_papersModel _call_for_papers;
	public CreatorModel _creator;
	public ArrayList<Social_linksModel> social_links;
	public String name;
	public CopyrightModel _copyright;
	public String location_name;
	public String email;
	public String organizer_description;
	public String state;
	public String type;
	public String timezone;
	public int id;
	public String schedule_published_on;
	public VersionModel _version;
	public String description;

	public RootModel(String logo, String start_time, String end_time, String code_of_conduct, String topic, String privacy, String organizer_name, String background_image, Call_for_papersModel call_for_papers, CreatorModel creator, ArrayList<Social_linksModel> social_links, String name, CopyrightModel copyright, String location_name, String email, String organizer_description, String state, String type, String timezone, int id, String schedule_published_on, VersionModel version, String description) {

		this.logo = logo;
		this.start_time = start_time;
		this.end_time = end_time;
		this.code_of_conduct = code_of_conduct;
		this.topic = topic;
		this.privacy = privacy;
		this.organizer_name = organizer_name;
		this.background_image = background_image;
		this._call_for_papers = call_for_papers;
		this._creator = creator;
		this.social_links = social_links;
		this.name = name;
		this._copyright = copyright;
		this.location_name = location_name;
		this.email = email;
		this.organizer_description = organizer_description;
		this.state = state;
		this.type = type;
		this.timezone = timezone;
		this.id = id;
		this.schedule_published_on = schedule_published_on;
		this._version = version;
		this.description = description;

	}

}