import java.util.ArrayList;

class RootModel {

	public String organizer_name;
	public String code_of_conduct;
	public String logo;
	public String organizer_description;
	public String name;
	public String end_time;
	public String start_time;
	public String type;
	public ArrayList<Social_linksModel> social_links;
	public CreatorModel _creator;
	public Call_for_papersModel _call_for_papers;
	public String background_image;
	public int id;
	public String timezone;
	public String email;
	public CopyrightModel _copyright;
	public String privacy;
	public String description;
	public String state;
	public String topic;
	public String location_name;
	public VersionModel _version;
	public String schedule_published_on;

	public RootModel(String organizer_name, String code_of_conduct, String logo, String organizer_description, String name, String end_time, String start_time, String type, ArrayList<Social_linksModel> social_links, CreatorModel creator, Call_for_papersModel call_for_papers, String background_image, int id, String timezone, String email, CopyrightModel copyright, String privacy, String description, String state, String topic, String location_name, VersionModel version, String schedule_published_on) {

		this.organizer_name = organizer_name;
		this.code_of_conduct = code_of_conduct;
		this.logo = logo;
		this.organizer_description = organizer_description;
		this.name = name;
		this.end_time = end_time;
		this.start_time = start_time;
		this.type = type;
		this.social_links = social_links;
		this._creator = creator;
		this._call_for_papers = call_for_papers;
		this.background_image = background_image;
		this.id = id;
		this.timezone = timezone;
		this.email = email;
		this._copyright = copyright;
		this.privacy = privacy;
		this.description = description;
		this.state = state;
		this.topic = topic;
		this.location_name = location_name;
		this._version = version;
		this.schedule_published_on = schedule_published_on;

	}

}