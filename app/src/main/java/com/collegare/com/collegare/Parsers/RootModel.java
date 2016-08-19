import java.util.ArrayList;

class RootModel {

	public String lastName;
	public AddressModel _address;
	public ArrayList<PostModel> post;
	public ArrayList<ResultModel> Result;
	public String firstName;
	public ArrayList<PhoneNumberModel> phoneNumber;
	public int age;

	public RootModel(String lastName, AddressModel address, ArrayList<PostModel> post, ArrayList<ResultModel> Result, String firstName, ArrayList<PhoneNumberModel> phoneNumber, int age) {

		this.lastName = lastName;
		this._address = address;
		this.post = post;
		this.Result = Result;
		this.firstName = firstName;
		this.phoneNumber = phoneNumber;
		this.age = age;

	}

}