import java.util.ArrayList;

class RootModel {

	public int id;
	public String email;
	public VersionModel _version;
	public String organizer_description;
	public String topic;
	public String timezone;
	public String name;
	public String type;
	public String logo;
	public CreatorModel _creator;
	public String privacy;
	public String code_of_conduct;
	public String description;
	public String location_name;
	public ArrayList<Social_linksModel> social_links;
	public String end_time;
	public String start_time;
	public String organizer_name;
	public String background_image;
	public String state;
	public String schedule_published_on;
	public CopyrightModel _copyright;
	public Call_for_papersModel _call_for_papers;

	public RootModel(int id, String email, VersionModel version, String organizer_description, String topic, String timezone, String name, String type, String logo, CreatorModel creator, String privacy, String code_of_conduct, String description, String location_name, ArrayList<Social_linksModel> social_links, String end_time, String start_time, String organizer_name, String background_image, String state, String schedule_published_on, CopyrightModel copyright, Call_for_papersModel call_for_papers) {

		this.id = id;
		this.email = email;
		this._version = version;
		this.organizer_description = organizer_description;
		this.topic = topic;
		this.timezone = timezone;
		this.name = name;
		this.type = type;
		this.logo = logo;
		this._creator = creator;
		this.privacy = privacy;
		this.code_of_conduct = code_of_conduct;
		this.description = description;
		this.location_name = location_name;
		this.social_links = social_links;
		this.end_time = end_time;
		this.start_time = start_time;
		this.organizer_name = organizer_name;
		this.background_image = background_image;
		this.state = state;
		this.schedule_published_on = schedule_published_on;
		this._copyright = copyright;
		this._call_for_papers = call_for_papers;

	}

}