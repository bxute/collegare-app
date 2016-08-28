import java.util.ArrayList;

class RootModel {

	public VersionModel _version;
	public String schedule_published_on;
	public String start_time;
	public String privacy;
	public String organizer_name;
	public String background_image;
	public String type;
	public int id;
	public CopyrightModel _copyright;
	public String end_time;
	public String description;
	public String timezone;
	public String topic;
	public String state;
	public String organizer_description;
	public Call_for_papersModel _call_for_papers;
	public String code_of_conduct;
	public String name;
	public ArrayList<Social_linksModel> social_links;
	public String logo;
	public String location_name;
	public CreatorModel _creator;
	public String email;

	public RootModel(VersionModel version, String schedule_published_on, String start_time, String privacy, String organizer_name, String background_image, String type, int id, CopyrightModel copyright, String end_time, String description, String timezone, String topic, String state, String organizer_description, Call_for_papersModel call_for_papers, String code_of_conduct, String name, ArrayList<Social_linksModel> social_links, String logo, String location_name, CreatorModel creator, String email) {

		this._version = version;
		this.schedule_published_on = schedule_published_on;
		this.start_time = start_time;
		this.privacy = privacy;
		this.organizer_name = organizer_name;
		this.background_image = background_image;
		this.type = type;
		this.id = id;
		this._copyright = copyright;
		this.end_time = end_time;
		this.description = description;
		this.timezone = timezone;
		this.topic = topic;
		this.state = state;
		this.organizer_description = organizer_description;
		this._call_for_papers = call_for_papers;
		this.code_of_conduct = code_of_conduct;
		this.name = name;
		this.social_links = social_links;
		this.logo = logo;
		this.location_name = location_name;
		this._creator = creator;
		this.email = email;

	}

}