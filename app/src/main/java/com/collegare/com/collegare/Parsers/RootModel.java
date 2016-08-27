import java.util.ArrayList;

class RootModel {

	public String end_time;
	public String name;
	public String organizer_name;
	public VersionModel _version;
	public String privacy;
	public String code_of_conduct;
	public String start_time;
	public String topic;
	public CreatorModel _creator;
	public Call_for_papersModel _call_for_papers;
	public String state;
	public String organizer_description;
	public String timezone;
	public String email;
	public String background_image;
	public String description;
	public CopyrightModel _copyright;
	public ArrayList<Social_linksModel> social_links;
	public String location_name;
	public String type;
	public String logo;
	public int id;
	public String schedule_published_on;

	public RootModel(String end_time, String name, String organizer_name, VersionModel version, String privacy, String code_of_conduct, String start_time, String topic, CreatorModel creator, Call_for_papersModel call_for_papers, String state, String organizer_description, String timezone, String email, String background_image, String description, CopyrightModel copyright, ArrayList<Social_linksModel> social_links, String location_name, String type, String logo, int id, String schedule_published_on) {

		this.end_time = end_time;
		this.name = name;
		this.organizer_name = organizer_name;
		this._version = version;
		this.privacy = privacy;
		this.code_of_conduct = code_of_conduct;
		this.start_time = start_time;
		this.topic = topic;
		this._creator = creator;
		this._call_for_papers = call_for_papers;
		this.state = state;
		this.organizer_description = organizer_description;
		this.timezone = timezone;
		this.email = email;
		this.background_image = background_image;
		this.description = description;
		this._copyright = copyright;
		this.social_links = social_links;
		this.location_name = location_name;
		this.type = type;
		this.logo = logo;
		this.id = id;
		this.schedule_published_on = schedule_published_on;

	}

}