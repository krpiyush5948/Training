package builderclass;

public class PhoneBuilder {
	private String phone ;
	private  String os;
	private int battery;

	private String processor;
	
	
	
	public PhoneBuilder setPhone(String phone) {
		this.phone = phone;
		return this;
	}
	public PhoneBuilder setOs(String os) {
		this.os = os;
		return this;
	}
	public PhoneBuilder setBattery(int battery) {
		this.battery = battery;
		return this;
	}
	public PhoneBuilder setProcessor(String processor) {
		this.processor = processor;
		return this;
	}
	
 public Phone  getPhone() {
	 return new Phone(phone,os,battery,processor);
	 
 }
	
	

}
