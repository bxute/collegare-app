import java.util.ArrayList;

class RootModel {

	public String type;
	public String timezone;
	public Call_for_papersModel _call_for_papers;
	public String location_name;
	public String name;
	public String topic;
	public CreatorModel _creator;
	public String organizer_description;
	public String state;
	public ArrayList<Social_linksModel> social_links;
	public String background_image;
	public String organizer_name;
	public String email;
	public String code_of_conduct;
	public int id;
	public String schedule_published_on;
	public String end_time;
	public String privacy;
	public VersionModel _version;
	public String logo;
	public String description;
	public String start_time;
	public CopyrightModel _copyright;

	public RootModel(String type, String timezone, Call_for_papersModel call_for_papers, String location_name, String name, String topic, CreatorModel creator, String organizer_description, String state, ArrayList<Social_linksModel> social_links, String background_image, String organizer_name, String email, String code_of_conduct, int id, String schedule_published_on, String end_time, String privacy, VersionModel version, String logo, String description, String start_time, CopyrightModel copyright) {

		this.type = type;
		this.timezone = timezone;
		this._call_for_papers = call_for_papers;
		this.location_name = location_name;
		this.name = name;
		this.topic = topic;
		this._creator = creator;
		this.organizer_description = organizer_description;
		this.state = state;
		this.social_links = social_links;
		this.background_image = background_image;
		this.organizer_name = organizer_name;
		this.email = email;
		this.code_of_conduct = code_of_conduct;
		this.id = id;
		this.schedule_published_on = schedule_published_on;
		this.end_time = end_time;
		this.privacy = privacy;
		this._version = version;
		this.logo = logo;
		this.description = description;
		this.start_time = start_time;
		this._copyright = copyright;

	}

}