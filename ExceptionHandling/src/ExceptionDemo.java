
public class ExceptionDemo {
	public void isInt(String number) throws NumberFormatException{
		try {
			int num = Integer.parseInt(number);
			System.out.println(num);
		}
		catch(Exception e) {
			throw new NumberFormatException(e.getMessage());
		}
	}
	
	public static void main(String[] args){
		int a =5,b =2;
		double q = 0D;
		int numbers[] = {1,2,5,0,4};
		ExceptionDemo Exc = new ExceptionDemo();
		
		try {
			q = a / b; 
			for(int i=0;i< numbers.length;i++) {
				int n = numbers[i];
			}
			Exc.isInt("10x");
		}
		catch(ArithmeticException E) {
			System.out.println(E.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException X) {
			System.out.println(X.getMessage());	
		}
		catch(NumberFormatException NFE) {
			System.out.println("Error: "+ NFE.getMessage());
		}
		finally {
			System.out.println("The program will continue");
		}
	}
}