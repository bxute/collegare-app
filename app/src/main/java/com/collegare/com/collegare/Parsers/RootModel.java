import java.util.ArrayList;

class RootModel {

	public CopyrightModel _copyright;
	public String description;
	public String type;
	public String topic;
	public String email;
	public String background_image;
	public Call_for_papersModel _call_for_papers;
	public String timezone;
	public String state;
	public int id;
	public String organizer_description;
	public CreatorModel _creator;
	public String logo;
	public String name;
	public String code_of_conduct;
	public String organizer_name;
	public String location_name;
	public String schedule_published_on;
	public String end_time;
	public String privacy;
	public String start_time;
	public VersionModel _version;
	public ArrayList<Social_linksModel> social_links;

	public RootModel(CopyrightModel copyright, String description, String type, String topic, String email, String background_image, Call_for_papersModel call_for_papers, String timezone, String state, int id, String organizer_description, CreatorModel creator, String logo, String name, String code_of_conduct, String organizer_name, String location_name, String schedule_published_on, String end_time, String privacy, String start_time, VersionModel version, ArrayList<Social_linksModel> social_links) {

		this._copyright = copyright;
		this.description = description;
		this.type = type;
		this.topic = topic;
		this.email = email;
		this.background_image = background_image;
		this._call_for_papers = call_for_papers;
		this.timezone = timezone;
		this.state = state;
		this.id = id;
		this.organizer_description = organizer_description;
		this._creator = creator;
		this.logo = logo;
		this.name = name;
		this.code_of_conduct = code_of_conduct;
		this.organizer_name = organizer_name;
		this.location_name = location_name;
		this.schedule_published_on = schedule_published_on;
		this.end_time = end_time;
		this.privacy = privacy;
		this.start_time = start_time;
		this._version = version;
		this.social_links = social_links;

	}

}