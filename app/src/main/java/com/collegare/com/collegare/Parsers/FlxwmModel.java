
class FlxwmModel {

	public CopModel _cop;
	public String background_image;
	public Call_for_papersModel _call_for_papers;
	public String code_of_conduct;

	public FlxwmModel(CopModel cop, String background_image, Call_for_papersModel call_for_papers, String code_of_conduct) {

		this._cop = cop;
		this.background_image = background_image;
		this._call_for_papers = call_for_papers;
		this.code_of_conduct = code_of_conduct;

	}

}