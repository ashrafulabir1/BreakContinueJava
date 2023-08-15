
public class BreakContinue {

	public static void main(String[] args) {


		breakContinueMethod();
	}  	
	static void breakContinueMethod() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++) {
			if(i==7) {
				System.out.println("7 is found and it will stop the program");
				break; 
			}
			else if(i==3) {
				System.out.println("3 is found"); 
			    continue;
			}
			else if(i==2) {
				System.out.println("2 is found"); 
			}
			else if(i==4) {
				System.out.println("4 is found"); 
			    continue;
			}
			else
			System.out.println("The number that are not available in if condition is ="+i);
			continue;
		}
		System.out.println("This line will print when the loop is over or end at break");
	}
}
