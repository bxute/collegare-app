
class DepthModel {

    public CroopersModel _croopers;
    public Boolean required;
    public String type;
    public String description;

    public DepthModel(CroopersModel croopers, Boolean required, String type, String description) {

        this._croopers = croopers;
        this.required = required;
        this.type = type;
        this.description = description;

    }

}