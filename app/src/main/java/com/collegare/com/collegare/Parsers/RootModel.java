import java.util.ArrayList;

class RootModel {

	public String timezone;
	public int id;
	public CopyrightModel _copyright;
	public ArrayList<Social_linksModel> social_links;
	public String email;
	public String background_image;
	public String organizer_description;
	public String logo;
	public String start_time;
	public VersionModel _version;
	public String code_of_conduct;
	public String topic;
	public String description;
	public String end_time;
	public String name;
	public String organizer_name;
	public String schedule_published_on;
	public String privacy;
	public String location_name;
	public String type;
	public Call_for_papersModel _call_for_papers;
	public CreatorModel _creator;
	public String state;

	public RootModel(String timezone, int id, CopyrightModel copyright, ArrayList<Social_linksModel> social_links, String email, String background_image, String organizer_description, String logo, String start_time, VersionModel version, String code_of_conduct, String topic, String description, String end_time, String name, String organizer_name, String schedule_published_on, String privacy, String location_name, String type, Call_for_papersModel call_for_papers, CreatorModel creator, String state) {

		this.timezone = timezone;
		this.id = id;
		this._copyright = copyright;
		this.social_links = social_links;
		this.email = email;
		this.background_image = background_image;
		this.organizer_description = organizer_description;
		this.logo = logo;
		this.start_time = start_time;
		this._version = version;
		this.code_of_conduct = code_of_conduct;
		this.topic = topic;
		this.description = description;
		this.end_time = end_time;
		this.name = name;
		this.organizer_name = organizer_name;
		this.schedule_published_on = schedule_published_on;
		this.privacy = privacy;
		this.location_name = location_name;
		this.type = type;
		this._call_for_papers = call_for_papers;
		this._creator = creator;
		this.state = state;

	}

}