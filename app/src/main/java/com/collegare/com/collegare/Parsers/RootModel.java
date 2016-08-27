import java.util.ArrayList;

class RootModel {

	public String background_image;
	public String schedule_published_on;
	public Call_for_papersModel _call_for_papers;
	public String code_of_conduct;
	public String start_time;
	public String location_name;
	public VersionModel _version;
	public String email;
	public String name;
	public String topic;
	public CopyrightModel _copyright;
	public String privacy;
	public CreatorModel _creator;
	public String state;
	public String description;
	public int id;
	public String type;
	public String organizer_name;
	public String timezone;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_description;
	public String logo;
	public String end_time;

	public RootModel(String background_image, String schedule_published_on, Call_for_papersModel call_for_papers, String code_of_conduct, String start_time, String location_name, VersionModel version, String email, String name, String topic, CopyrightModel copyright, String privacy, CreatorModel creator, String state, String description, int id, String type, String organizer_name, String timezone, ArrayList<Social_linksModel> social_links, String organizer_description, String logo, String end_time) {

		this.background_image = background_image;
		this.schedule_published_on = schedule_published_on;
		this._call_for_papers = call_for_papers;
		this.code_of_conduct = code_of_conduct;
		this.start_time = start_time;
		this.location_name = location_name;
		this._version = version;
		this.email = email;
		this.name = name;
		this.topic = topic;
		this._copyright = copyright;
		this.privacy = privacy;
		this._creator = creator;
		this.state = state;
		this.description = description;
		this.id = id;
		this.type = type;
		this.organizer_name = organizer_name;
		this.timezone = timezone;
		this.social_links = social_links;
		this.organizer_description = organizer_description;
		this.logo = logo;
		this.end_time = end_time;

	}

}