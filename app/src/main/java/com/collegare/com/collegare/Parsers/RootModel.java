import java.util.ArrayList;

class RootModel {

	public String start_time;
	public String privacy;
	public String schedule_published_on;
	public CreatorModel _creator;
	public VersionModel _version;
	public String background_image;
	public String logo;
	public Call_for_papersModel _call_for_papers;
	public String timezone;
	public String end_time;
	public String topic;
	public String location_name;
	public String organizer_name;
	public int id;
	public String state;
	public String name;
	public String code_of_conduct;
	public String type;
	public String email;
	public CopyrightModel _copyright;
	public String organizer_description;
	public String description;
	public ArrayList<Social_linksModel> social_links;

	public RootModel(String start_time, String privacy, String schedule_published_on, CreatorModel creator, VersionModel version, String background_image, String logo, Call_for_papersModel call_for_papers, String timezone, String end_time, String topic, String location_name, String organizer_name, int id, String state, String name, String code_of_conduct, String type, String email, CopyrightModel copyright, String organizer_description, String description, ArrayList<Social_linksModel> social_links) {

		this.start_time = start_time;
		this.privacy = privacy;
		this.schedule_published_on = schedule_published_on;
		this._creator = creator;
		this._version = version;
		this.background_image = background_image;
		this.logo = logo;
		this._call_for_papers = call_for_papers;
		this.timezone = timezone;
		this.end_time = end_time;
		this.topic = topic;
		this.location_name = location_name;
		this.organizer_name = organizer_name;
		this.id = id;
		this.state = state;
		this.name = name;
		this.code_of_conduct = code_of_conduct;
		this.type = type;
		this.email = email;
		this._copyright = copyright;
		this.organizer_description = organizer_description;
		this.description = description;
		this.social_links = social_links;

	}

}