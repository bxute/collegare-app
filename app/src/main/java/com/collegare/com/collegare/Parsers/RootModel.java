import java.util.ArrayList;

class RootModel {

	public String description;
	public String logo;
	public String organizer_description;
	public int id;
	public String email;
	public String organizer_name;
	public String privacy;
	public String state;
	public String code_of_conduct;
	public String end_time;
	public String start_time;
	public String timezone;
	public CopyrightModel _copyright;
	public String name;
	public String topic;
	public String location_name;
	public ArrayList<Social_linksModel> social_links;
	public String background_image;
	public Call_for_papersModel _call_for_papers;
	public String schedule_published_on;
	public String type;
	public VersionModel _version;
	public CreatorModel _creator;

	public RootModel(String description, String logo, String organizer_description, int id, String email, String organizer_name, String privacy, String state, String code_of_conduct, String end_time, String start_time, String timezone, CopyrightModel copyright, String name, String topic, String location_name, ArrayList<Social_linksModel> social_links, String background_image, Call_for_papersModel call_for_papers, String schedule_published_on, String type, VersionModel version, CreatorModel creator) {

		this.description = description;
		this.logo = logo;
		this.organizer_description = organizer_description;
		this.id = id;
		this.email = email;
		this.organizer_name = organizer_name;
		this.privacy = privacy;
		this.state = state;
		this.code_of_conduct = code_of_conduct;
		this.end_time = end_time;
		this.start_time = start_time;
		this.timezone = timezone;
		this._copyright = copyright;
		this.name = name;
		this.topic = topic;
		this.location_name = location_name;
		this.social_links = social_links;
		this.background_image = background_image;
		this._call_for_papers = call_for_papers;
		this.schedule_published_on = schedule_published_on;
		this.type = type;
		this._version = version;
		this._creator = creator;

	}

}