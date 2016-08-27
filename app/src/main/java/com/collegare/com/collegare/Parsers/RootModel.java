import java.util.ArrayList;

class RootModel {

	public String organizer_name;
	public String organizer_description;
	public Call_for_papersModel _call_for_papers;
	public int id;
	public String logo;
	public String start_time;
	public String email;
	public CreatorModel _creator;
	public String location_name;
	public String state;
	public String background_image;
	public String name;
	public String type;
	public ArrayList<Social_linksModel> social_links;
	public CopyrightModel _copyright;
	public String code_of_conduct;
	public String timezone;
	public String description;
	public VersionModel _version;
	public String privacy;
	public String topic;
	public String end_time;
	public String schedule_published_on;

	public RootModel(String organizer_name, String organizer_description, Call_for_papersModel call_for_papers, int id, String logo, String start_time, String email, CreatorModel creator, String location_name, String state, String background_image, String name, String type, ArrayList<Social_linksModel> social_links, CopyrightModel copyright, String code_of_conduct, String timezone, String description, VersionModel version, String privacy, String topic, String end_time, String schedule_published_on) {

		this.organizer_name = organizer_name;
		this.organizer_description = organizer_description;
		this._call_for_papers = call_for_papers;
		this.id = id;
		this.logo = logo;
		this.start_time = start_time;
		this.email = email;
		this._creator = creator;
		this.location_name = location_name;
		this.state = state;
		this.background_image = background_image;
		this.name = name;
		this.type = type;
		this.social_links = social_links;
		this._copyright = copyright;
		this.code_of_conduct = code_of_conduct;
		this.timezone = timezone;
		this.description = description;
		this._version = version;
		this.privacy = privacy;
		this.topic = topic;
		this.end_time = end_time;
		this.schedule_published_on = schedule_published_on;

	}

}