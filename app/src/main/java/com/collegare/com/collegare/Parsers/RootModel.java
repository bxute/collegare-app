import java.util.ArrayList;

class RootModel {

	public String state;
	public String description;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_name;
	public String email;
	public String logo;
	public String location_name;
	public String start_time;
	public String name;
	public CreatorModel _creator;
	public CopyrightModel _copyright;
	public int id;
	public Call_for_papersModel _call_for_papers;
	public String timezone;
	public String topic;
	public String code_of_conduct;
	public String background_image;
	public String type;
	public String privacy;
	public String organizer_description;
	public VersionModel _version;
	public String end_time;
	public String schedule_published_on;

	public RootModel(String state, String description, ArrayList<Social_linksModel> social_links, String organizer_name, String email, String logo, String location_name, String start_time, String name, CreatorModel creator, CopyrightModel copyright, int id, Call_for_papersModel call_for_papers, String timezone, String topic, String code_of_conduct, String background_image, String type, String privacy, String organizer_description, VersionModel version, String end_time, String schedule_published_on) {

		this.state = state;
		this.description = description;
		this.social_links = social_links;
		this.organizer_name = organizer_name;
		this.email = email;
		this.logo = logo;
		this.location_name = location_name;
		this.start_time = start_time;
		this.name = name;
		this._creator = creator;
		this._copyright = copyright;
		this.id = id;
		this._call_for_papers = call_for_papers;
		this.timezone = timezone;
		this.topic = topic;
		this.code_of_conduct = code_of_conduct;
		this.background_image = background_image;
		this.type = type;
		this.privacy = privacy;
		this.organizer_description = organizer_description;
		this._version = version;
		this.end_time = end_time;
		this.schedule_published_on = schedule_published_on;

	}

}