import java.util.ArrayList;

class RootModel {

	public String organizer_name;
	public ArrayList<Social_linksModel> social_links;
	public String privacy;
	public String background_image;
	public String type;
	public String timezone;
	public String start_time;
	public CreatorModel _creator;
	public String email;
	public VersionModel _version;
	public int id;
	public String schedule_published_on;
	public String logo;
	public String state;
	public Call_for_papersModel _call_for_papers;
	public String organizer_description;
	public String description;
	public String end_time;
	public String code_of_conduct;
	public String location_name;
	public String name;
	public String topic;
	public CopyrightModel _copyright;

	public RootModel(String organizer_name, ArrayList<Social_linksModel> social_links, String privacy, String background_image, String type, String timezone, String start_time, CreatorModel creator, String email, VersionModel version, int id, String schedule_published_on, String logo, String state, Call_for_papersModel call_for_papers, String organizer_description, String description, String end_time, String code_of_conduct, String location_name, String name, String topic, CopyrightModel copyright) {

		this.organizer_name = organizer_name;
		this.social_links = social_links;
		this.privacy = privacy;
		this.background_image = background_image;
		this.type = type;
		this.timezone = timezone;
		this.start_time = start_time;
		this._creator = creator;
		this.email = email;
		this._version = version;
		this.id = id;
		this.schedule_published_on = schedule_published_on;
		this.logo = logo;
		this.state = state;
		this._call_for_papers = call_for_papers;
		this.organizer_description = organizer_description;
		this.description = description;
		this.end_time = end_time;
		this.code_of_conduct = code_of_conduct;
		this.location_name = location_name;
		this.name = name;
		this.topic = topic;
		this._copyright = copyright;

	}

}