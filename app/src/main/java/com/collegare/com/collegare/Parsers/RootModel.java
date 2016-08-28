import java.util.ArrayList;

class RootModel {

	public String end_time;
	public String state;
	public String name;
	public ArrayList<Social_linksModel> social_links;
	public String background_image;
	public String schedule_published_on;
	public String organizer_description;
	public String location_name;
	public int id;
	public String timezone;
	public String logo;
	public String topic;
	public Call_for_papersModel _call_for_papers;
	public String description;
	public CreatorModel _creator;
	public CopyrightModel _copyright;
	public String email;
	public String start_time;
	public String type;
	public VersionModel _version;
	public String privacy;
	public String organizer_name;
	public String code_of_conduct;

	public RootModel(String end_time, String state, String name, ArrayList<Social_linksModel> social_links, String background_image, String schedule_published_on, String organizer_description, String location_name, int id, String timezone, String logo, String topic, Call_for_papersModel call_for_papers, String description, CreatorModel creator, CopyrightModel copyright, String email, String start_time, String type, VersionModel version, String privacy, String organizer_name, String code_of_conduct) {

		this.end_time = end_time;
		this.state = state;
		this.name = name;
		this.social_links = social_links;
		this.background_image = background_image;
		this.schedule_published_on = schedule_published_on;
		this.organizer_description = organizer_description;
		this.location_name = location_name;
		this.id = id;
		this.timezone = timezone;
		this.logo = logo;
		this.topic = topic;
		this._call_for_papers = call_for_papers;
		this.description = description;
		this._creator = creator;
		this._copyright = copyright;
		this.email = email;
		this.start_time = start_time;
		this.type = type;
		this._version = version;
		this.privacy = privacy;
		this.organizer_name = organizer_name;
		this.code_of_conduct = code_of_conduct;

	}

}