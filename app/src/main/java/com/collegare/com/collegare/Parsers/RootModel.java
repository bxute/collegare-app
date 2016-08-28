import java.util.ArrayList;

class RootModel {

	public CopyrightModel _copyright;
	public String name;
	public String organizer_name;
	public String organizer_description;
	public String description;
	public String privacy;
	public String state;
	public String type;
	public String timezone;
	public String logo;
	public String code_of_conduct;
	public String background_image;
	public ArrayList<Social_linksModel> social_links;
	public int id;
	public String start_time;
	public String schedule_published_on;
	public Call_for_papersModel _call_for_papers;
	public String topic;
	public CreatorModel _creator;
	public String email;
	public VersionModel _version;
	public String location_name;
	public String end_time;

	public RootModel(CopyrightModel copyright, String name, String organizer_name, String organizer_description, String description, String privacy, String state, String type, String timezone, String logo, String code_of_conduct, String background_image, ArrayList<Social_linksModel> social_links, int id, String start_time, String schedule_published_on, Call_for_papersModel call_for_papers, String topic, CreatorModel creator, String email, VersionModel version, String location_name, String end_time) {

		this._copyright = copyright;
		this.name = name;
		this.organizer_name = organizer_name;
		this.organizer_description = organizer_description;
		this.description = description;
		this.privacy = privacy;
		this.state = state;
		this.type = type;
		this.timezone = timezone;
		this.logo = logo;
		this.code_of_conduct = code_of_conduct;
		this.background_image = background_image;
		this.social_links = social_links;
		this.id = id;
		this.start_time = start_time;
		this.schedule_published_on = schedule_published_on;
		this._call_for_papers = call_for_papers;
		this.topic = topic;
		this._creator = creator;
		this.email = email;
		this._version = version;
		this.location_name = location_name;
		this.end_time = end_time;

	}

}