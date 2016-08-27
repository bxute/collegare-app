import java.util.ArrayList;

class RootModel {

	public String type;
	public String background_image;
	public CreatorModel _creator;
	public ArrayList<Social_linksModel> social_links;
	public String location_name;
	public String logo;
	public String end_time;
	public String timezone;
	public int id;
	public String name;
	public String topic;
	public String organizer_description;
	public String code_of_conduct;
	public String organizer_name;
	public String privacy;
	public VersionModel _version;
	public String description;
	public String state;
	public String email;
	public String schedule_published_on;
	public Call_for_papersModel _call_for_papers;
	public CopyrightModel _copyright;
	public String start_time;

	public RootModel(String type, String background_image, CreatorModel creator, ArrayList<Social_linksModel> social_links, String location_name, String logo, String end_time, String timezone, int id, String name, String topic, String organizer_description, String code_of_conduct, String organizer_name, String privacy, VersionModel version, String description, String state, String email, String schedule_published_on, Call_for_papersModel call_for_papers, CopyrightModel copyright, String start_time) {

		this.type = type;
		this.background_image = background_image;
		this._creator = creator;
		this.social_links = social_links;
		this.location_name = location_name;
		this.logo = logo;
		this.end_time = end_time;
		this.timezone = timezone;
		this.id = id;
		this.name = name;
		this.topic = topic;
		this.organizer_description = organizer_description;
		this.code_of_conduct = code_of_conduct;
		this.organizer_name = organizer_name;
		this.privacy = privacy;
		this._version = version;
		this.description = description;
		this.state = state;
		this.email = email;
		this.schedule_published_on = schedule_published_on;
		this._call_for_papers = call_for_papers;
		this._copyright = copyright;
		this.start_time = start_time;

	}

}