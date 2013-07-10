public class Main{

	public static void main(String[] args) {

		int x = 0;
		while (x < 4) {
			x = x - 1;
			if (x < 1) {
				System.out.print("a ");				
			}
			
			if (x > 1) {
				System.out.print("an");
				System.out.print(" oyster");				
			}
			
			if (x == 1) {
				System.out.print("annoye");
			}
			
			if (x < 1) {
				System.out.print("noise");
				x = x + 1;
			}	
			System.out.println("");
			x = x + 2;
		}
		
	}


}