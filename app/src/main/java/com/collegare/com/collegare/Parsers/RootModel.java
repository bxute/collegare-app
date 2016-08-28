import java.util.ArrayList;

class RootModel {

	public String organizer_description;
	public String schedule_published_on;
	public String name;
	public int id;
	public String privacy;
	public String start_time;
	public String code_of_conduct;
	public CreatorModel _creator;
	public String logo;
	public String description;
	public String background_image;
	public Call_for_papersModel _call_for_papers;
	public VersionModel _version;
	public String end_time;
	public String organizer_name;
	public String timezone;
	public String topic;
	public ArrayList<Social_linksModel> social_links;
	public String state;
	public CopyrightModel _copyright;
	public String type;
	public String location_name;
	public String email;

	public RootModel(String organizer_description, String schedule_published_on, String name, int id, String privacy, String start_time, String code_of_conduct, CreatorModel creator, String logo, String description, String background_image, Call_for_papersModel call_for_papers, VersionModel version, String end_time, String organizer_name, String timezone, String topic, ArrayList<Social_linksModel> social_links, String state, CopyrightModel copyright, String type, String location_name, String email) {

		this.organizer_description = organizer_description;
		this.schedule_published_on = schedule_published_on;
		this.name = name;
		this.id = id;
		this.privacy = privacy;
		this.start_time = start_time;
		this.code_of_conduct = code_of_conduct;
		this._creator = creator;
		this.logo = logo;
		this.description = description;
		this.background_image = background_image;
		this._call_for_papers = call_for_papers;
		this._version = version;
		this.end_time = end_time;
		this.organizer_name = organizer_name;
		this.timezone = timezone;
		this.topic = topic;
		this.social_links = social_links;
		this.state = state;
		this._copyright = copyright;
		this.type = type;
		this.location_name = location_name;
		this.email = email;

	}

}