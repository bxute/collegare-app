import java.util.ArrayList;

class RootModel {

	public CopyrightModel _copyright;
	public CreatorModel _creator;
	public String organizer_name;
	public String timezone;
	public String organizer_description;
	public String location_name;
	public Call_for_papersModel _call_for_papers;
	public VersionModel _version;
	public String start_time;
	public String type;
	public String topic;
	public String logo;
	public int id;
	public String background_image;
	public String name;
	public String code_of_conduct;
	public ArrayList<Social_linksModel> social_links;
	public String privacy;
	public String schedule_published_on;
	public String end_time;
	public String email;
	public String description;
	public String state;

	public RootModel(CopyrightModel copyright, CreatorModel creator, String organizer_name, String timezone, String organizer_description, String location_name, Call_for_papersModel call_for_papers, VersionModel version, String start_time, String type, String topic, String logo, int id, String background_image, String name, String code_of_conduct, ArrayList<Social_linksModel> social_links, String privacy, String schedule_published_on, String end_time, String email, String description, String state) {

		this._copyright = copyright;
		this._creator = creator;
		this.organizer_name = organizer_name;
		this.timezone = timezone;
		this.organizer_description = organizer_description;
		this.location_name = location_name;
		this._call_for_papers = call_for_papers;
		this._version = version;
		this.start_time = start_time;
		this.type = type;
		this.topic = topic;
		this.logo = logo;
		this.id = id;
		this.background_image = background_image;
		this.name = name;
		this.code_of_conduct = code_of_conduct;
		this.social_links = social_links;
		this.privacy = privacy;
		this.schedule_published_on = schedule_published_on;
		this.end_time = end_time;
		this.email = email;
		this.description = description;
		this.state = state;

	}

}