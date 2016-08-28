import java.util.ArrayList;

class RootModel {

	public String code_of_conduct;
	public String start_time;
	public VersionModel _version;
	public String description;
	public String organizer_description;
	public String logo;
	public String email;
	public String type;
	public CreatorModel _creator;
	public CopyrightModel _copyright;
	public int id;
	public String privacy;
	public String end_time;
	public String organizer_name;
	public String timezone;
	public String topic;
	public Call_for_papersModel _call_for_papers;
	public String background_image;
	public String state;
	public ArrayList<Social_linksModel> social_links;
	public String name;
	public String location_name;
	public String schedule_published_on;

	public RootModel(String code_of_conduct, String start_time, VersionModel version, String description, String organizer_description, String logo, String email, String type, CreatorModel creator, CopyrightModel copyright, int id, String privacy, String end_time, String organizer_name, String timezone, String topic, Call_for_papersModel call_for_papers, String background_image, String state, ArrayList<Social_linksModel> social_links, String name, String location_name, String schedule_published_on) {

		this.code_of_conduct = code_of_conduct;
		this.start_time = start_time;
		this._version = version;
		this.description = description;
		this.organizer_description = organizer_description;
		this.logo = logo;
		this.email = email;
		this.type = type;
		this._creator = creator;
		this._copyright = copyright;
		this.id = id;
		this.privacy = privacy;
		this.end_time = end_time;
		this.organizer_name = organizer_name;
		this.timezone = timezone;
		this.topic = topic;
		this._call_for_papers = call_for_papers;
		this.background_image = background_image;
		this.state = state;
		this.social_links = social_links;
		this.name = name;
		this.location_name = location_name;
		this.schedule_published_on = schedule_published_on;

	}

}