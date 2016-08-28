import java.util.ArrayList;

class RootModel {

	public String privacy;
	public String timezone;
	public String end_time;
	public CopyrightModel _copyright;
	public Call_for_papersModel _call_for_papers;
	public String organizer_description;
	public String schedule_published_on;
	public String logo;
	public String description;
	public String background_image;
	public String location_name;
	public String code_of_conduct;
	public VersionModel _version;
	public ArrayList<Social_linksModel> social_links;
	public String type;
	public CreatorModel _creator;
	public String organizer_name;
	public String email;
	public String topic;
	public String name;
	public String start_time;
	public int id;
	public String state;

	public RootModel(String privacy, String timezone, String end_time, CopyrightModel copyright, Call_for_papersModel call_for_papers, String organizer_description, String schedule_published_on, String logo, String description, String background_image, String location_name, String code_of_conduct, VersionModel version, ArrayList<Social_linksModel> social_links, String type, CreatorModel creator, String organizer_name, String email, String topic, String name, String start_time, int id, String state) {

		this.privacy = privacy;
		this.timezone = timezone;
		this.end_time = end_time;
		this._copyright = copyright;
		this._call_for_papers = call_for_papers;
		this.organizer_description = organizer_description;
		this.schedule_published_on = schedule_published_on;
		this.logo = logo;
		this.description = description;
		this.background_image = background_image;
		this.location_name = location_name;
		this.code_of_conduct = code_of_conduct;
		this._version = version;
		this.social_links = social_links;
		this.type = type;
		this._creator = creator;
		this.organizer_name = organizer_name;
		this.email = email;
		this.topic = topic;
		this.name = name;
		this.start_time = start_time;
		this.id = id;
		this.state = state;

	}

}