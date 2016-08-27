import java.util.ArrayList;

class RootModel {

	public String location_name;
	public String description;
	public String code_of_conduct;
	public CopyrightModel _copyright;
	public Call_for_papersModel _call_for_papers;
	public int id;
	public ArrayList<Social_linksModel> social_links;
	public String schedule_published_on;
	public String logo;
	public String timezone;
	public String end_time;
	public String start_time;
	public String type;
	public String organizer_description;
	public String email;
	public String organizer_name;
	public String privacy;
	public String topic;
	public String state;
	public CreatorModel _creator;
	public String background_image;
	public String name;
	public VersionModel _version;

	public RootModel(String location_name, String description, String code_of_conduct, CopyrightModel copyright, Call_for_papersModel call_for_papers, int id, ArrayList<Social_linksModel> social_links, String schedule_published_on, String logo, String timezone, String end_time, String start_time, String type, String organizer_description, String email, String organizer_name, String privacy, String topic, String state, CreatorModel creator, String background_image, String name, VersionModel version) {

		this.location_name = location_name;
		this.description = description;
		this.code_of_conduct = code_of_conduct;
		this._copyright = copyright;
		this._call_for_papers = call_for_papers;
		this.id = id;
		this.social_links = social_links;
		this.schedule_published_on = schedule_published_on;
		this.logo = logo;
		this.timezone = timezone;
		this.end_time = end_time;
		this.start_time = start_time;
		this.type = type;
		this.organizer_description = organizer_description;
		this.email = email;
		this.organizer_name = organizer_name;
		this.privacy = privacy;
		this.topic = topic;
		this.state = state;
		this._creator = creator;
		this.background_image = background_image;
		this.name = name;
		this._version = version;

	}

}