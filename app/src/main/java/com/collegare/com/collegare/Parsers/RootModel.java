import java.util.ArrayList;

class RootModel {

	public String schedule_published_on;
	public String timezone;
	public String state;
	public CreatorModel _creator;
	public String privacy;
	public String email;
	public Call_for_papersModel _call_for_papers;
	public String logo;
	public String background_image;
	public String end_time;
	public String organizer_description;
	public String code_of_conduct;
	public String location_name;
	public int id;
	public String topic;
	public String start_time;
	public String name;
	public String organizer_name;
	public CopyrightModel _copyright;
	public String type;
	public String description;
	public VersionModel _version;
	public ArrayList<Social_linksModel> social_links;

	public RootModel(String schedule_published_on, String timezone, String state, CreatorModel creator, String privacy, String email, Call_for_papersModel call_for_papers, String logo, String background_image, String end_time, String organizer_description, String code_of_conduct, String location_name, int id, String topic, String start_time, String name, String organizer_name, CopyrightModel copyright, String type, String description, VersionModel version, ArrayList<Social_linksModel> social_links) {

		this.schedule_published_on = schedule_published_on;
		this.timezone = timezone;
		this.state = state;
		this._creator = creator;
		this.privacy = privacy;
		this.email = email;
		this._call_for_papers = call_for_papers;
		this.logo = logo;
		this.background_image = background_image;
		this.end_time = end_time;
		this.organizer_description = organizer_description;
		this.code_of_conduct = code_of_conduct;
		this.location_name = location_name;
		this.id = id;
		this.topic = topic;
		this.start_time = start_time;
		this.name = name;
		this.organizer_name = organizer_name;
		this._copyright = copyright;
		this.type = type;
		this.description = description;
		this._version = version;
		this.social_links = social_links;

	}

}