import java.util.ArrayList;

class RootModel {

	public Call_for_papersModel _call_for_papers;
	public String name;
	public CreatorModel _creator;
	public String privacy;
	public String description;
	public String code_of_conduct;
	public String organizer_name;
	public String background_image;
	public String email;
	public String schedule_published_on;
	public CopyrightModel _copyright;
	public String state;
	public String organizer_description;
	public ArrayList<Social_linksModel> social_links;
	public String location_name;
	public String start_time;
	public int id;
	public String end_time;
	public VersionModel _version;
	public String logo;
	public String topic;
	public String timezone;
	public String type;

	public RootModel(Call_for_papersModel call_for_papers, String name, CreatorModel creator, String privacy, String description, String code_of_conduct, String organizer_name, String background_image, String email, String schedule_published_on, CopyrightModel copyright, String state, String organizer_description, ArrayList<Social_linksModel> social_links, String location_name, String start_time, int id, String end_time, VersionModel version, String logo, String topic, String timezone, String type) {

		this._call_for_papers = call_for_papers;
		this.name = name;
		this._creator = creator;
		this.privacy = privacy;
		this.description = description;
		this.code_of_conduct = code_of_conduct;
		this.organizer_name = organizer_name;
		this.background_image = background_image;
		this.email = email;
		this.schedule_published_on = schedule_published_on;
		this._copyright = copyright;
		this.state = state;
		this.organizer_description = organizer_description;
		this.social_links = social_links;
		this.location_name = location_name;
		this.start_time = start_time;
		this.id = id;
		this.end_time = end_time;
		this._version = version;
		this.logo = logo;
		this.topic = topic;
		this.timezone = timezone;
		this.type = type;

	}

}