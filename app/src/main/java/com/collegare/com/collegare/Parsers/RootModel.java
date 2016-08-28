import java.util.ArrayList;

class RootModel {

	public int id;
	public String privacy;
	public String type;
	public Call_for_papersModel _call_for_papers;
	public String organizer_name;
	public String description;
	public String end_time;
	public String topic;
	public String code_of_conduct;
	public String schedule_published_on;
	public String start_time;
	public CopyrightModel _copyright;
	public String email;
	public String location_name;
	public ArrayList<Social_linksModel> social_links;
	public String background_image;
	public String logo;
	public String name;
	public CreatorModel _creator;
	public VersionModel _version;
	public String timezone;
	public String state;
	public String organizer_description;

	public RootModel(int id, String privacy, String type, Call_for_papersModel call_for_papers, String organizer_name, String description, String end_time, String topic, String code_of_conduct, String schedule_published_on, String start_time, CopyrightModel copyright, String email, String location_name, ArrayList<Social_linksModel> social_links, String background_image, String logo, String name, CreatorModel creator, VersionModel version, String timezone, String state, String organizer_description) {

		this.id = id;
		this.privacy = privacy;
		this.type = type;
		this._call_for_papers = call_for_papers;
		this.organizer_name = organizer_name;
		this.description = description;
		this.end_time = end_time;
		this.topic = topic;
		this.code_of_conduct = code_of_conduct;
		this.schedule_published_on = schedule_published_on;
		this.start_time = start_time;
		this._copyright = copyright;
		this.email = email;
		this.location_name = location_name;
		this.social_links = social_links;
		this.background_image = background_image;
		this.logo = logo;
		this.name = name;
		this._creator = creator;
		this._version = version;
		this.timezone = timezone;
		this.state = state;
		this.organizer_description = organizer_description;

	}

}