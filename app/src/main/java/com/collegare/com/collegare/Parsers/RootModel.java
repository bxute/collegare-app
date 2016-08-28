import java.util.ArrayList;

class RootModel {

	public String email;
	public String organizer_name;
	public String description;
	public CreatorModel _creator;
	public int id;
	public String state;
	public CopyrightModel _copyright;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_description;
	public String timezone;
	public String logo;
	public Call_for_papersModel _call_for_papers;
	public String background_image;
	public String start_time;
	public String privacy;
	public String name;
	public String schedule_published_on;
	public String end_time;
	public VersionModel _version;
	public String topic;
	public String code_of_conduct;
	public String location_name;
	public String type;

	public RootModel(String email, String organizer_name, String description, CreatorModel creator, int id, String state, CopyrightModel copyright, ArrayList<Social_linksModel> social_links, String organizer_description, String timezone, String logo, Call_for_papersModel call_for_papers, String background_image, String start_time, String privacy, String name, String schedule_published_on, String end_time, VersionModel version, String topic, String code_of_conduct, String location_name, String type) {

		this.email = email;
		this.organizer_name = organizer_name;
		this.description = description;
		this._creator = creator;
		this.id = id;
		this.state = state;
		this._copyright = copyright;
		this.social_links = social_links;
		this.organizer_description = organizer_description;
		this.timezone = timezone;
		this.logo = logo;
		this._call_for_papers = call_for_papers;
		this.background_image = background_image;
		this.start_time = start_time;
		this.privacy = privacy;
		this.name = name;
		this.schedule_published_on = schedule_published_on;
		this.end_time = end_time;
		this._version = version;
		this.topic = topic;
		this.code_of_conduct = code_of_conduct;
		this.location_name = location_name;
		this.type = type;

	}

}