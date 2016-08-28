import java.util.ArrayList;

class RootModel {

	public String location_name;
	public String schedule_published_on;
	public String email;
	public CreatorModel _creator;
	public String end_time;
	public Call_for_papersModel _call_for_papers;
	public String name;
	public String organizer_description;
	public ArrayList<Social_linksModel> social_links;
	public String timezone;
	public String code_of_conduct;
	public String state;
	public VersionModel _version;
	public String background_image;
	public String organizer_name;
	public String logo;
	public String topic;
	public int id;
	public String start_time;
	public String type;
	public String privacy;
	public String description;
	public CopyrightModel _copyright;

	public RootModel(String location_name, String schedule_published_on, String email, CreatorModel creator, String end_time, Call_for_papersModel call_for_papers, String name, String organizer_description, ArrayList<Social_linksModel> social_links, String timezone, String code_of_conduct, String state, VersionModel version, String background_image, String organizer_name, String logo, String topic, int id, String start_time, String type, String privacy, String description, CopyrightModel copyright) {

		this.location_name = location_name;
		this.schedule_published_on = schedule_published_on;
		this.email = email;
		this._creator = creator;
		this.end_time = end_time;
		this._call_for_papers = call_for_papers;
		this.name = name;
		this.organizer_description = organizer_description;
		this.social_links = social_links;
		this.timezone = timezone;
		this.code_of_conduct = code_of_conduct;
		this.state = state;
		this._version = version;
		this.background_image = background_image;
		this.organizer_name = organizer_name;
		this.logo = logo;
		this.topic = topic;
		this.id = id;
		this.start_time = start_time;
		this.type = type;
		this.privacy = privacy;
		this.description = description;
		this._copyright = copyright;

	}

}