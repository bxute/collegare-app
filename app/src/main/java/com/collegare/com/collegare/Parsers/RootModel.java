import java.util.ArrayList;

class RootModel {

	public String start_time;
	public String location_name;
	public String name;
	public String topic;
	public String code_of_conduct;
	public CopyrightModel _copyright;
	public String email;
	public Call_for_papersModel _call_for_papers;
	public int id;
	public ArrayList<Social_linksModel> social_links;
	public String description;
	public String end_time;
	public String schedule_published_on;
	public String organizer_name;
	public String timezone;
	public String logo;
	public String type;
	public CreatorModel _creator;
	public String background_image;
	public String privacy;
	public String state;
	public String organizer_description;
	public VersionModel _version;

	public RootModel(String start_time, String location_name, String name, String topic, String code_of_conduct, CopyrightModel copyright, String email, Call_for_papersModel call_for_papers, int id, ArrayList<Social_linksModel> social_links, String description, String end_time, String schedule_published_on, String organizer_name, String timezone, String logo, String type, CreatorModel creator, String background_image, String privacy, String state, String organizer_description, VersionModel version) {

		this.start_time = start_time;
		this.location_name = location_name;
		this.name = name;
		this.topic = topic;
		this.code_of_conduct = code_of_conduct;
		this._copyright = copyright;
		this.email = email;
		this._call_for_papers = call_for_papers;
		this.id = id;
		this.social_links = social_links;
		this.description = description;
		this.end_time = end_time;
		this.schedule_published_on = schedule_published_on;
		this.organizer_name = organizer_name;
		this.timezone = timezone;
		this.logo = logo;
		this.type = type;
		this._creator = creator;
		this.background_image = background_image;
		this.privacy = privacy;
		this.state = state;
		this.organizer_description = organizer_description;
		this._version = version;

	}

}