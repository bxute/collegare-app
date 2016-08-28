import java.util.ArrayList;

class RootModel {

	public String background_image;
	public String type;
	public String organizer_name;
	public CreatorModel _creator;
	public String state;
	public String end_time;
	public String privacy;
	public String code_of_conduct;
	public String organizer_description;
	public String email;
	public String start_time;
	public int id;
	public String logo;
	public String topic;
	public Call_for_papersModel _call_for_papers;
	public String location_name;
	public String name;
	public String schedule_published_on;
	public ArrayList<Social_linksModel> social_links;
	public String timezone;
	public CopyrightModel _copyright;
	public VersionModel _version;
	public String description;

	public RootModel(String background_image, String type, String organizer_name, CreatorModel creator, String state, String end_time, String privacy, String code_of_conduct, String organizer_description, String email, String start_time, int id, String logo, String topic, Call_for_papersModel call_for_papers, String location_name, String name, String schedule_published_on, ArrayList<Social_linksModel> social_links, String timezone, CopyrightModel copyright, VersionModel version, String description) {

		this.background_image = background_image;
		this.type = type;
		this.organizer_name = organizer_name;
		this._creator = creator;
		this.state = state;
		this.end_time = end_time;
		this.privacy = privacy;
		this.code_of_conduct = code_of_conduct;
		this.organizer_description = organizer_description;
		this.email = email;
		this.start_time = start_time;
		this.id = id;
		this.logo = logo;
		this.topic = topic;
		this._call_for_papers = call_for_papers;
		this.location_name = location_name;
		this.name = name;
		this.schedule_published_on = schedule_published_on;
		this.social_links = social_links;
		this.timezone = timezone;
		this._copyright = copyright;
		this._version = version;
		this.description = description;

	}

}