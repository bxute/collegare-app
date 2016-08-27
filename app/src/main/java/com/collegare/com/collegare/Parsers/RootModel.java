import java.util.ArrayList;

class RootModel {

	public String organizer_name;
	public CreatorModel _creator;
	public String topic;
	public String state;
	public String code_of_conduct;
	public String background_image;
	public String privacy;
	public String name;
	public int id;
	public String logo;
	public String timezone;
	public String schedule_published_on;
	public ArrayList<Social_linksModel> social_links;
	public String start_time;
	public String organizer_description;
	public String type;
	public String end_time;
	public String location_name;
	public Call_for_papersModel _call_for_papers;
	public String email;
	public String description;
	public CopyrightModel _copyright;
	public VersionModel _version;

	public RootModel(String organizer_name, CreatorModel creator, String topic, String state, String code_of_conduct, String background_image, String privacy, String name, int id, String logo, String timezone, String schedule_published_on, ArrayList<Social_linksModel> social_links, String start_time, String organizer_description, String type, String end_time, String location_name, Call_for_papersModel call_for_papers, String email, String description, CopyrightModel copyright, VersionModel version) {

		this.organizer_name = organizer_name;
		this._creator = creator;
		this.topic = topic;
		this.state = state;
		this.code_of_conduct = code_of_conduct;
		this.background_image = background_image;
		this.privacy = privacy;
		this.name = name;
		this.id = id;
		this.logo = logo;
		this.timezone = timezone;
		this.schedule_published_on = schedule_published_on;
		this.social_links = social_links;
		this.start_time = start_time;
		this.organizer_description = organizer_description;
		this.type = type;
		this.end_time = end_time;
		this.location_name = location_name;
		this._call_for_papers = call_for_papers;
		this.email = email;
		this.description = description;
		this._copyright = copyright;
		this._version = version;

	}

}