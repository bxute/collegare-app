import java.util.ArrayList;

class RootModel {

	public String timezone;
	public String organizer_description;
	public CreatorModel _creator;
	public String organizer_name;
	public String logo;
	public String end_time;
	public String schedule_published_on;
	public VersionModel _version;
	public int id;
	public String state;
	public String start_time;
	public String code_of_conduct;
	public String topic;
	public String privacy;
	public String background_image;
	public String location_name;
	public CopyrightModel _copyright;
	public String name;
	public String description;
	public Call_for_papersModel _call_for_papers;
	public String type;
	public String email;
	public ArrayList<Social_linksModel> social_links;

	public RootModel(String timezone, String organizer_description, CreatorModel creator, String organizer_name, String logo, String end_time, String schedule_published_on, VersionModel version, int id, String state, String start_time, String code_of_conduct, String topic, String privacy, String background_image, String location_name, CopyrightModel copyright, String name, String description, Call_for_papersModel call_for_papers, String type, String email, ArrayList<Social_linksModel> social_links) {

		this.timezone = timezone;
		this.organizer_description = organizer_description;
		this._creator = creator;
		this.organizer_name = organizer_name;
		this.logo = logo;
		this.end_time = end_time;
		this.schedule_published_on = schedule_published_on;
		this._version = version;
		this.id = id;
		this.state = state;
		this.start_time = start_time;
		this.code_of_conduct = code_of_conduct;
		this.topic = topic;
		this.privacy = privacy;
		this.background_image = background_image;
		this.location_name = location_name;
		this._copyright = copyright;
		this.name = name;
		this.description = description;
		this._call_for_papers = call_for_papers;
		this.type = type;
		this.email = email;
		this.social_links = social_links;

	}

}