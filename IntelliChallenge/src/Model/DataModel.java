package Model;

public class DataModel {

	public String name;
    public String address;
    public String street;
    public String houseNum;
    public boolean isAddressTwice;
	
	private String phoneNum;
	private boolean isPhonedouble;
	
	public DataModel(String name, String address, String street, String houseNum) {
		super();
		this.name = name;
		this.address = address;
		this.street = street;
		this.houseNum = houseNum;
	}
	public DataModel(String name, String address, String street, String houseNum, boolean isAddressTwice) {
		super();
		this.name = name;
		this.address = address;
		this.street = street;
		this.houseNum = houseNum;
		this.isAddressTwice = isAddressTwice;
	}
	
	public DataModel(String name, String phoneNum, boolean isPhonedouble) {
		super();
		this.name = name;
		this.phoneNum = phoneNum;
		this.isPhonedouble = isPhonedouble;
	}
	
	
	 
	
}
