
class PremiceModel {

    public PricemModel _pricem;
    public TagerModel _tager;
    public SnippsModel _snipps;
    public DepthModel _depth;

    public PremiceModel(PricemModel pricem, TagerModel tager, SnippsModel snipps, DepthModel depth) {

        this._pricem = pricem;
        this._tager = tager;
        this._snipps = snipps;
        this._depth = depth;

    }

}