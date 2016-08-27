import java.util.ArrayList;

class RootModel {

	public String privacy;
	public String name;
	public ArrayList<Social_linksModel> social_links;
	public String description;
	public String background_image;
	public VersionModel _version;
	public String organizer_description;
	public String type;
	public String state;
	public String end_time;
	public String schedule_published_on;
	public String location_name;
	public CopyrightModel _copyright;
	public String code_of_conduct;
	public String topic;
	public CreatorModel _creator;
	public String timezone;
	public int id;
	public String email;
	public Call_for_papersModel _call_for_papers;
	public String logo;
	public String organizer_name;
	public String start_time;

	public RootModel(String privacy, String name, ArrayList<Social_linksModel> social_links, String description, String background_image, VersionModel version, String organizer_description, String type, String state, String end_time, String schedule_published_on, String location_name, CopyrightModel copyright, String code_of_conduct, String topic, CreatorModel creator, String timezone, int id, String email, Call_for_papersModel call_for_papers, String logo, String organizer_name, String start_time) {

		this.privacy = privacy;
		this.name = name;
		this.social_links = social_links;
		this.description = description;
		this.background_image = background_image;
		this._version = version;
		this.organizer_description = organizer_description;
		this.type = type;
		this.state = state;
		this.end_time = end_time;
		this.schedule_published_on = schedule_published_on;
		this.location_name = location_name;
		this._copyright = copyright;
		this.code_of_conduct = code_of_conduct;
		this.topic = topic;
		this._creator = creator;
		this.timezone = timezone;
		this.id = id;
		this.email = email;
		this._call_for_papers = call_for_papers;
		this.logo = logo;
		this.organizer_name = organizer_name;
		this.start_time = start_time;

	}

}