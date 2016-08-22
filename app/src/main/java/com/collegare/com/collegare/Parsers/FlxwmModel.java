
class FlxwmModel {

	public String code_of_conduct;
	public Call_for_papersModel _call_for_papers;
	public String background_image;
	public CopModel _cop;

	public FlxwmModel(String code_of_conduct, Call_for_papersModel call_for_papers, String background_image, CopModel cop) {

		this.code_of_conduct = code_of_conduct;
		this._call_for_papers = call_for_papers;
		this.background_image = background_image;
		this._cop = cop;

	}

}