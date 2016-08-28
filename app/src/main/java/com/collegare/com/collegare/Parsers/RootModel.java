import java.util.ArrayList;

class RootModel {

	public CopyrightModel _copyright;
	public String start_time;
	public String email;
	public String organizer_name;
	public int id;
	public String timezone;
	public String privacy;
	public String organizer_description;
	public String end_time;
	public String schedule_published_on;
	public Call_for_papersModel _call_for_papers;
	public ArrayList<Social_linksModel> social_links;
	public String topic;
	public String type;
	public VersionModel _version;
	public String location_name;
	public String state;
	public String logo;
	public String background_image;
	public String code_of_conduct;
	public String description;
	public String name;
	public CreatorModel _creator;

	public RootModel(CopyrightModel copyright, String start_time, String email, String organizer_name, int id, String timezone, String privacy, String organizer_description, String end_time, String schedule_published_on, Call_for_papersModel call_for_papers, ArrayList<Social_linksModel> social_links, String topic, String type, VersionModel version, String location_name, String state, String logo, String background_image, String code_of_conduct, String description, String name, CreatorModel creator) {

		this._copyright = copyright;
		this.start_time = start_time;
		this.email = email;
		this.organizer_name = organizer_name;
		this.id = id;
		this.timezone = timezone;
		this.privacy = privacy;
		this.organizer_description = organizer_description;
		this.end_time = end_time;
		this.schedule_published_on = schedule_published_on;
		this._call_for_papers = call_for_papers;
		this.social_links = social_links;
		this.topic = topic;
		this.type = type;
		this._version = version;
		this.location_name = location_name;
		this.state = state;
		this.logo = logo;
		this.background_image = background_image;
		this.code_of_conduct = code_of_conduct;
		this.description = description;
		this.name = name;
		this._creator = creator;

	}

}