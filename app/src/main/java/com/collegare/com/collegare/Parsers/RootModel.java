import java.util.ArrayList;

class RootModel {

	public String type;
	public ArrayList<Social_linksModel> social_links;
	public String timezone;
	public String organizer_description;
	public String background_image;
	public String start_time;
	public String name;
	public String logo;
	public String schedule_published_on;
	public String description;
	public String email;
	public String state;
	public String topic;
	public CreatorModel _creator;
	public VersionModel _version;
	public String location_name;
	public int id;
	public String organizer_name;
	public Call_for_papersModel _call_for_papers;
	public CopyrightModel _copyright;
	public String privacy;
	public String code_of_conduct;
	public String end_time;

	public RootModel(String type, ArrayList<Social_linksModel> social_links, String timezone, String organizer_description, String background_image, String start_time, String name, String logo, String schedule_published_on, String description, String email, String state, String topic, CreatorModel creator, VersionModel version, String location_name, int id, String organizer_name, Call_for_papersModel call_for_papers, CopyrightModel copyright, String privacy, String code_of_conduct, String end_time) {

		this.type = type;
		this.social_links = social_links;
		this.timezone = timezone;
		this.organizer_description = organizer_description;
		this.background_image = background_image;
		this.start_time = start_time;
		this.name = name;
		this.logo = logo;
		this.schedule_published_on = schedule_published_on;
		this.description = description;
		this.email = email;
		this.state = state;
		this.topic = topic;
		this._creator = creator;
		this._version = version;
		this.location_name = location_name;
		this.id = id;
		this.organizer_name = organizer_name;
		this._call_for_papers = call_for_papers;
		this._copyright = copyright;
		this.privacy = privacy;
		this.code_of_conduct = code_of_conduct;
		this.end_time = end_time;

	}

}