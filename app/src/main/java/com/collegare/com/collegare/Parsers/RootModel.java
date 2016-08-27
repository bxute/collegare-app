import java.util.ArrayList;

class RootModel {

	public String state;
	public String organizer_name;
	public CopyrightModel _copyright;
	public String background_image;
	public String organizer_description;
	public String start_time;
	public ArrayList<Social_linksModel> social_links;
	public String privacy;
	public String schedule_published_on;
	public String end_time;
	public String timezone;
	public String logo;
	public String type;
	public String email;
	public String topic;
	public String name;
	public VersionModel _version;
	public Call_for_papersModel _call_for_papers;
	public CreatorModel _creator;
	public String location_name;
	public int id;
	public String code_of_conduct;
	public String description;

	public RootModel(String state, String organizer_name, CopyrightModel copyright, String background_image, String organizer_description, String start_time, ArrayList<Social_linksModel> social_links, String privacy, String schedule_published_on, String end_time, String timezone, String logo, String type, String email, String topic, String name, VersionModel version, Call_for_papersModel call_for_papers, CreatorModel creator, String location_name, int id, String code_of_conduct, String description) {

		this.state = state;
		this.organizer_name = organizer_name;
		this._copyright = copyright;
		this.background_image = background_image;
		this.organizer_description = organizer_description;
		this.start_time = start_time;
		this.social_links = social_links;
		this.privacy = privacy;
		this.schedule_published_on = schedule_published_on;
		this.end_time = end_time;
		this.timezone = timezone;
		this.logo = logo;
		this.type = type;
		this.email = email;
		this.topic = topic;
		this.name = name;
		this._version = version;
		this._call_for_papers = call_for_papers;
		this._creator = creator;
		this.location_name = location_name;
		this.id = id;
		this.code_of_conduct = code_of_conduct;
		this.description = description;

	}

}