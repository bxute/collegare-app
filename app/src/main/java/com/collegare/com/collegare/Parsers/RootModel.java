import java.util.ArrayList;

class RootModel {

	public String location_name;
	public String state;
	public CopyrightModel _copyright;
	public String schedule_published_on;
	public String email;
	public String timezone;
	public String organizer_description;
	public String logo;
	public String type;
	public String end_time;
	public ArrayList<Social_linksModel> social_links;
	public Call_for_papersModel _call_for_papers;
	public String background_image;
	public String name;
	public String start_time;
	public String organizer_name;
	public CreatorModel _creator;
	public String topic;
	public String description;
	public int id;
	public String privacy;
	public VersionModel _version;
	public String code_of_conduct;

	public RootModel(String location_name, String state, CopyrightModel copyright, String schedule_published_on, String email, String timezone, String organizer_description, String logo, String type, String end_time, ArrayList<Social_linksModel> social_links, Call_for_papersModel call_for_papers, String background_image, String name, String start_time, String organizer_name, CreatorModel creator, String topic, String description, int id, String privacy, VersionModel version, String code_of_conduct) {

		this.location_name = location_name;
		this.state = state;
		this._copyright = copyright;
		this.schedule_published_on = schedule_published_on;
		this.email = email;
		this.timezone = timezone;
		this.organizer_description = organizer_description;
		this.logo = logo;
		this.type = type;
		this.end_time = end_time;
		this.social_links = social_links;
		this._call_for_papers = call_for_papers;
		this.background_image = background_image;
		this.name = name;
		this.start_time = start_time;
		this.organizer_name = organizer_name;
		this._creator = creator;
		this.topic = topic;
		this.description = description;
		this.id = id;
		this.privacy = privacy;
		this._version = version;
		this.code_of_conduct = code_of_conduct;

	}

}