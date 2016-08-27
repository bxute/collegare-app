import java.util.ArrayList;

class RootModel {

	public String email;
	public String name;
	public CreatorModel _creator;
	public String background_image;
	public String topic;
	public int id;
	public String organizer_name;
	public String timezone;
	public String end_time;
	public CopyrightModel _copyright;
	public String type;
	public Call_for_papersModel _call_for_papers;
	public String start_time;
	public String organizer_description;
	public String privacy;
	public String logo;
	public String state;
	public VersionModel _version;
	public ArrayList<Social_linksModel> social_links;
	public String schedule_published_on;
	public String location_name;
	public String code_of_conduct;
	public String description;

	public RootModel(String email, String name, CreatorModel creator, String background_image, String topic, int id, String organizer_name, String timezone, String end_time, CopyrightModel copyright, String type, Call_for_papersModel call_for_papers, String start_time, String organizer_description, String privacy, String logo, String state, VersionModel version, ArrayList<Social_linksModel> social_links, String schedule_published_on, String location_name, String code_of_conduct, String description) {

		this.email = email;
		this.name = name;
		this._creator = creator;
		this.background_image = background_image;
		this.topic = topic;
		this.id = id;
		this.organizer_name = organizer_name;
		this.timezone = timezone;
		this.end_time = end_time;
		this._copyright = copyright;
		this.type = type;
		this._call_for_papers = call_for_papers;
		this.start_time = start_time;
		this.organizer_description = organizer_description;
		this.privacy = privacy;
		this.logo = logo;
		this.state = state;
		this._version = version;
		this.social_links = social_links;
		this.schedule_published_on = schedule_published_on;
		this.location_name = location_name;
		this.code_of_conduct = code_of_conduct;
		this.description = description;

	}

}