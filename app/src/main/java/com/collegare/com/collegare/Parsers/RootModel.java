import java.util.ArrayList;

class RootModel {

	public String background_image;
	public String location_name;
	public String state;
	public String topic;
	public String start_time;
	public CreatorModel _creator;
	public String type;
	public String schedule_published_on;
	public String description;
	public Call_for_papersModel _call_for_papers;
	public String timezone;
	public String end_time;
	public VersionModel _version;
	public String logo;
	public ArrayList<Social_linksModel> social_links;
	public String privacy;
	public String organizer_description;
	public String name;
	public int id;
	public String email;
	public String organizer_name;
	public CopyrightModel _copyright;
	public String code_of_conduct;

	public RootModel(String background_image, String location_name, String state, String topic, String start_time, CreatorModel creator, String type, String schedule_published_on, String description, Call_for_papersModel call_for_papers, String timezone, String end_time, VersionModel version, String logo, ArrayList<Social_linksModel> social_links, String privacy, String organizer_description, String name, int id, String email, String organizer_name, CopyrightModel copyright, String code_of_conduct) {

		this.background_image = background_image;
		this.location_name = location_name;
		this.state = state;
		this.topic = topic;
		this.start_time = start_time;
		this._creator = creator;
		this.type = type;
		this.schedule_published_on = schedule_published_on;
		this.description = description;
		this._call_for_papers = call_for_papers;
		this.timezone = timezone;
		this.end_time = end_time;
		this._version = version;
		this.logo = logo;
		this.social_links = social_links;
		this.privacy = privacy;
		this.organizer_description = organizer_description;
		this.name = name;
		this.id = id;
		this.email = email;
		this.organizer_name = organizer_name;
		this._copyright = copyright;
		this.code_of_conduct = code_of_conduct;

	}

}