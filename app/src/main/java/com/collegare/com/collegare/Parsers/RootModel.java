import java.util.ArrayList;

class RootModel {

	public CopyrightModel _copyright;
	public String timezone;
	public String type;
	public ArrayList<Social_linksModel> social_links;
	public Call_for_papersModel _call_for_papers;
	public String end_time;
	public String background_image;
	public int id;
	public String email;
	public String location_name;
	public String name;
	public String organizer_name;
	public String description;
	public String topic;
	public String logo;
	public VersionModel _version;
	public String state;
	public String start_time;
	public String code_of_conduct;
	public String schedule_published_on;
	public String privacy;
	public CreatorModel _creator;
	public String organizer_description;

	public RootModel(CopyrightModel copyright, String timezone, String type, ArrayList<Social_linksModel> social_links, Call_for_papersModel call_for_papers, String end_time, String background_image, int id, String email, String location_name, String name, String organizer_name, String description, String topic, String logo, VersionModel version, String state, String start_time, String code_of_conduct, String schedule_published_on, String privacy, CreatorModel creator, String organizer_description) {

		this._copyright = copyright;
		this.timezone = timezone;
		this.type = type;
		this.social_links = social_links;
		this._call_for_papers = call_for_papers;
		this.end_time = end_time;
		this.background_image = background_image;
		this.id = id;
		this.email = email;
		this.location_name = location_name;
		this.name = name;
		this.organizer_name = organizer_name;
		this.description = description;
		this.topic = topic;
		this.logo = logo;
		this._version = version;
		this.state = state;
		this.start_time = start_time;
		this.code_of_conduct = code_of_conduct;
		this.schedule_published_on = schedule_published_on;
		this.privacy = privacy;
		this._creator = creator;
		this.organizer_description = organizer_description;

	}

}