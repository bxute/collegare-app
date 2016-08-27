import java.util.ArrayList;

class RootModel {

	public String logo;
	public String privacy;
	public String email;
	public String organizer_description;
	public ArrayList<Social_linksModel> social_links;
	public CreatorModel _creator;
	public String code_of_conduct;
	public VersionModel _version;
	public String schedule_published_on;
	public String location_name;
	public String state;
	public String end_time;
	public String description;
	public int id;
	public String organizer_name;
	public String type;
	public String name;
	public String timezone;
	public Call_for_papersModel _call_for_papers;
	public CopyrightModel _copyright;
	public String topic;
	public String background_image;
	public String start_time;

	public RootModel(String logo, String privacy, String email, String organizer_description, ArrayList<Social_linksModel> social_links, CreatorModel creator, String code_of_conduct, VersionModel version, String schedule_published_on, String location_name, String state, String end_time, String description, int id, String organizer_name, String type, String name, String timezone, Call_for_papersModel call_for_papers, CopyrightModel copyright, String topic, String background_image, String start_time) {

		this.logo = logo;
		this.privacy = privacy;
		this.email = email;
		this.organizer_description = organizer_description;
		this.social_links = social_links;
		this._creator = creator;
		this.code_of_conduct = code_of_conduct;
		this._version = version;
		this.schedule_published_on = schedule_published_on;
		this.location_name = location_name;
		this.state = state;
		this.end_time = end_time;
		this.description = description;
		this.id = id;
		this.organizer_name = organizer_name;
		this.type = type;
		this.name = name;
		this.timezone = timezone;
		this._call_for_papers = call_for_papers;
		this._copyright = copyright;
		this.topic = topic;
		this.background_image = background_image;
		this.start_time = start_time;

	}

}