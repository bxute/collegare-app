import java.util.ArrayList;

class RootModel {

	public VersionModel _version;
	public CreatorModel _creator;
	public String code_of_conduct;
	public int id;
	public Call_for_papersModel _call_for_papers;
	public String start_time;
	public String description;
	public String end_time;
	public String schedule_published_on;
	public String logo;
	public String location_name;
	public String type;
	public String organizer_description;
	public String state;
	public String name;
	public String topic;
	public String privacy;
	public String timezone;
	public String background_image;
	public CopyrightModel _copyright;
	public String organizer_name;
	public ArrayList<Social_linksModel> social_links;
	public String email;

	public RootModel(VersionModel version, CreatorModel creator, String code_of_conduct, int id, Call_for_papersModel call_for_papers, String start_time, String description, String end_time, String schedule_published_on, String logo, String location_name, String type, String organizer_description, String state, String name, String topic, String privacy, String timezone, String background_image, CopyrightModel copyright, String organizer_name, ArrayList<Social_linksModel> social_links, String email) {

		this._version = version;
		this._creator = creator;
		this.code_of_conduct = code_of_conduct;
		this.id = id;
		this._call_for_papers = call_for_papers;
		this.start_time = start_time;
		this.description = description;
		this.end_time = end_time;
		this.schedule_published_on = schedule_published_on;
		this.logo = logo;
		this.location_name = location_name;
		this.type = type;
		this.organizer_description = organizer_description;
		this.state = state;
		this.name = name;
		this.topic = topic;
		this.privacy = privacy;
		this.timezone = timezone;
		this.background_image = background_image;
		this._copyright = copyright;
		this.organizer_name = organizer_name;
		this.social_links = social_links;
		this.email = email;

	}

}