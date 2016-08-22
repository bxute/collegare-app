
class FlxwmModel {

	public String background_image;
	public CopModel _cop;
	public String code_of_conduct;
	public Call_for_papersModel _call_for_papers;

	public FlxwmModel(String background_image, CopModel cop, String code_of_conduct, Call_for_papersModel call_for_papers) {

		this.background_image = background_image;
		this._cop = cop;
		this.code_of_conduct = code_of_conduct;
		this._call_for_papers = call_for_papers;

	}

}