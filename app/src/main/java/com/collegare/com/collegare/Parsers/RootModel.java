import java.util.ArrayList;

class RootModel {

	public String email;
	public String end_time;
	public CopyrightModel _copyright;
	public VersionModel _version;
	public String state;
	public String timezone;
	public String start_time;
	public int id;
	public String location_name;
	public String type;
	public String organizer_name;
	public String organizer_description;
	public String schedule_published_on;
	public Call_for_papersModel _call_for_papers;
	public String name;
	public String background_image;
	public String logo;
	public String topic;
	public String privacy;
	public ArrayList<Social_linksModel> social_links;
	public String code_of_conduct;
	public String description;
	public CreatorModel _creator;

	public RootModel(String email, String end_time, CopyrightModel copyright, VersionModel version, String state, String timezone, String start_time, int id, String location_name, String type, String organizer_name, String organizer_description, String schedule_published_on, Call_for_papersModel call_for_papers, String name, String background_image, String logo, String topic, String privacy, ArrayList<Social_linksModel> social_links, String code_of_conduct, String description, CreatorModel creator) {

		this.email = email;
		this.end_time = end_time;
		this._copyright = copyright;
		this._version = version;
		this.state = state;
		this.timezone = timezone;
		this.start_time = start_time;
		this.id = id;
		this.location_name = location_name;
		this.type = type;
		this.organizer_name = organizer_name;
		this.organizer_description = organizer_description;
		this.schedule_published_on = schedule_published_on;
		this._call_for_papers = call_for_papers;
		this.name = name;
		this.background_image = background_image;
		this.logo = logo;
		this.topic = topic;
		this.privacy = privacy;
		this.social_links = social_links;
		this.code_of_conduct = code_of_conduct;
		this.description = description;
		this._creator = creator;

	}

}