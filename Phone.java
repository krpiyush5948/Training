package builderclass;

public class Phone {
	private String phone ;
	private  String os;
	private int battery;
	private String processor;
	/**
	 * @param phone
	 * @param os
	 * @param battery
	 * @param processor
	 */
	public Phone(String phone, String os, int battery, String processor) {
		super();
		this.phone = phone;
		this.os = os;
		this.battery = battery;
		this.processor = processor;
	}
	
	
	
	public String getPhone() {
		return phone;
	}



	public String getOs() {
		return os;
	}



	public int getBattery() {
		return battery;
	}



	public String getProcessor() {
		return processor;
	}



	@Override
	public String toString() {
		return "Phone [phone=" + phone + ", os=" + os + ", battery=" + battery + ", processor=" + processor + "]";
	}
	
	
	
	

}
