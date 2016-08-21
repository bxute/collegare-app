
class SnippsModel {

    public Boolean required;
    public DesModel _des;
    public String type;
    public String description;

    public SnippsModel(Boolean required, DesModel des, String type, String description) {

        this.required = required;
        this._des = des;
        this.type = type;
        this.description = description;

    }

}