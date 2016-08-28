import java.util.ArrayList;

class RootModel {

	public CreatorModel _creator;
	public String background_image;
	public String topic;
	public String name;
	public String type;
	public Call_for_papersModel _call_for_papers;
	public String code_of_conduct;
	public String email;
	public String timezone;
	public String state;
	public int id;
	public CopyrightModel _copyright;
	public String privacy;
	public String start_time;
	public String schedule_published_on;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_description;
	public String description;
	public String logo;
	public String location_name;
	public String organizer_name;
	public String end_time;
	public VersionModel _version;

	public RootModel(CreatorModel creator, String background_image, String topic, String name, String type, Call_for_papersModel call_for_papers, String code_of_conduct, String email, String timezone, String state, int id, CopyrightModel copyright, String privacy, String start_time, String schedule_published_on, ArrayList<Social_linksModel> social_links, String organizer_description, String description, String logo, String location_name, String organizer_name, String end_time, VersionModel version) {

		this._creator = creator;
		this.background_image = background_image;
		this.topic = topic;
		this.name = name;
		this.type = type;
		this._call_for_papers = call_for_papers;
		this.code_of_conduct = code_of_conduct;
		this.email = email;
		this.timezone = timezone;
		this.state = state;
		this.id = id;
		this._copyright = copyright;
		this.privacy = privacy;
		this.start_time = start_time;
		this.schedule_published_on = schedule_published_on;
		this.social_links = social_links;
		this.organizer_description = organizer_description;
		this.description = description;
		this.logo = logo;
		this.location_name = location_name;
		this.organizer_name = organizer_name;
		this.end_time = end_time;
		this._version = version;

	}

}