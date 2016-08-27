import java.util.ArrayList;

class RootModel {

	public String organizer_description;
	public ArrayList<Social_linksModel> social_links;
	public String timezone;
	public CreatorModel _creator;
	public String privacy;
	public String organizer_name;
	public String topic;
	public String name;
	public String start_time;
	public VersionModel _version;
	public String background_image;
	public int id;
	public String logo;
	public String type;
	public String end_time;
	public String code_of_conduct;
	public String schedule_published_on;
	public String location_name;
	public Call_for_papersModel _call_for_papers;
	public String description;
	public String state;
	public String email;
	public CopyrightModel _copyright;

	public RootModel(String organizer_description, ArrayList<Social_linksModel> social_links, String timezone, CreatorModel creator, String privacy, String organizer_name, String topic, String name, String start_time, VersionModel version, String background_image, int id, String logo, String type, String end_time, String code_of_conduct, String schedule_published_on, String location_name, Call_for_papersModel call_for_papers, String description, String state, String email, CopyrightModel copyright) {

		this.organizer_description = organizer_description;
		this.social_links = social_links;
		this.timezone = timezone;
		this._creator = creator;
		this.privacy = privacy;
		this.organizer_name = organizer_name;
		this.topic = topic;
		this.name = name;
		this.start_time = start_time;
		this._version = version;
		this.background_image = background_image;
		this.id = id;
		this.logo = logo;
		this.type = type;
		this.end_time = end_time;
		this.code_of_conduct = code_of_conduct;
		this.schedule_published_on = schedule_published_on;
		this.location_name = location_name;
		this._call_for_papers = call_for_papers;
		this.description = description;
		this.state = state;
		this.email = email;
		this._copyright = copyright;

	}

}