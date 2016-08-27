import java.util.ArrayList;

class RootModel {

	public CreatorModel _creator;
	public String timezone;
	public String name;
	public String location_name;
	public String topic;
	public ArrayList<Social_linksModel> social_links;
	public int id;
	public String description;
	public String start_time;
	public String end_time;
	public String type;
	public String background_image;
	public CopyrightModel _copyright;
	public String organizer_name;
	public VersionModel _version;
	public String logo;
	public String privacy;
	public String email;
	public String organizer_description;
	public String state;
	public String schedule_published_on;
	public Call_for_papersModel _call_for_papers;
	public String code_of_conduct;

	public RootModel(CreatorModel creator, String timezone, String name, String location_name, String topic, ArrayList<Social_linksModel> social_links, int id, String description, String start_time, String end_time, String type, String background_image, CopyrightModel copyright, String organizer_name, VersionModel version, String logo, String privacy, String email, String organizer_description, String state, String schedule_published_on, Call_for_papersModel call_for_papers, String code_of_conduct) {

		this._creator = creator;
		this.timezone = timezone;
		this.name = name;
		this.location_name = location_name;
		this.topic = topic;
		this.social_links = social_links;
		this.id = id;
		this.description = description;
		this.start_time = start_time;
		this.end_time = end_time;
		this.type = type;
		this.background_image = background_image;
		this._copyright = copyright;
		this.organizer_name = organizer_name;
		this._version = version;
		this.logo = logo;
		this.privacy = privacy;
		this.email = email;
		this.organizer_description = organizer_description;
		this.state = state;
		this.schedule_published_on = schedule_published_on;
		this._call_for_papers = call_for_papers;
		this.code_of_conduct = code_of_conduct;

	}

}