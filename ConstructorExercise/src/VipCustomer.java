
public class VipCustomer {

	private String name;
	private int creditLimit;
	private String emailAddress;	
	
	public VipCustomer(String name, int creditLimit, String emailAddress) {
		this.name = name;
		this.creditLimit = creditLimit;
		this.emailAddress = emailAddress;
		System.out.println("Fully constructed");
	}
	public VipCustomer(String name, int creditLimit) {
		this("jmail@com");
		this.name = name;
		this.creditLimit = creditLimit;
		System.out.println("Almost fully constructed");
	}
	public VipCustomer(String name) {
		this.name = name;
		System.out.println("Partially constructed");
	}
	
	public VipCustomer() {
		this("Default name", 50, "default@defaultmail.default");
		System.out.println("Default constructor for VIP customer");
	}	
	
	
	public String getName() {
		return name;
	}
	public int getCreditLimit() {
		return creditLimit;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	
}
