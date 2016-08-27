import java.util.ArrayList;

class RootModel {

	public VersionModel _version;
	public int id;
	public String logo;
	public Call_for_papersModel _call_for_papers;
	public String type;
	public String location_name;
	public String background_image;
	public String name;
	public String end_time;
	public String topic;
	public String state;
	public CopyrightModel _copyright;
	public String timezone;
	public String privacy;
	public String start_time;
	public String schedule_published_on;
	public String description;
	public String organizer_description;
	public ArrayList<Social_linksModel> social_links;
	public String code_of_conduct;
	public CreatorModel _creator;
	public String organizer_name;
	public String email;

	public RootModel(VersionModel version, int id, String logo, Call_for_papersModel call_for_papers, String type, String location_name, String background_image, String name, String end_time, String topic, String state, CopyrightModel copyright, String timezone, String privacy, String start_time, String schedule_published_on, String description, String organizer_description, ArrayList<Social_linksModel> social_links, String code_of_conduct, CreatorModel creator, String organizer_name, String email) {

		this._version = version;
		this.id = id;
		this.logo = logo;
		this._call_for_papers = call_for_papers;
		this.type = type;
		this.location_name = location_name;
		this.background_image = background_image;
		this.name = name;
		this.end_time = end_time;
		this.topic = topic;
		this.state = state;
		this._copyright = copyright;
		this.timezone = timezone;
		this.privacy = privacy;
		this.start_time = start_time;
		this.schedule_published_on = schedule_published_on;
		this.description = description;
		this.organizer_description = organizer_description;
		this.social_links = social_links;
		this.code_of_conduct = code_of_conduct;
		this._creator = creator;
		this.organizer_name = organizer_name;
		this.email = email;

	}

}