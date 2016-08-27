import java.util.ArrayList;

class RootModel {

	public CopyrightModel _copyright;
	public VersionModel _version;
	public String timezone;
	public String organizer_description;
	public String privacy;
	public String state;
	public String location_name;
	public String logo;
	public Call_for_papersModel _call_for_papers;
	public CreatorModel _creator;
	public String organizer_name;
	public String background_image;
	public String end_time;
	public ArrayList<Social_linksModel> social_links;
	public String code_of_conduct;
	public String topic;
	public String name;
	public String type;
	public String email;
	public String schedule_published_on;
	public int id;
	public String start_time;
	public String description;

	public RootModel(CopyrightModel copyright, VersionModel version, String timezone, String organizer_description, String privacy, String state, String location_name, String logo, Call_for_papersModel call_for_papers, CreatorModel creator, String organizer_name, String background_image, String end_time, ArrayList<Social_linksModel> social_links, String code_of_conduct, String topic, String name, String type, String email, String schedule_published_on, int id, String start_time, String description) {

		this._copyright = copyright;
		this._version = version;
		this.timezone = timezone;
		this.organizer_description = organizer_description;
		this.privacy = privacy;
		this.state = state;
		this.location_name = location_name;
		this.logo = logo;
		this._call_for_papers = call_for_papers;
		this._creator = creator;
		this.organizer_name = organizer_name;
		this.background_image = background_image;
		this.end_time = end_time;
		this.social_links = social_links;
		this.code_of_conduct = code_of_conduct;
		this.topic = topic;
		this.name = name;
		this.type = type;
		this.email = email;
		this.schedule_published_on = schedule_published_on;
		this.id = id;
		this.start_time = start_time;
		this.description = description;

	}

}