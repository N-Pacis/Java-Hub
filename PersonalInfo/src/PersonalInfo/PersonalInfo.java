package PersonalInfo;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class PersonalInfo {

	private static FileInputStream inputStream = null;
	private static FileOutputStream outputStream = null;
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		try {
			String names = null;
			String age = null;
			String school = null;
			int no;
			
			outputStream = new FileOutputStream("personal.txt");
			inputStream = new FileInputStream("personal.txt");	
			
			System.out.println("PERSONAL DATA MANAGEMENT:");
			
			System.out.println("Enter number of people you want to register below:");
			no = scan.nextInt();
            System.out.println(no);
			input_data(names,age,school,no,outputStream);
			read_saved_data(no,inputStream);
		}
		catch(Exception err) {
			err.printStackTrace();
		}
		finally {
			close_files(inputStream);
		}	
		
	}
	
	public static void input_data(String names, String age, String school, int no, FileOutputStream outputStream) {
		try {
			for(int i=0;i<no; i++){
				System.out.println("Enter names for person "+(i+1)+":");
				BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
				names = reader1.readLine();
				System.out.println("Enter age for person "+(i+1)+":");
				BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
				age =  reader2.readLine();
				System.out.println("Enter school for person "+(i+1)+":");
				BufferedReader reader3 = new BufferedReader(new InputStreamReader(System.in));
				school = reader3.readLine();
				
				save_data(names,age,school,outputStream);
			}
		}
		catch(Exception err) {
			err.printStackTrace();
		}
	  
	}
	
	public static void save_data(String names,String age,String school, FileOutputStream outputStream) {
		try {
	       	String data = "Names: "+names+". Age: "+age+", School: "+school+"\n";
	       	byte[] bytesArray = data.getBytes();
	       	outputStream.write(bytesArray);
	       	System.out.println("Saved successfully");
		}
		catch(Exception err) {
			err.printStackTrace();
		}
	}
	
	public static void read_saved_data(int no, FileInputStream inputStream) {
		for(int i=0;i<3;i++){
			int mychar;
			try {
				while((mychar = inputStream.read()) != -1) {
					System.out.print((char)mychar);
				}
			}
			catch(Exception err) {
				err.printStackTrace();
			}
		}
	}
	
	public static void close_files(FileInputStream inputStream) {
		try {			
			if(inputStream != null) inputStream.close();
		}
		catch(Exception err) {
			err.printStackTrace();
		}
	}
	
	

}
