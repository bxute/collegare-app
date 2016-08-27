import java.util.ArrayList;

class RootModel {

	public String start_time;
	public VersionModel _version;
	public Call_for_papersModel _call_for_papers;
	public String background_image;
	public String type;
	public CreatorModel _creator;
	public String topic;
	public String end_time;
	public String description;
	public String logo;
	public String timezone;
	public String code_of_conduct;
	public int id;
	public String schedule_published_on;
	public String location_name;
	public String name;
	public String privacy;
	public String organizer_description;
	public CopyrightModel _copyright;
	public String organizer_name;
	public String state;
	public ArrayList<Social_linksModel> social_links;
	public String email;

	public RootModel(String start_time, VersionModel version, Call_for_papersModel call_for_papers, String background_image, String type, CreatorModel creator, String topic, String end_time, String description, String logo, String timezone, String code_of_conduct, int id, String schedule_published_on, String location_name, String name, String privacy, String organizer_description, CopyrightModel copyright, String organizer_name, String state, ArrayList<Social_linksModel> social_links, String email) {

		this.start_time = start_time;
		this._version = version;
		this._call_for_papers = call_for_papers;
		this.background_image = background_image;
		this.type = type;
		this._creator = creator;
		this.topic = topic;
		this.end_time = end_time;
		this.description = description;
		this.logo = logo;
		this.timezone = timezone;
		this.code_of_conduct = code_of_conduct;
		this.id = id;
		this.schedule_published_on = schedule_published_on;
		this.location_name = location_name;
		this.name = name;
		this.privacy = privacy;
		this.organizer_description = organizer_description;
		this._copyright = copyright;
		this.organizer_name = organizer_name;
		this.state = state;
		this.social_links = social_links;
		this.email = email;

	}

}