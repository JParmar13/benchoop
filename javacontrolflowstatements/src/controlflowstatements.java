public class controlflowstatements {
	
	public static void main(String[]args) {
//		int value = 1;
//		if(value == 1) {
//			System.out.println("Value was 1");
//		} else if(value == 2) {
//			System.out.println("Value was 2");
//		} else {
//			System.out.println("was not 1 or 2");
//		}
		
		int switchValue = 4;
		
		switch(switchValue) {
		case 1:
			System.out.println("Value was 1");
			break;
		case 2:
			System.out.println("Value was 2");
			break;
			
		case 3:case 4:case 5:
			System.out.println("was a 3 or 4 or 5");
			System.out.println("Actually it was a " + switchValue);
			break;
		
		default:
			System.out.println("Value was not 1 or 2");
			break;
		}
		
		char charHolder = 'B';
		
		switch(charHolder) {
		case 'A':
			System.out.println("A was found");
			break;
		case 'B':
			System.out.println("B was found");
			break;
		case 'C':
			System.out.println("C was found");
			break;
		case 'D':
			System.out.println("D was found");
			break;
		case 'E':
			System.out.println("E was found");
			break;
		
			default:
				System.out.println("None were found :/");
				break;
			
			}
		
		String month = "January";
		
		switch(month.toLowerCase()) {
		case "january":
			System.out.println("Jan");
			break;
		case "june":
			System.out.println("June");
			break;
			default:
				System.out.println("Not sure");
				break;
				
		}
	}
}