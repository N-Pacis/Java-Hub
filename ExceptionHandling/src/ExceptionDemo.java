
public class ExceptionDemo {
	public static void main(String[] args){
		int a =5,b =2;
		double q = 0D;
		int numbers[] = {1,2,5,0,4};
		
		try {
			q = a / b; 
			for(int i=0;i<= numbers.length;i++) {
				int n = numbers[i];
			}
			System.out.println(q);
		}
		catch(ArithmeticException E) {
			System.out.println(E.getMessage());
			q = 5;
		}
		catch(ArrayIndexOutOfBoundsException X) {
			System.out.println(X.getMessage());	
		}
		finally {
			System.out.println("Executed!");
			System.out.println("The program will continue and the quotient equal to: "+q);
		}
	}
}