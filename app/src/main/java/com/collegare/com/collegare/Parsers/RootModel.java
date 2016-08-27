import java.util.ArrayList;

class RootModel {

	public String start_time;
	public String organizer_description;
	public String background_image;
	public String email;
	public String description;
	public String schedule_published_on;
	public CreatorModel _creator;
	public int id;
	public String logo;
	public String location_name;
	public String privacy;
	public String code_of_conduct;
	public CopyrightModel _copyright;
	public String name;
	public String state;
	public VersionModel _version;
	public String organizer_name;
	public Call_for_papersModel _call_for_papers;
	public String timezone;
	public String topic;
	public ArrayList<Social_linksModel> social_links;
	public String type;
	public String end_time;

	public RootModel(String start_time, String organizer_description, String background_image, String email, String description, String schedule_published_on, CreatorModel creator, int id, String logo, String location_name, String privacy, String code_of_conduct, CopyrightModel copyright, String name, String state, VersionModel version, String organizer_name, Call_for_papersModel call_for_papers, String timezone, String topic, ArrayList<Social_linksModel> social_links, String type, String end_time) {

		this.start_time = start_time;
		this.organizer_description = organizer_description;
		this.background_image = background_image;
		this.email = email;
		this.description = description;
		this.schedule_published_on = schedule_published_on;
		this._creator = creator;
		this.id = id;
		this.logo = logo;
		this.location_name = location_name;
		this.privacy = privacy;
		this.code_of_conduct = code_of_conduct;
		this._copyright = copyright;
		this.name = name;
		this.state = state;
		this._version = version;
		this.organizer_name = organizer_name;
		this._call_for_papers = call_for_papers;
		this.timezone = timezone;
		this.topic = topic;
		this.social_links = social_links;
		this.type = type;
		this.end_time = end_time;

	}

}