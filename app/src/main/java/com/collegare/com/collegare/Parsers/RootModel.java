import java.util.ArrayList;

class RootModel {

	public String state;
	public String logo;
	public String topic;
	public String schedule_published_on;
	public Call_for_papersModel _call_for_papers;
	public String privacy;
	public String start_time;
	public CopyrightModel _copyright;
	public CreatorModel _creator;
	public String location_name;
	public String background_image;
	public String organizer_name;
	public ArrayList<Social_linksModel> social_links;
	public String description;
	public String timezone;
	public String email;
	public String type;
	public String end_time;
	public String name;
	public int id;
	public VersionModel _version;
	public String organizer_description;
	public String code_of_conduct;

	public RootModel(String state, String logo, String topic, String schedule_published_on, Call_for_papersModel call_for_papers, String privacy, String start_time, CopyrightModel copyright, CreatorModel creator, String location_name, String background_image, String organizer_name, ArrayList<Social_linksModel> social_links, String description, String timezone, String email, String type, String end_time, String name, int id, VersionModel version, String organizer_description, String code_of_conduct) {

		this.state = state;
		this.logo = logo;
		this.topic = topic;
		this.schedule_published_on = schedule_published_on;
		this._call_for_papers = call_for_papers;
		this.privacy = privacy;
		this.start_time = start_time;
		this._copyright = copyright;
		this._creator = creator;
		this.location_name = location_name;
		this.background_image = background_image;
		this.organizer_name = organizer_name;
		this.social_links = social_links;
		this.description = description;
		this.timezone = timezone;
		this.email = email;
		this.type = type;
		this.end_time = end_time;
		this.name = name;
		this.id = id;
		this._version = version;
		this.organizer_description = organizer_description;
		this.code_of_conduct = code_of_conduct;

	}

}