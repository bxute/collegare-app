import java.util.ArrayList;

class RootModel {

	public String organizer_description;
	public String state;
	public CopyrightModel _copyright;
	public String description;
	public Call_for_papersModel _call_for_papers;
	public VersionModel _version;
	public String topic;
	public String schedule_published_on;
	public String logo;
	public String end_time;
	public String organizer_name;
	public CreatorModel _creator;
	public String background_image;
	public String code_of_conduct;
	public String privacy;
	public ArrayList<Social_linksModel> social_links;
	public String type;
	public String location_name;
	public int id;
	public String timezone;
	public String name;
	public String email;
	public String start_time;

	public RootModel(String organizer_description, String state, CopyrightModel copyright, String description, Call_for_papersModel call_for_papers, VersionModel version, String topic, String schedule_published_on, String logo, String end_time, String organizer_name, CreatorModel creator, String background_image, String code_of_conduct, String privacy, ArrayList<Social_linksModel> social_links, String type, String location_name, int id, String timezone, String name, String email, String start_time) {

		this.organizer_description = organizer_description;
		this.state = state;
		this._copyright = copyright;
		this.description = description;
		this._call_for_papers = call_for_papers;
		this._version = version;
		this.topic = topic;
		this.schedule_published_on = schedule_published_on;
		this.logo = logo;
		this.end_time = end_time;
		this.organizer_name = organizer_name;
		this._creator = creator;
		this.background_image = background_image;
		this.code_of_conduct = code_of_conduct;
		this.privacy = privacy;
		this.social_links = social_links;
		this.type = type;
		this.location_name = location_name;
		this.id = id;
		this.timezone = timezone;
		this.name = name;
		this.email = email;
		this.start_time = start_time;

	}

}