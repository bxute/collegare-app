import java.util.ArrayList;

class RootModel {

	public VersionModel _version;
	public ArrayList<Social_linksModel> social_links;
	public String start_time;
	public String schedule_published_on;
	public CreatorModel _creator;
	public String topic;
	public String description;
	public String code_of_conduct;
	public String privacy;
	public String name;
	public String logo;
	public String location_name;
	public String email;
	public String organizer_description;
	public Call_for_papersModel _call_for_papers;
	public CopyrightModel _copyright;
	public String organizer_name;
	public String timezone;
	public String state;
	public String background_image;
	public int id;
	public String type;
	public String end_time;

	public RootModel(VersionModel version, ArrayList<Social_linksModel> social_links, String start_time, String schedule_published_on, CreatorModel creator, String topic, String description, String code_of_conduct, String privacy, String name, String logo, String location_name, String email, String organizer_description, Call_for_papersModel call_for_papers, CopyrightModel copyright, String organizer_name, String timezone, String state, String background_image, int id, String type, String end_time) {

		this._version = version;
		this.social_links = social_links;
		this.start_time = start_time;
		this.schedule_published_on = schedule_published_on;
		this._creator = creator;
		this.topic = topic;
		this.description = description;
		this.code_of_conduct = code_of_conduct;
		this.privacy = privacy;
		this.name = name;
		this.logo = logo;
		this.location_name = location_name;
		this.email = email;
		this.organizer_description = organizer_description;
		this._call_for_papers = call_for_papers;
		this._copyright = copyright;
		this.organizer_name = organizer_name;
		this.timezone = timezone;
		this.state = state;
		this.background_image = background_image;
		this.id = id;
		this.type = type;
		this.end_time = end_time;

	}

}