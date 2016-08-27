import java.util.ArrayList;

class RootModel {

	public int id;
	public String location_name;
	public String email;
	public String organizer_description;
	public VersionModel _version;
	public String timezone;
	public String topic;
	public String name;
	public String start_time;
	public String organizer_name;
	public String privacy;
	public String type;
	public CreatorModel _creator;
	public ArrayList<Social_linksModel> social_links;
	public String logo;
	public String description;
	public String schedule_published_on;
	public String code_of_conduct;
	public String state;
	public String background_image;
	public String end_time;
	public Call_for_papersModel _call_for_papers;
	public CopyrightModel _copyright;

	public RootModel(int id, String location_name, String email, String organizer_description, VersionModel version, String timezone, String topic, String name, String start_time, String organizer_name, String privacy, String type, CreatorModel creator, ArrayList<Social_linksModel> social_links, String logo, String description, String schedule_published_on, String code_of_conduct, String state, String background_image, String end_time, Call_for_papersModel call_for_papers, CopyrightModel copyright) {

		this.id = id;
		this.location_name = location_name;
		this.email = email;
		this.organizer_description = organizer_description;
		this._version = version;
		this.timezone = timezone;
		this.topic = topic;
		this.name = name;
		this.start_time = start_time;
		this.organizer_name = organizer_name;
		this.privacy = privacy;
		this.type = type;
		this._creator = creator;
		this.social_links = social_links;
		this.logo = logo;
		this.description = description;
		this.schedule_published_on = schedule_published_on;
		this.code_of_conduct = code_of_conduct;
		this.state = state;
		this.background_image = background_image;
		this.end_time = end_time;
		this._call_for_papers = call_for_papers;
		this._copyright = copyright;

	}

}