
class FlxwmModel {

	public String background_image;
	public Call_for_papersModel _call_for_papers;
	public CopModel _cop;
	public String code_of_conduct;

	public FlxwmModel(String background_image, Call_for_papersModel call_for_papers, CopModel cop, String code_of_conduct) {

		this.background_image = background_image;
		this._call_for_papers = call_for_papers;
		this._cop = cop;
		this.code_of_conduct = code_of_conduct;

	}

}