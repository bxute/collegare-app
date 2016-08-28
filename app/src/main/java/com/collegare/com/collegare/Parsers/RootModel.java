import java.util.ArrayList;

class RootModel {

	public String code_of_conduct;
	public String name;
	public String timezone;
	public Call_for_papersModel _call_for_papers;
	public String state;
	public VersionModel _version;
	public String location_name;
	public String end_time;
	public CopyrightModel _copyright;
	public String background_image;
	public String start_time;
	public String logo;
	public String organizer_description;
	public CreatorModel _creator;
	public String email;
	public String type;
	public String privacy;
	public String topic;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_name;
	public String schedule_published_on;
	public int id;
	public String description;

	public RootModel(String code_of_conduct, String name, String timezone, Call_for_papersModel call_for_papers, String state, VersionModel version, String location_name, String end_time, CopyrightModel copyright, String background_image, String start_time, String logo, String organizer_description, CreatorModel creator, String email, String type, String privacy, String topic, ArrayList<Social_linksModel> social_links, String organizer_name, String schedule_published_on, int id, String description) {

		this.code_of_conduct = code_of_conduct;
		this.name = name;
		this.timezone = timezone;
		this._call_for_papers = call_for_papers;
		this.state = state;
		this._version = version;
		this.location_name = location_name;
		this.end_time = end_time;
		this._copyright = copyright;
		this.background_image = background_image;
		this.start_time = start_time;
		this.logo = logo;
		this.organizer_description = organizer_description;
		this._creator = creator;
		this.email = email;
		this.type = type;
		this.privacy = privacy;
		this.topic = topic;
		this.social_links = social_links;
		this.organizer_name = organizer_name;
		this.schedule_published_on = schedule_published_on;
		this.id = id;
		this.description = description;

	}

}