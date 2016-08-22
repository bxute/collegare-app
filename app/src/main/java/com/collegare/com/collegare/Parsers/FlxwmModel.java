
class FlxwmModel {

	public String code_of_conduct;
	public String background_image;
	public Call_for_papersModel _call_for_papers;
	public CopModel _cop;

	public FlxwmModel(String code_of_conduct, String background_image, Call_for_papersModel call_for_papers, CopModel cop) {

		this.code_of_conduct = code_of_conduct;
		this.background_image = background_image;
		this._call_for_papers = call_for_papers;
		this._cop = cop;

	}

}