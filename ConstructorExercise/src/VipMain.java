public class VipMain {
	
	public static void main(String[]args) {
		
		//Tims answer
		VipPerson person1 = new VipPerson();
		System.out.println(person1.getName());
		VipPerson person2 = new VipPerson("Bob", 25000.0);
		System.out.println(person2.getName());
		VipPerson person3 = new VipPerson("Tim", 100.0, "tim@email.com");
		System.out.println(person3.getName());
		// My attempt at the coding exercise for constructor
		VipCustomer jay = new VipCustomer("Jay", 10);	
		
		System.out.println(jay.getName() + " = name, " + jay.getEmailAddress() + " = email address, " + jay.getCreditLimit() + " = credit limit");
	}
}