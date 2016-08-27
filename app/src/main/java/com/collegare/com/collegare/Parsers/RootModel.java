import java.util.ArrayList;

class RootModel {

	public String location_name;
	public CopyrightModel _copyright;
	public String email;
	public CreatorModel _creator;
	public String logo;
	public String end_time;
	public Call_for_papersModel _call_for_papers;
	public String background_image;
	public String name;
	public String organizer_description;
	public String code_of_conduct;
	public String state;
	public String topic;
	public String organizer_name;
	public String privacy;
	public String schedule_published_on;
	public String description;
	public ArrayList<Social_linksModel> social_links;
	public String start_time;
	public String type;
	public int id;
	public String timezone;
	public VersionModel _version;

	public RootModel(String location_name, CopyrightModel copyright, String email, CreatorModel creator, String logo, String end_time, Call_for_papersModel call_for_papers, String background_image, String name, String organizer_description, String code_of_conduct, String state, String topic, String organizer_name, String privacy, String schedule_published_on, String description, ArrayList<Social_linksModel> social_links, String start_time, String type, int id, String timezone, VersionModel version) {

		this.location_name = location_name;
		this._copyright = copyright;
		this.email = email;
		this._creator = creator;
		this.logo = logo;
		this.end_time = end_time;
		this._call_for_papers = call_for_papers;
		this.background_image = background_image;
		this.name = name;
		this.organizer_description = organizer_description;
		this.code_of_conduct = code_of_conduct;
		this.state = state;
		this.topic = topic;
		this.organizer_name = organizer_name;
		this.privacy = privacy;
		this.schedule_published_on = schedule_published_on;
		this.description = description;
		this.social_links = social_links;
		this.start_time = start_time;
		this.type = type;
		this.id = id;
		this.timezone = timezone;
		this._version = version;

	}

}