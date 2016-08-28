import java.util.ArrayList;

class RootModel {

	public String background_image;
	public String type;
	public Call_for_papersModel _call_for_papers;
	public String schedule_published_on;
	public ArrayList<Social_linksModel> social_links;
	public String location_name;
	public int id;
	public CopyrightModel _copyright;
	public String code_of_conduct;
	public String email;
	public CreatorModel _creator;
	public String name;
	public String timezone;
	public String topic;
	public String state;
	public String description;
	public String start_time;
	public String end_time;
	public String organizer_name;
	public VersionModel _version;
	public String privacy;
	public String logo;
	public String organizer_description;

	public RootModel(String background_image, String type, Call_for_papersModel call_for_papers, String schedule_published_on, ArrayList<Social_linksModel> social_links, String location_name, int id, CopyrightModel copyright, String code_of_conduct, String email, CreatorModel creator, String name, String timezone, String topic, String state, String description, String start_time, String end_time, String organizer_name, VersionModel version, String privacy, String logo, String organizer_description) {

		this.background_image = background_image;
		this.type = type;
		this._call_for_papers = call_for_papers;
		this.schedule_published_on = schedule_published_on;
		this.social_links = social_links;
		this.location_name = location_name;
		this.id = id;
		this._copyright = copyright;
		this.code_of_conduct = code_of_conduct;
		this.email = email;
		this._creator = creator;
		this.name = name;
		this.timezone = timezone;
		this.topic = topic;
		this.state = state;
		this.description = description;
		this.start_time = start_time;
		this.end_time = end_time;
		this.organizer_name = organizer_name;
		this._version = version;
		this.privacy = privacy;
		this.logo = logo;
		this.organizer_description = organizer_description;

	}

}