
class DesModel {

    public Boolean required;
    public ComplianceModel _compliance;
    public String type;
    public String description;

    public DesModel(Boolean required, ComplianceModel compliance, String type, String description) {

        this.required = required;
        this._compliance = compliance;
        this.type = type;
        this.description = description;

    }

}