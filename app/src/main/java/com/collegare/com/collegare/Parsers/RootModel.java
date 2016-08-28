import java.util.ArrayList;

class RootModel {

	public CopyrightModel _copyright;
	public String state;
	public String email;
	public CreatorModel _creator;
	public String start_time;
	public String location_name;
	public String schedule_published_on;
	public String end_time;
	public String code_of_conduct;
	public String name;
	public String privacy;
	public Call_for_papersModel _call_for_papers;
	public VersionModel _version;
	public String organizer_name;
	public String timezone;
	public int id;
	public String background_image;
	public String logo;
	public ArrayList<Social_linksModel> social_links;
	public String topic;
	public String description;
	public String organizer_description;
	public String type;

	public RootModel(CopyrightModel copyright, String state, String email, CreatorModel creator, String start_time, String location_name, String schedule_published_on, String end_time, String code_of_conduct, String name, String privacy, Call_for_papersModel call_for_papers, VersionModel version, String organizer_name, String timezone, int id, String background_image, String logo, ArrayList<Social_linksModel> social_links, String topic, String description, String organizer_description, String type) {

		this._copyright = copyright;
		this.state = state;
		this.email = email;
		this._creator = creator;
		this.start_time = start_time;
		this.location_name = location_name;
		this.schedule_published_on = schedule_published_on;
		this.end_time = end_time;
		this.code_of_conduct = code_of_conduct;
		this.name = name;
		this.privacy = privacy;
		this._call_for_papers = call_for_papers;
		this._version = version;
		this.organizer_name = organizer_name;
		this.timezone = timezone;
		this.id = id;
		this.background_image = background_image;
		this.logo = logo;
		this.social_links = social_links;
		this.topic = topic;
		this.description = description;
		this.organizer_description = organizer_description;
		this.type = type;

	}

}