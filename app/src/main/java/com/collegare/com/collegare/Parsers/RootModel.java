import java.util.ArrayList;

class RootModel {

	public String timezone;
	public Call_for_papersModel _call_for_papers;
	public String code_of_conduct;
	public String end_time;
	public String state;
	public String organizer_description;
	public String description;
	public ArrayList<Social_linksModel> social_links;
	public String email;
	public String location_name;
	public String name;
	public String organizer_name;
	public String privacy;
	public String background_image;
	public String logo;
	public VersionModel _version;
	public String type;
	public String topic;
	public String start_time;
	public CreatorModel _creator;
	public String schedule_published_on;
	public int id;
	public CopyrightModel _copyright;

	public RootModel(String timezone, Call_for_papersModel call_for_papers, String code_of_conduct, String end_time, String state, String organizer_description, String description, ArrayList<Social_linksModel> social_links, String email, String location_name, String name, String organizer_name, String privacy, String background_image, String logo, VersionModel version, String type, String topic, String start_time, CreatorModel creator, String schedule_published_on, int id, CopyrightModel copyright) {

		this.timezone = timezone;
		this._call_for_papers = call_for_papers;
		this.code_of_conduct = code_of_conduct;
		this.end_time = end_time;
		this.state = state;
		this.organizer_description = organizer_description;
		this.description = description;
		this.social_links = social_links;
		this.email = email;
		this.location_name = location_name;
		this.name = name;
		this.organizer_name = organizer_name;
		this.privacy = privacy;
		this.background_image = background_image;
		this.logo = logo;
		this._version = version;
		this.type = type;
		this.topic = topic;
		this.start_time = start_time;
		this._creator = creator;
		this.schedule_published_on = schedule_published_on;
		this.id = id;
		this._copyright = copyright;

	}

}