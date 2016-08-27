import java.util.ArrayList;

class RootModel {

	public String email;
	public String end_time;
	public String logo;
	public String type;
	public CopyrightModel _copyright;
	public String name;
	public String start_time;
	public VersionModel _version;
	public String background_image;
	public String privacy;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_description;
	public String topic;
	public CreatorModel _creator;
	public int id;
	public Call_for_papersModel _call_for_papers;
	public String schedule_published_on;
	public String organizer_name;
	public String timezone;
	public String description;
	public String state;
	public String location_name;
	public String code_of_conduct;

	public RootModel(String email, String end_time, String logo, String type, CopyrightModel copyright, String name, String start_time, VersionModel version, String background_image, String privacy, ArrayList<Social_linksModel> social_links, String organizer_description, String topic, CreatorModel creator, int id, Call_for_papersModel call_for_papers, String schedule_published_on, String organizer_name, String timezone, String description, String state, String location_name, String code_of_conduct) {

		this.email = email;
		this.end_time = end_time;
		this.logo = logo;
		this.type = type;
		this._copyright = copyright;
		this.name = name;
		this.start_time = start_time;
		this._version = version;
		this.background_image = background_image;
		this.privacy = privacy;
		this.social_links = social_links;
		this.organizer_description = organizer_description;
		this.topic = topic;
		this._creator = creator;
		this.id = id;
		this._call_for_papers = call_for_papers;
		this.schedule_published_on = schedule_published_on;
		this.organizer_name = organizer_name;
		this.timezone = timezone;
		this.description = description;
		this.state = state;
		this.location_name = location_name;
		this.code_of_conduct = code_of_conduct;

	}

}