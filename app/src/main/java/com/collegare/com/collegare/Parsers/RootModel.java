import java.util.ArrayList;

class RootModel {

	public ArrayList<RestModel> rest;
	public String firstName;
	public int age;
	public String lastName;
	public RestdataModel _restdata;

	public RootModel(ArrayList<RestModel> rest, String firstName, int age, String lastName, RestdataModel restdata) {

		this.rest = rest;
		this.firstName = firstName;
		this.age = age;
		this.lastName = lastName;
		this._restdata = restdata;

	}

}