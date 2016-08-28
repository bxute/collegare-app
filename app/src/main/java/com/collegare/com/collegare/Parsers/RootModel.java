import java.util.ArrayList;

class RootModel {

	public String location_name;
	public String end_time;
	public String logo;
	public Call_for_papersModel _call_for_papers;
	public String organizer_name;
	public CreatorModel _creator;
	public VersionModel _version;
	public String organizer_description;
	public String type;
	public String topic;
	public String email;
	public int id;
	public ArrayList<Social_linksModel> social_links;
	public String schedule_published_on;
	public String name;
	public String state;
	public String start_time;
	public String code_of_conduct;
	public String background_image;
	public String description;
	public String privacy;
	public String timezone;
	public CopyrightModel _copyright;

	public RootModel(String location_name, String end_time, String logo, Call_for_papersModel call_for_papers, String organizer_name, CreatorModel creator, VersionModel version, String organizer_description, String type, String topic, String email, int id, ArrayList<Social_linksModel> social_links, String schedule_published_on, String name, String state, String start_time, String code_of_conduct, String background_image, String description, String privacy, String timezone, CopyrightModel copyright) {

		this.location_name = location_name;
		this.end_time = end_time;
		this.logo = logo;
		this._call_for_papers = call_for_papers;
		this.organizer_name = organizer_name;
		this._creator = creator;
		this._version = version;
		this.organizer_description = organizer_description;
		this.type = type;
		this.topic = topic;
		this.email = email;
		this.id = id;
		this.social_links = social_links;
		this.schedule_published_on = schedule_published_on;
		this.name = name;
		this.state = state;
		this.start_time = start_time;
		this.code_of_conduct = code_of_conduct;
		this.background_image = background_image;
		this.description = description;
		this.privacy = privacy;
		this.timezone = timezone;
		this._copyright = copyright;

	}

}