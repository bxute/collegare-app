import java.util.ArrayList;

class RootModel {

	public ArrayList<PhoneNumberModel> phoneNumber;
	public String lastName;
	public int age;
	public ArrayList<PostModel> post;
	public AddressModel _address;
	public String firstName;

	public RootModel(ArrayList<PhoneNumberModel> phoneNumber, String lastName, int age, ArrayList<PostModel> post, AddressModel address, String firstName) {

		this.phoneNumber = phoneNumber;
		this.lastName = lastName;
		this.age = age;
		this.post = post;
		this._address = address;
		this.firstName = firstName;

	}

}