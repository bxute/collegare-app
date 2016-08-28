import java.util.ArrayList;

class RootModel {

	public CreatorModel _creator;
	public VersionModel _version;
	public String start_time;
	public ArrayList<Social_linksModel> social_links;
	public String end_time;
	public String organizer_name;
	public int id;
	public String type;
	public String description;
	public String name;
	public String organizer_description;
	public String schedule_published_on;
	public CopyrightModel _copyright;
	public String email;
	public String privacy;
	public String code_of_conduct;
	public String state;
	public String timezone;
	public String logo;
	public Call_for_papersModel _call_for_papers;
	public String background_image;
	public String location_name;
	public String topic;

	public RootModel(CreatorModel creator, VersionModel version, String start_time, ArrayList<Social_linksModel> social_links, String end_time, String organizer_name, int id, String type, String description, String name, String organizer_description, String schedule_published_on, CopyrightModel copyright, String email, String privacy, String code_of_conduct, String state, String timezone, String logo, Call_for_papersModel call_for_papers, String background_image, String location_name, String topic) {

		this._creator = creator;
		this._version = version;
		this.start_time = start_time;
		this.social_links = social_links;
		this.end_time = end_time;
		this.organizer_name = organizer_name;
		this.id = id;
		this.type = type;
		this.description = description;
		this.name = name;
		this.organizer_description = organizer_description;
		this.schedule_published_on = schedule_published_on;
		this._copyright = copyright;
		this.email = email;
		this.privacy = privacy;
		this.code_of_conduct = code_of_conduct;
		this.state = state;
		this.timezone = timezone;
		this.logo = logo;
		this._call_for_papers = call_for_papers;
		this.background_image = background_image;
		this.location_name = location_name;
		this.topic = topic;

	}

}