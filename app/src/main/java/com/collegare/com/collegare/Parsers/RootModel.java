import java.util.ArrayList;

class RootModel {

	public String location_name;
	public int id;
	public ArrayList<Social_linksModel> social_links;
	public String end_time;
	public String logo;
	public String state;
	public String description;
	public Call_for_papersModel _call_for_papers;
	public String timezone;
	public String type;
	public String privacy;
	public String start_time;
	public String background_image;
	public String code_of_conduct;
	public CopyrightModel _copyright;
	public String topic;
	public String name;
	public String email;
	public String schedule_published_on;
	public CreatorModel _creator;
	public String organizer_name;
	public VersionModel _version;
	public String organizer_description;

	public RootModel(String location_name, int id, ArrayList<Social_linksModel> social_links, String end_time, String logo, String state, String description, Call_for_papersModel call_for_papers, String timezone, String type, String privacy, String start_time, String background_image, String code_of_conduct, CopyrightModel copyright, String topic, String name, String email, String schedule_published_on, CreatorModel creator, String organizer_name, VersionModel version, String organizer_description) {

		this.location_name = location_name;
		this.id = id;
		this.social_links = social_links;
		this.end_time = end_time;
		this.logo = logo;
		this.state = state;
		this.description = description;
		this._call_for_papers = call_for_papers;
		this.timezone = timezone;
		this.type = type;
		this.privacy = privacy;
		this.start_time = start_time;
		this.background_image = background_image;
		this.code_of_conduct = code_of_conduct;
		this._copyright = copyright;
		this.topic = topic;
		this.name = name;
		this.email = email;
		this.schedule_published_on = schedule_published_on;
		this._creator = creator;
		this.organizer_name = organizer_name;
		this._version = version;
		this.organizer_description = organizer_description;

	}

}