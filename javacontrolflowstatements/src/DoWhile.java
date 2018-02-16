public class DoWhile {
	
	public static void main(String[]args) {
		
//		int count = 1;
//		while(count != 5) {
//			System.out.println("Count value is " + count);
//			count++;
//		}
//		
////		for (int i = 1; i < 7; i++) {
////			System.out.println("Count value is " + i);
////		}
//		
//		count = 1;
//		while(true) {
//			if(count == 6) {
//				break;
//			}
//			System.out.println("Count value is " + count);
//			count++;
//		}
//		
//		int count = 1;
//		do {
//			System.out.println("Count value was " + count);
//			count ++;
//			
//			if(count > 100) {
//				break;
//			}
//		
//		} while (count != 6);
			
		int totalEvenNumbers = 0;
		
		int number = 5;
		int finishNumber = 20;
		
		while (number <= finishNumber) {
			if(!isEvenNumber(number)) {
				number++;
				continue;
			}
			
			System.out.println("Even number " + number);
			number++;
			totalEvenNumbers++;
			
			if (totalEvenNumbers == 5) {
				System.out.println("We have found " + totalEvenNumbers + " even numbers");
				break;
			}
			
			
		}
	}
	
	public static boolean isEvenNumber(int a) {
		
		if (a % 2 == 0) {
			return true;
		} else 
			return false;
				
	}	
	
	
	
	
	
}