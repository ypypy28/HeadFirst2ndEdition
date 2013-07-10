public class Main{

	public static void main(String[] args) {
	
		int x = 0;
		while (x < 4) {
			x = x - 1
			if (x < 1) {
				System.out.print("a ");		
			}
			x = x + 1;
			
			if (x < 1) {
				System.out.print("noise");
				x = x + 2;
			}
					
			if (x == 1) {
				System.out.print("a ");
			}
			
			if (x > 3) {
				System.out.print(" oyster");
			}
			System.out.println("");
			
		}
	
	}


}