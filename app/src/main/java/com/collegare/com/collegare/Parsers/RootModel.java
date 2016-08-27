import java.util.ArrayList;

class RootModel {

	public CreatorModel _creator;
	public String topic;
	public String description;
	public String email;
	public String end_time;
	public String timezone;
	public String name;
	public ArrayList<Social_linksModel> social_links;
	public String logo;
	public String type;
	public String background_image;
	public CopyrightModel _copyright;
	public String schedule_published_on;
	public String code_of_conduct;
	public Call_for_papersModel _call_for_papers;
	public String privacy;
	public VersionModel _version;
	public String organizer_description;
	public String organizer_name;
	public String location_name;
	public String start_time;
	public String state;
	public int id;

	public RootModel(CreatorModel creator, String topic, String description, String email, String end_time, String timezone, String name, ArrayList<Social_linksModel> social_links, String logo, String type, String background_image, CopyrightModel copyright, String schedule_published_on, String code_of_conduct, Call_for_papersModel call_for_papers, String privacy, VersionModel version, String organizer_description, String organizer_name, String location_name, String start_time, String state, int id) {

		this._creator = creator;
		this.topic = topic;
		this.description = description;
		this.email = email;
		this.end_time = end_time;
		this.timezone = timezone;
		this.name = name;
		this.social_links = social_links;
		this.logo = logo;
		this.type = type;
		this.background_image = background_image;
		this._copyright = copyright;
		this.schedule_published_on = schedule_published_on;
		this.code_of_conduct = code_of_conduct;
		this._call_for_papers = call_for_papers;
		this.privacy = privacy;
		this._version = version;
		this.organizer_description = organizer_description;
		this.organizer_name = organizer_name;
		this.location_name = location_name;
		this.start_time = start_time;
		this.state = state;
		this.id = id;

	}

}