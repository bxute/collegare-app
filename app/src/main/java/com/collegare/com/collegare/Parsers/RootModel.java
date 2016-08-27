import java.util.ArrayList;

class RootModel {

	public int id;
	public CreatorModel _creator;
	public String logo;
	public String privacy;
	public CopyrightModel _copyright;
	public String location_name;
	public ArrayList<Social_linksModel> social_links;
	public String code_of_conduct;
	public String timezone;
	public String email;
	public String start_time;
	public String state;
	public String schedule_published_on;
	public String end_time;
	public String topic;
	public Call_for_papersModel _call_for_papers;
	public String background_image;
	public String organizer_description;
	public String name;
	public String type;
	public String organizer_name;
	public String description;
	public VersionModel _version;

	public RootModel(int id, CreatorModel creator, String logo, String privacy, CopyrightModel copyright, String location_name, ArrayList<Social_linksModel> social_links, String code_of_conduct, String timezone, String email, String start_time, String state, String schedule_published_on, String end_time, String topic, Call_for_papersModel call_for_papers, String background_image, String organizer_description, String name, String type, String organizer_name, String description, VersionModel version) {

		this.id = id;
		this._creator = creator;
		this.logo = logo;
		this.privacy = privacy;
		this._copyright = copyright;
		this.location_name = location_name;
		this.social_links = social_links;
		this.code_of_conduct = code_of_conduct;
		this.timezone = timezone;
		this.email = email;
		this.start_time = start_time;
		this.state = state;
		this.schedule_published_on = schedule_published_on;
		this.end_time = end_time;
		this.topic = topic;
		this._call_for_papers = call_for_papers;
		this.background_image = background_image;
		this.organizer_description = organizer_description;
		this.name = name;
		this.type = type;
		this.organizer_name = organizer_name;
		this.description = description;
		this._version = version;

	}

}