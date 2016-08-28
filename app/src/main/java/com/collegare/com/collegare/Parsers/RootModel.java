import java.util.ArrayList;

class RootModel {

	public CreatorModel _creator;
	public String organizer_name;
	public CopyrightModel _copyright;
	public String privacy;
	public String organizer_description;
	public String name;
	public String background_image;
	public String type;
	public Call_for_papersModel _call_for_papers;
	public String start_time;
	public String timezone;
	public int id;
	public String location_name;
	public String code_of_conduct;
	public String state;
	public ArrayList<Social_linksModel> social_links;
	public String logo;
	public String topic;
	public String schedule_published_on;
	public String description;
	public VersionModel _version;
	public String end_time;
	public String email;

	public RootModel(CreatorModel creator, String organizer_name, CopyrightModel copyright, String privacy, String organizer_description, String name, String background_image, String type, Call_for_papersModel call_for_papers, String start_time, String timezone, int id, String location_name, String code_of_conduct, String state, ArrayList<Social_linksModel> social_links, String logo, String topic, String schedule_published_on, String description, VersionModel version, String end_time, String email) {

		this._creator = creator;
		this.organizer_name = organizer_name;
		this._copyright = copyright;
		this.privacy = privacy;
		this.organizer_description = organizer_description;
		this.name = name;
		this.background_image = background_image;
		this.type = type;
		this._call_for_papers = call_for_papers;
		this.start_time = start_time;
		this.timezone = timezone;
		this.id = id;
		this.location_name = location_name;
		this.code_of_conduct = code_of_conduct;
		this.state = state;
		this.social_links = social_links;
		this.logo = logo;
		this.topic = topic;
		this.schedule_published_on = schedule_published_on;
		this.description = description;
		this._version = version;
		this.end_time = end_time;
		this.email = email;

	}

}