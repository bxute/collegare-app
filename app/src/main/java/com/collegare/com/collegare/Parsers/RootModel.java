import java.util.ArrayList;

class RootModel {

	public String organizer_name;
	public Call_for_papersModel _call_for_papers;
	public String end_time;
	public ArrayList<Social_linksModel> social_links;
	public String location_name;
	public String schedule_published_on;
	public CreatorModel _creator;
	public String privacy;
	public VersionModel _version;
	public String email;
	public CopyrightModel _copyright;
	public String state;
	public int id;
	public String start_time;
	public String description;
	public String topic;
	public String timezone;
	public String code_of_conduct;
	public String background_image;
	public String name;
	public String logo;
	public String type;
	public String organizer_description;

	public RootModel(String organizer_name, Call_for_papersModel call_for_papers, String end_time, ArrayList<Social_linksModel> social_links, String location_name, String schedule_published_on, CreatorModel creator, String privacy, VersionModel version, String email, CopyrightModel copyright, String state, int id, String start_time, String description, String topic, String timezone, String code_of_conduct, String background_image, String name, String logo, String type, String organizer_description) {

		this.organizer_name = organizer_name;
		this._call_for_papers = call_for_papers;
		this.end_time = end_time;
		this.social_links = social_links;
		this.location_name = location_name;
		this.schedule_published_on = schedule_published_on;
		this._creator = creator;
		this.privacy = privacy;
		this._version = version;
		this.email = email;
		this._copyright = copyright;
		this.state = state;
		this.id = id;
		this.start_time = start_time;
		this.description = description;
		this.topic = topic;
		this.timezone = timezone;
		this.code_of_conduct = code_of_conduct;
		this.background_image = background_image;
		this.name = name;
		this.logo = logo;
		this.type = type;
		this.organizer_description = organizer_description;

	}

}