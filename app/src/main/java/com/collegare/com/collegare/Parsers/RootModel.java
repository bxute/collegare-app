import java.util.ArrayList;

class RootModel {

	public String organizer_name;
	public ArrayList<Social_linksModel> social_links;
	public CreatorModel _creator;
	public String start_time;
	public String logo;
	public Call_for_papersModel _call_for_papers;
	public String timezone;
	public String background_image;
	public String email;
	public CopyrightModel _copyright;
	public String topic;
	public String location_name;
	public VersionModel _version;
	public String privacy;
	public int id;
	public String name;
	public String code_of_conduct;
	public String end_time;
	public String description;
	public String schedule_published_on;
	public String type;
	public String state;
	public String organizer_description;

	public RootModel(String organizer_name, ArrayList<Social_linksModel> social_links, CreatorModel creator, String start_time, String logo, Call_for_papersModel call_for_papers, String timezone, String background_image, String email, CopyrightModel copyright, String topic, String location_name, VersionModel version, String privacy, int id, String name, String code_of_conduct, String end_time, String description, String schedule_published_on, String type, String state, String organizer_description) {

		this.organizer_name = organizer_name;
		this.social_links = social_links;
		this._creator = creator;
		this.start_time = start_time;
		this.logo = logo;
		this._call_for_papers = call_for_papers;
		this.timezone = timezone;
		this.background_image = background_image;
		this.email = email;
		this._copyright = copyright;
		this.topic = topic;
		this.location_name = location_name;
		this._version = version;
		this.privacy = privacy;
		this.id = id;
		this.name = name;
		this.code_of_conduct = code_of_conduct;
		this.end_time = end_time;
		this.description = description;
		this.schedule_published_on = schedule_published_on;
		this.type = type;
		this.state = state;
		this.organizer_description = organizer_description;

	}

}