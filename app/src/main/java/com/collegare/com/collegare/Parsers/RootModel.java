import java.util.ArrayList;

class RootModel {

	public String code_of_conduct;
	public CopyrightModel _copyright;
	public Call_for_papersModel _call_for_papers;
	public CreatorModel _creator;
	public String timezone;
	public String organizer_description;
	public int id;
	public String state;
	public String privacy;
	public String logo;
	public String start_time;
	public String email;
	public String topic;
	public String organizer_name;
	public String end_time;
	public String location_name;
	public String type;
	public String name;
	public ArrayList<Social_linksModel> social_links;
	public VersionModel _version;
	public String background_image;
	public String description;
	public String schedule_published_on;

	public RootModel(String code_of_conduct, CopyrightModel copyright, Call_for_papersModel call_for_papers, CreatorModel creator, String timezone, String organizer_description, int id, String state, String privacy, String logo, String start_time, String email, String topic, String organizer_name, String end_time, String location_name, String type, String name, ArrayList<Social_linksModel> social_links, VersionModel version, String background_image, String description, String schedule_published_on) {

		this.code_of_conduct = code_of_conduct;
		this._copyright = copyright;
		this._call_for_papers = call_for_papers;
		this._creator = creator;
		this.timezone = timezone;
		this.organizer_description = organizer_description;
		this.id = id;
		this.state = state;
		this.privacy = privacy;
		this.logo = logo;
		this.start_time = start_time;
		this.email = email;
		this.topic = topic;
		this.organizer_name = organizer_name;
		this.end_time = end_time;
		this.location_name = location_name;
		this.type = type;
		this.name = name;
		this.social_links = social_links;
		this._version = version;
		this.background_image = background_image;
		this.description = description;
		this.schedule_published_on = schedule_published_on;

	}

}