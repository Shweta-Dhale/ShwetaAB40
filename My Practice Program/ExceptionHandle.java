package javabasics;
public class ExceptionHandle {

	public static void main(String[] args) {

		String name[]=new String[4];
			name[0]="Ram";
			name[1]="Shyam";
			name[2]="Jay";
			name[3]="Om";
			
			System.out.println("Start of the program");
			
			try {
			
			name[4]="Sai";  //exception occurred hence will not execute
			System.out.println("print the name");

			}
			catch(ArrayIndexOutOfBoundsException e) { //handles the exception
				
				System.out.println(e);	

			}
			
		    finally {   //finally block always executes
				
				System.out.println("end of the program");
		    }
	}
}
	