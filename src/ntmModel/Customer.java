package ntmModel;

public class Customer {
	private String fullname , phoneNumber , address , ownAddress; 
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	
	public Customer(String fullname, String phoneNumber , String address , String ownAddress) {
		this.fullname=fullname;
		this.phoneNumber=phoneNumber;
		this.address=address;
		this.ownAddress=ownAddress;
	}
	
	public void setFullname(String fullname) {
		this.fullname=fullname;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber=phoneNumber;
	}
	
	public void setAddress(String address) {
		this.address=address;
	}
	
	public void setOwnAddress(String ownAddress) {
		this.ownAddress=ownAddress;
	}
	
	public String getFullname() {
		return fullname;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public String getAddress() {
		return address;
	}
	
	public String getOwnAddress() {
		return ownAddress;
	}

}
