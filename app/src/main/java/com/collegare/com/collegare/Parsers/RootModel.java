import java.util.ArrayList;

class RootModel {

	public String topic;
	public String logo;
	public Call_for_papersModel _call_for_papers;
	public String privacy;
	public ArrayList<Social_linksModel> social_links;
	public String code_of_conduct;
	public String timezone;
	public String background_image;
	public String location_name;
	public CreatorModel _creator;
	public CopyrightModel _copyright;
	public String type;
	public String description;
	public String end_time;
	public VersionModel _version;
	public String state;
	public String email;
	public int id;
	public String start_time;
	public String name;
	public String organizer_name;
	public String schedule_published_on;
	public String organizer_description;

	public RootModel(String topic, String logo, Call_for_papersModel call_for_papers, String privacy, ArrayList<Social_linksModel> social_links, String code_of_conduct, String timezone, String background_image, String location_name, CreatorModel creator, CopyrightModel copyright, String type, String description, String end_time, VersionModel version, String state, String email, int id, String start_time, String name, String organizer_name, String schedule_published_on, String organizer_description) {

		this.topic = topic;
		this.logo = logo;
		this._call_for_papers = call_for_papers;
		this.privacy = privacy;
		this.social_links = social_links;
		this.code_of_conduct = code_of_conduct;
		this.timezone = timezone;
		this.background_image = background_image;
		this.location_name = location_name;
		this._creator = creator;
		this._copyright = copyright;
		this.type = type;
		this.description = description;
		this.end_time = end_time;
		this._version = version;
		this.state = state;
		this.email = email;
		this.id = id;
		this.start_time = start_time;
		this.name = name;
		this.organizer_name = organizer_name;
		this.schedule_published_on = schedule_published_on;
		this.organizer_description = organizer_description;

	}

}