
class ReckleModel {

    public ThetaModel _theta;
    public int commentCount;
    public String _repe;
    public SedModel _sed;
    public ContestNoModel _contestNo;
    public AdeesModel _adees;
    public ArePIseedsModel _arePIseeds;

    public ReckleModel(ThetaModel theta, int commentCount, String _repe, SedModel sed, ContestNoModel contestNo, AdeesModel adees, ArePIseedsModel arePIseeds) {

        this._theta = theta;
        this.commentCount = commentCount;
        this._repe = _repe;
        this._sed = sed;
        this._contestNo = contestNo;
        this._adees = adees;
        this._arePIseeds = arePIseeds;

    }

}