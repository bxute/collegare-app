import java.util.ArrayList;

class RootModel {

	public String start_time;
	public String location_name;
	public String email;
	public CopyrightModel _copyright;
	public String organizer_description;
	public int id;
	public String logo;
	public String state;
	public Call_for_papersModel _call_for_papers;
	public String end_time;
	public ArrayList<Social_linksModel> social_links;
	public String background_image;
	public String schedule_published_on;
	public String organizer_name;
	public String timezone;
	public String topic;
	public String code_of_conduct;
	public VersionModel _version;
	public String name;
	public String type;
	public String privacy;
	public CreatorModel _creator;
	public String description;

	public RootModel(String start_time, String location_name, String email, CopyrightModel copyright, String organizer_description, int id, String logo, String state, Call_for_papersModel call_for_papers, String end_time, ArrayList<Social_linksModel> social_links, String background_image, String schedule_published_on, String organizer_name, String timezone, String topic, String code_of_conduct, VersionModel version, String name, String type, String privacy, CreatorModel creator, String description) {

		this.start_time = start_time;
		this.location_name = location_name;
		this.email = email;
		this._copyright = copyright;
		this.organizer_description = organizer_description;
		this.id = id;
		this.logo = logo;
		this.state = state;
		this._call_for_papers = call_for_papers;
		this.end_time = end_time;
		this.social_links = social_links;
		this.background_image = background_image;
		this.schedule_published_on = schedule_published_on;
		this.organizer_name = organizer_name;
		this.timezone = timezone;
		this.topic = topic;
		this.code_of_conduct = code_of_conduct;
		this._version = version;
		this.name = name;
		this.type = type;
		this.privacy = privacy;
		this._creator = creator;
		this.description = description;

	}

}