import java.util.ArrayList;

class RootModel {

	public String background_image;
	public String description;
	public ArrayList<Social_linksModel> social_links;
	public String logo;
	public String name;
	public String end_time;
	public String code_of_conduct;
	public String organizer_description;
	public String start_time;
	public String schedule_published_on;
	public String state;
	public String topic;
	public int id;
	public String location_name;
	public String organizer_name;
	public CreatorModel _creator;
	public CopyrightModel _copyright;
	public Call_for_papersModel _call_for_papers;
	public String type;
	public String timezone;
	public String email;
	public VersionModel _version;
	public String privacy;

	public RootModel(String background_image, String description, ArrayList<Social_linksModel> social_links, String logo, String name, String end_time, String code_of_conduct, String organizer_description, String start_time, String schedule_published_on, String state, String topic, int id, String location_name, String organizer_name, CreatorModel creator, CopyrightModel copyright, Call_for_papersModel call_for_papers, String type, String timezone, String email, VersionModel version, String privacy) {

		this.background_image = background_image;
		this.description = description;
		this.social_links = social_links;
		this.logo = logo;
		this.name = name;
		this.end_time = end_time;
		this.code_of_conduct = code_of_conduct;
		this.organizer_description = organizer_description;
		this.start_time = start_time;
		this.schedule_published_on = schedule_published_on;
		this.state = state;
		this.topic = topic;
		this.id = id;
		this.location_name = location_name;
		this.organizer_name = organizer_name;
		this._creator = creator;
		this._copyright = copyright;
		this._call_for_papers = call_for_papers;
		this.type = type;
		this.timezone = timezone;
		this.email = email;
		this._version = version;
		this.privacy = privacy;

	}

}