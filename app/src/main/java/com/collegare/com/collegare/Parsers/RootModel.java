import java.util.ArrayList;

class RootModel {

	public VersionModel _version;
	public String type;
	public String end_time;
	public String email;
	public String name;
	public String timezone;
	public String topic;
	public CopyrightModel _copyright;
	public String location_name;
	public int id;
	public String logo;
	public String privacy;
	public String organizer_description;
	public String state;
	public String organizer_name;
	public String description;
	public Call_for_papersModel _call_for_papers;
	public ArrayList<Social_linksModel> social_links;
	public String schedule_published_on;
	public String background_image;
	public String start_time;
	public String code_of_conduct;
	public CreatorModel _creator;

	public RootModel(VersionModel version, String type, String end_time, String email, String name, String timezone, String topic, CopyrightModel copyright, String location_name, int id, String logo, String privacy, String organizer_description, String state, String organizer_name, String description, Call_for_papersModel call_for_papers, ArrayList<Social_linksModel> social_links, String schedule_published_on, String background_image, String start_time, String code_of_conduct, CreatorModel creator) {

		this._version = version;
		this.type = type;
		this.end_time = end_time;
		this.email = email;
		this.name = name;
		this.timezone = timezone;
		this.topic = topic;
		this._copyright = copyright;
		this.location_name = location_name;
		this.id = id;
		this.logo = logo;
		this.privacy = privacy;
		this.organizer_description = organizer_description;
		this.state = state;
		this.organizer_name = organizer_name;
		this.description = description;
		this._call_for_papers = call_for_papers;
		this.social_links = social_links;
		this.schedule_published_on = schedule_published_on;
		this.background_image = background_image;
		this.start_time = start_time;
		this.code_of_conduct = code_of_conduct;
		this._creator = creator;

	}

}