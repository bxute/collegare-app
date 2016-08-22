
class VersionModel {

    public String holder;
    public String holder_url;
    public String licence_url;
    public int sessions_ver;
    public int microlocations_ver;
    public String logo;
    public String licence;
    public int event_ver;
    public int year;

    public VersionModel(String holder, String holder_url, String licence_url, int sessions_ver, int microlocations_ver, String logo, String licence, int event_ver, int year) {

        this.holder = holder;
        this.holder_url = holder_url;
        this.licence_url = licence_url;
        this.sessions_ver = sessions_ver;
        this.microlocations_ver = microlocations_ver;
        this.logo = logo;
        this.licence = licence;
        this.event_ver = event_ver;
        this.year = year;

    }

}