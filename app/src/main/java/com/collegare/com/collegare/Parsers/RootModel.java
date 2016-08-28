import java.util.ArrayList;

class RootModel {

	public String background_image;
	public String email;
	public String description;
	public CopyrightModel _copyright;
	public String schedule_published_on;
	public String state;
	public String privacy;
	public CreatorModel _creator;
	public String organizer_name;
	public String logo;
	public String timezone;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_description;
	public String end_time;
	public String name;
	public int id;
	public String location_name;
	public Call_for_papersModel _call_for_papers;
	public String code_of_conduct;
	public String start_time;
	public String topic;
	public VersionModel _version;
	public String type;

	public RootModel(String background_image, String email, String description, CopyrightModel copyright, String schedule_published_on, String state, String privacy, CreatorModel creator, String organizer_name, String logo, String timezone, ArrayList<Social_linksModel> social_links, String organizer_description, String end_time, String name, int id, String location_name, Call_for_papersModel call_for_papers, String code_of_conduct, String start_time, String topic, VersionModel version, String type) {

		this.background_image = background_image;
		this.email = email;
		this.description = description;
		this._copyright = copyright;
		this.schedule_published_on = schedule_published_on;
		this.state = state;
		this.privacy = privacy;
		this._creator = creator;
		this.organizer_name = organizer_name;
		this.logo = logo;
		this.timezone = timezone;
		this.social_links = social_links;
		this.organizer_description = organizer_description;
		this.end_time = end_time;
		this.name = name;
		this.id = id;
		this.location_name = location_name;
		this._call_for_papers = call_for_papers;
		this.code_of_conduct = code_of_conduct;
		this.start_time = start_time;
		this.topic = topic;
		this._version = version;
		this.type = type;

	}

}