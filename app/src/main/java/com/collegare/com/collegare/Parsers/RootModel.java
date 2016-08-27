import java.util.ArrayList;

class RootModel {

	public String name;
	public String privacy;
	public String start_time;
	public VersionModel _version;
	public int id;
	public String background_image;
	public String description;
	public String organizer_name;
	public String timezone;
	public CopyrightModel _copyright;
	public String organizer_description;
	public String topic;
	public String state;
	public Call_for_papersModel _call_for_papers;
	public String logo;
	public String code_of_conduct;
	public CreatorModel _creator;
	public ArrayList<Social_linksModel> social_links;
	public String end_time;
	public String location_name;
	public String schedule_published_on;
	public String type;
	public String email;

	public RootModel(String name, String privacy, String start_time, VersionModel version, int id, String background_image, String description, String organizer_name, String timezone, CopyrightModel copyright, String organizer_description, String topic, String state, Call_for_papersModel call_for_papers, String logo, String code_of_conduct, CreatorModel creator, ArrayList<Social_linksModel> social_links, String end_time, String location_name, String schedule_published_on, String type, String email) {

		this.name = name;
		this.privacy = privacy;
		this.start_time = start_time;
		this._version = version;
		this.id = id;
		this.background_image = background_image;
		this.description = description;
		this.organizer_name = organizer_name;
		this.timezone = timezone;
		this._copyright = copyright;
		this.organizer_description = organizer_description;
		this.topic = topic;
		this.state = state;
		this._call_for_papers = call_for_papers;
		this.logo = logo;
		this.code_of_conduct = code_of_conduct;
		this._creator = creator;
		this.social_links = social_links;
		this.end_time = end_time;
		this.location_name = location_name;
		this.schedule_published_on = schedule_published_on;
		this.type = type;
		this.email = email;

	}

}