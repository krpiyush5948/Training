package builderclass;

public class SmartPhone {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Phone p = new PhoneBuilder().setOs("macbook").setPhone("realme").getPhone();
		System.out.println(p);
		
	
	

	}

}
