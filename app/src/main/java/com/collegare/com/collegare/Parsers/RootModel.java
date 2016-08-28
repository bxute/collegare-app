import java.util.ArrayList;

class RootModel {

	public String organizer_description;
	public String logo;
	public String schedule_published_on;
	public Call_for_papersModel _call_for_papers;
	public String timezone;
	public String email;
	public String state;
	public String organizer_name;
	public CopyrightModel _copyright;
	public String name;
	public String start_time;
	public CreatorModel _creator;
	public String type;
	public String code_of_conduct;
	public String privacy;
	public String background_image;
	public String topic;
	public String end_time;
	public String location_name;
	public ArrayList<Social_linksModel> social_links;
	public int id;
	public VersionModel _version;
	public String description;

	public RootModel(String organizer_description, String logo, String schedule_published_on, Call_for_papersModel call_for_papers, String timezone, String email, String state, String organizer_name, CopyrightModel copyright, String name, String start_time, CreatorModel creator, String type, String code_of_conduct, String privacy, String background_image, String topic, String end_time, String location_name, ArrayList<Social_linksModel> social_links, int id, VersionModel version, String description) {

		this.organizer_description = organizer_description;
		this.logo = logo;
		this.schedule_published_on = schedule_published_on;
		this._call_for_papers = call_for_papers;
		this.timezone = timezone;
		this.email = email;
		this.state = state;
		this.organizer_name = organizer_name;
		this._copyright = copyright;
		this.name = name;
		this.start_time = start_time;
		this._creator = creator;
		this.type = type;
		this.code_of_conduct = code_of_conduct;
		this.privacy = privacy;
		this.background_image = background_image;
		this.topic = topic;
		this.end_time = end_time;
		this.location_name = location_name;
		this.social_links = social_links;
		this.id = id;
		this._version = version;
		this.description = description;

	}

}