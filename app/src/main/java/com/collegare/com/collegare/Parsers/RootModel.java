import java.util.ArrayList;

class RootModel {

	public ArrayList<Social_linksModel> social_links;
	public String type;
	public String name;
	public CreatorModel _creator;
	public String location_name;
	public String schedule_published_on;
	public int id;
	public Call_for_papersModel _call_for_papers;
	public String organizer_description;
	public String end_time;
	public String organizer_name;
	public String timezone;
	public String background_image;
	public CopyrightModel _copyright;
	public String state;
	public String description;
	public String privacy;
	public String code_of_conduct;
	public String start_time;
	public String topic;
	public String email;
	public String logo;
	public VersionModel _version;

	public RootModel(ArrayList<Social_linksModel> social_links, String type, String name, CreatorModel creator, String location_name, String schedule_published_on, int id, Call_for_papersModel call_for_papers, String organizer_description, String end_time, String organizer_name, String timezone, String background_image, CopyrightModel copyright, String state, String description, String privacy, String code_of_conduct, String start_time, String topic, String email, String logo, VersionModel version) {

		this.social_links = social_links;
		this.type = type;
		this.name = name;
		this._creator = creator;
		this.location_name = location_name;
		this.schedule_published_on = schedule_published_on;
		this.id = id;
		this._call_for_papers = call_for_papers;
		this.organizer_description = organizer_description;
		this.end_time = end_time;
		this.organizer_name = organizer_name;
		this.timezone = timezone;
		this.background_image = background_image;
		this._copyright = copyright;
		this.state = state;
		this.description = description;
		this.privacy = privacy;
		this.code_of_conduct = code_of_conduct;
		this.start_time = start_time;
		this.topic = topic;
		this.email = email;
		this.logo = logo;
		this._version = version;

	}

}