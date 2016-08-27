import java.util.ArrayList;

class RootModel {

	public String end_time;
	public String description;
	public ArrayList<Social_linksModel> social_links;
	public String name;
	public VersionModel _version;
	public String schedule_published_on;
	public String type;
	public String privacy;
	public int id;
	public String organizer_description;
	public CreatorModel _creator;
	public String topic;
	public Call_for_papersModel _call_for_papers;
	public CopyrightModel _copyright;
	public String location_name;
	public String state;
	public String code_of_conduct;
	public String organizer_name;
	public String timezone;
	public String start_time;
	public String logo;
	public String background_image;
	public String email;

	public RootModel(String end_time, String description, ArrayList<Social_linksModel> social_links, String name, VersionModel version, String schedule_published_on, String type, String privacy, int id, String organizer_description, CreatorModel creator, String topic, Call_for_papersModel call_for_papers, CopyrightModel copyright, String location_name, String state, String code_of_conduct, String organizer_name, String timezone, String start_time, String logo, String background_image, String email) {

		this.end_time = end_time;
		this.description = description;
		this.social_links = social_links;
		this.name = name;
		this._version = version;
		this.schedule_published_on = schedule_published_on;
		this.type = type;
		this.privacy = privacy;
		this.id = id;
		this.organizer_description = organizer_description;
		this._creator = creator;
		this.topic = topic;
		this._call_for_papers = call_for_papers;
		this._copyright = copyright;
		this.location_name = location_name;
		this.state = state;
		this.code_of_conduct = code_of_conduct;
		this.organizer_name = organizer_name;
		this.timezone = timezone;
		this.start_time = start_time;
		this.logo = logo;
		this.background_image = background_image;
		this.email = email;

	}

}