import java.util.ArrayList;

class RootModel {

	public String privacy;
	public String state;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_name;
	public String timezone;
	public String name;
	public String description;
	public String end_time;
	public Call_for_papersModel _call_for_papers;
	public String type;
	public String code_of_conduct;
	public VersionModel _version;
	public int id;
	public String schedule_published_on;
	public String location_name;
	public String logo;
	public String topic;
	public String organizer_description;
	public CreatorModel _creator;
	public String background_image;
	public String start_time;
	public String email;
	public CopyrightModel _copyright;

	public RootModel(String privacy, String state, ArrayList<Social_linksModel> social_links, String organizer_name, String timezone, String name, String description, String end_time, Call_for_papersModel call_for_papers, String type, String code_of_conduct, VersionModel version, int id, String schedule_published_on, String location_name, String logo, String topic, String organizer_description, CreatorModel creator, String background_image, String start_time, String email, CopyrightModel copyright) {

		this.privacy = privacy;
		this.state = state;
		this.social_links = social_links;
		this.organizer_name = organizer_name;
		this.timezone = timezone;
		this.name = name;
		this.description = description;
		this.end_time = end_time;
		this._call_for_papers = call_for_papers;
		this.type = type;
		this.code_of_conduct = code_of_conduct;
		this._version = version;
		this.id = id;
		this.schedule_published_on = schedule_published_on;
		this.location_name = location_name;
		this.logo = logo;
		this.topic = topic;
		this.organizer_description = organizer_description;
		this._creator = creator;
		this.background_image = background_image;
		this.start_time = start_time;
		this.email = email;
		this._copyright = copyright;

	}

}