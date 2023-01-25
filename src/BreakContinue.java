
public class BreakContinue {

	public static void main(String[] args) {


		breakContinueMethod();
	}  	
	static void breakContinueMethod() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++) {
			if(i==7) {
				System.out.println("7 is found and it will stop the program");
				break; //when i=5 true then it will break the loop
			}
			else if(i==3) {
				System.out.println("3 is found"); //4 is less than 5 so it will reach i=4.So it will will true before i=5
			    continue;
			}
			else if(i==2) {
				System.out.println("2 is found"); //8 is greater than 5 so loop will stop when i=5	
			}
			else if(i==4) {
				System.out.println("4 is found"); //8 is greater than 5 so loop will stop when i=5	
			    continue;
			}
			else
			System.out.println("The number that are not available in if condition is ="+i);
			continue;
		}
		System.out.println("This line will print when the loop is over or end at break");
	}
}
