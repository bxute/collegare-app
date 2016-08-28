import java.util.ArrayList;

class RootModel {

	public String topic;
	public String type;
	public String state;
	public String background_image;
	public CopyrightModel _copyright;
	public VersionModel _version;
	public String organizer_name;
	public String start_time;
	public String description;
	public String location_name;
	public String organizer_description;
	public String code_of_conduct;
	public String schedule_published_on;
	public Call_for_papersModel _call_for_papers;
	public String end_time;
	public ArrayList<Social_linksModel> social_links;
	public String name;
	public CreatorModel _creator;
	public String email;
	public int id;
	public String logo;
	public String timezone;
	public String privacy;

	public RootModel(String topic, String type, String state, String background_image, CopyrightModel copyright, VersionModel version, String organizer_name, String start_time, String description, String location_name, String organizer_description, String code_of_conduct, String schedule_published_on, Call_for_papersModel call_for_papers, String end_time, ArrayList<Social_linksModel> social_links, String name, CreatorModel creator, String email, int id, String logo, String timezone, String privacy) {

		this.topic = topic;
		this.type = type;
		this.state = state;
		this.background_image = background_image;
		this._copyright = copyright;
		this._version = version;
		this.organizer_name = organizer_name;
		this.start_time = start_time;
		this.description = description;
		this.location_name = location_name;
		this.organizer_description = organizer_description;
		this.code_of_conduct = code_of_conduct;
		this.schedule_published_on = schedule_published_on;
		this._call_for_papers = call_for_papers;
		this.end_time = end_time;
		this.social_links = social_links;
		this.name = name;
		this._creator = creator;
		this.email = email;
		this.id = id;
		this.logo = logo;
		this.timezone = timezone;
		this.privacy = privacy;

	}

}