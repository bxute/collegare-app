import java.util.ArrayList;

class RootModel {

	public String code_of_conduct;
	public CreatorModel _creator;
	public Call_for_papersModel _call_for_papers;
	public String background_image;
	public String location_name;
	public String logo;
	public String description;
	public String end_time;
	public String topic;
	public String state;
	public String privacy;
	public String organizer_description;
	public int id;
	public VersionModel _version;
	public String type;
	public String start_time;
	public ArrayList<Social_linksModel> social_links;
	public CopyrightModel _copyright;
	public String timezone;
	public String name;
	public String organizer_name;
	public String email;
	public String schedule_published_on;

	public RootModel(String code_of_conduct, CreatorModel creator, Call_for_papersModel call_for_papers, String background_image, String location_name, String logo, String description, String end_time, String topic, String state, String privacy, String organizer_description, int id, VersionModel version, String type, String start_time, ArrayList<Social_linksModel> social_links, CopyrightModel copyright, String timezone, String name, String organizer_name, String email, String schedule_published_on) {

		this.code_of_conduct = code_of_conduct;
		this._creator = creator;
		this._call_for_papers = call_for_papers;
		this.background_image = background_image;
		this.location_name = location_name;
		this.logo = logo;
		this.description = description;
		this.end_time = end_time;
		this.topic = topic;
		this.state = state;
		this.privacy = privacy;
		this.organizer_description = organizer_description;
		this.id = id;
		this._version = version;
		this.type = type;
		this.start_time = start_time;
		this.social_links = social_links;
		this._copyright = copyright;
		this.timezone = timezone;
		this.name = name;
		this.organizer_name = organizer_name;
		this.email = email;
		this.schedule_published_on = schedule_published_on;

	}

}