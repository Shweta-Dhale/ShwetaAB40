//Print table using array

package javabasics;
public class Table_array {

	public static void main(String[] args) {
		
		int Roll_on[]=new int[5];
		String Student_name[]=new String[5];
		char Gender[]=new char[5];
		int Mobile_no[]=new int[5];
		
		Student_name[0]="Kushal   ";
		Student_name[1]="Kushal P";
		Student_name[2]="Vishal Prasad";
		Student_name[3]="Monica Rawat";
		Student_name[4]="Kushagra Verma";
				
		Gender[0]='M';
		Gender[1]='M';
		Gender[2]='M';
		Gender[3]='F';
		Gender[4]='M';
		
		Mobile_no[0]=968574;
		Mobile_no[1]=857412;
		Mobile_no[2]=857421;
		Mobile_no[3]=968521;
		Mobile_no[4]=967452;
		
		Roll_on[0]=1;
		Roll_on[1]=2;
		Roll_on[2]=3;
		Roll_on[3]=4;
		Roll_on[4]=5;
			
	        System.out.println("Roll_on\tStudent_name\tGender\tMobile_no"); // Printing the table header
 
	        for (int i=0;i<5;i++) { // Printing each row of the table
	        	
	      System.out.println(Roll_on[i] + "\t" + Student_name[i] + "\t" +Gender[i] + "\t" + 
	      Mobile_no[i]);
	        
	        }
		}
		
		}
	
		

	
	


