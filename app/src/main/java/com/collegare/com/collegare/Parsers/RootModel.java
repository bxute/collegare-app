import java.util.ArrayList;

class RootModel {

	public String code_of_conduct;
	public String end_time;
	public Call_for_papersModel _call_for_papers;
	public CopyrightModel _copyright;
	public VersionModel _version;
	public String background_image;
	public String email;
	public String name;
	public CreatorModel _creator;
	public String type;
	public String schedule_published_on;
	public String location_name;
	public String topic;
	public String organizer_description;
	public ArrayList<Social_linksModel> social_links;
	public String timezone;
	public String description;
	public String start_time;
	public String organizer_name;
	public int id;
	public String logo;
	public String privacy;
	public String state;

	public RootModel(String code_of_conduct, String end_time, Call_for_papersModel call_for_papers, CopyrightModel copyright, VersionModel version, String background_image, String email, String name, CreatorModel creator, String type, String schedule_published_on, String location_name, String topic, String organizer_description, ArrayList<Social_linksModel> social_links, String timezone, String description, String start_time, String organizer_name, int id, String logo, String privacy, String state) {

		this.code_of_conduct = code_of_conduct;
		this.end_time = end_time;
		this._call_for_papers = call_for_papers;
		this._copyright = copyright;
		this._version = version;
		this.background_image = background_image;
		this.email = email;
		this.name = name;
		this._creator = creator;
		this.type = type;
		this.schedule_published_on = schedule_published_on;
		this.location_name = location_name;
		this.topic = topic;
		this.organizer_description = organizer_description;
		this.social_links = social_links;
		this.timezone = timezone;
		this.description = description;
		this.start_time = start_time;
		this.organizer_name = organizer_name;
		this.id = id;
		this.logo = logo;
		this.privacy = privacy;
		this.state = state;

	}

}