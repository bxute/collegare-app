import java.util.ArrayList;

class RootModel {

	public String privacy;
	public int id;
	public String schedule_published_on;
	public String background_image;
	public String state;
	public ArrayList<Social_linksModel> social_links;
	public String description;
	public VersionModel _version;
	public CopyrightModel _copyright;
	public String timezone;
	public String location_name;
	public String logo;
	public String type;
	public String organizer_description;
	public String start_time;
	public CreatorModel _creator;
	public String topic;
	public String end_time;
	public String name;
	public String email;
	public String organizer_name;
	public Call_for_papersModel _call_for_papers;
	public String code_of_conduct;

	public RootModel(String privacy, int id, String schedule_published_on, String background_image, String state, ArrayList<Social_linksModel> social_links, String description, VersionModel version, CopyrightModel copyright, String timezone, String location_name, String logo, String type, String organizer_description, String start_time, CreatorModel creator, String topic, String end_time, String name, String email, String organizer_name, Call_for_papersModel call_for_papers, String code_of_conduct) {

		this.privacy = privacy;
		this.id = id;
		this.schedule_published_on = schedule_published_on;
		this.background_image = background_image;
		this.state = state;
		this.social_links = social_links;
		this.description = description;
		this._version = version;
		this._copyright = copyright;
		this.timezone = timezone;
		this.location_name = location_name;
		this.logo = logo;
		this.type = type;
		this.organizer_description = organizer_description;
		this.start_time = start_time;
		this._creator = creator;
		this.topic = topic;
		this.end_time = end_time;
		this.name = name;
		this.email = email;
		this.organizer_name = organizer_name;
		this._call_for_papers = call_for_papers;
		this.code_of_conduct = code_of_conduct;

	}

}