import java.util.ArrayList;

class RootModel {

	public String email;
	public String end_time;
	public String code_of_conduct;
	public String organizer_description;
	public int id;
	public String name;
	public String type;
	public String background_image;
	public String start_time;
	public String description;
	public String organizer_name;
	public String timezone;
	public String privacy;
	public String schedule_published_on;
	public String logo;
	public VersionModel _version;
	public Call_for_papersModel _call_for_papers;
	public String topic;
	public String state;
	public ArrayList<Social_linksModel> social_links;
	public CopyrightModel _copyright;
	public String location_name;
	public CreatorModel _creator;

	public RootModel(String email, String end_time, String code_of_conduct, String organizer_description, int id, String name, String type, String background_image, String start_time, String description, String organizer_name, String timezone, String privacy, String schedule_published_on, String logo, VersionModel version, Call_for_papersModel call_for_papers, String topic, String state, ArrayList<Social_linksModel> social_links, CopyrightModel copyright, String location_name, CreatorModel creator) {

		this.email = email;
		this.end_time = end_time;
		this.code_of_conduct = code_of_conduct;
		this.organizer_description = organizer_description;
		this.id = id;
		this.name = name;
		this.type = type;
		this.background_image = background_image;
		this.start_time = start_time;
		this.description = description;
		this.organizer_name = organizer_name;
		this.timezone = timezone;
		this.privacy = privacy;
		this.schedule_published_on = schedule_published_on;
		this.logo = logo;
		this._version = version;
		this._call_for_papers = call_for_papers;
		this.topic = topic;
		this.state = state;
		this.social_links = social_links;
		this._copyright = copyright;
		this.location_name = location_name;
		this._creator = creator;

	}

}