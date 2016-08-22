
class CopyrightModel {

    public String holder;
    public String email;
    public String licence_url;
    public int id;
    public String end_time;
    public String logo;
    public String licence;
    public Call_for_papersModel _call_for_papers;
    public int year;
    public String holder_url;

    public CopyrightModel(String holder, String email, String licence_url, int id, String end_time, String logo, String licence, Call_for_papersModel call_for_papers, int year, String holder_url) {

        this.holder = holder;
        this.email = email;
        this.licence_url = licence_url;
        this.id = id;
        this.end_time = end_time;
        this.logo = logo;
        this.licence = licence;
        this._call_for_papers = call_for_papers;
        this.year = year;
        this.holder_url = holder_url;

    }

}