import java.util.ArrayList;

class RootModel {

	public CreatorModel _creator;
	public String end_time;
	public String email;
	public String state;
	public String type;
	public String topic;
	public String timezone;
	public String logo;
	public String name;
	public VersionModel _version;
	public int id;
	public String privacy;
	public String organizer_name;
	public ArrayList<Social_linksModel> social_links;
	public String start_time;
	public CopyrightModel _copyright;
	public String organizer_description;
	public String background_image;
	public String schedule_published_on;
	public Call_for_papersModel _call_for_papers;
	public String code_of_conduct;
	public String description;
	public String location_name;

	public RootModel(CreatorModel creator, String end_time, String email, String state, String type, String topic, String timezone, String logo, String name, VersionModel version, int id, String privacy, String organizer_name, ArrayList<Social_linksModel> social_links, String start_time, CopyrightModel copyright, String organizer_description, String background_image, String schedule_published_on, Call_for_papersModel call_for_papers, String code_of_conduct, String description, String location_name) {

		this._creator = creator;
		this.end_time = end_time;
		this.email = email;
		this.state = state;
		this.type = type;
		this.topic = topic;
		this.timezone = timezone;
		this.logo = logo;
		this.name = name;
		this._version = version;
		this.id = id;
		this.privacy = privacy;
		this.organizer_name = organizer_name;
		this.social_links = social_links;
		this.start_time = start_time;
		this._copyright = copyright;
		this.organizer_description = organizer_description;
		this.background_image = background_image;
		this.schedule_published_on = schedule_published_on;
		this._call_for_papers = call_for_papers;
		this.code_of_conduct = code_of_conduct;
		this.description = description;
		this.location_name = location_name;

	}

}