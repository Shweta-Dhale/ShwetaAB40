//Print table using array

package javabasics;

public class Print_Table {

	public static void main(String[] args) {

		String Student_name[]=new String[5];
		Student_name[0]="Kushal";
		Student_name[1]="Kushal P";
		Student_name[2]="Vishal Prasad";
		Student_name[3]="Monica Rawat";
		Student_name[4]="Kushagra Verma";
		
		char Gender[]=new char[5];
		Gender[0]='M';
		Gender[1]='M';
		Gender[2]='M';
		Gender[3]='F';
		Gender[4]='M';
		
		int Mobile_no[]=new int[5];
		Mobile_no[0]=968574;
		Mobile_no[1]=857412;
		Mobile_no[2]=857421;
		Mobile_no[3]=968521;
		Mobile_no[4]=967452;
		
		int Roll_on[]=new int[5];
		Roll_on[0]=1;
		Roll_on[1]=2;
		Roll_on[2]=3;
		Roll_on[3]=4;
		Roll_on[4]=5;
				
	System.out.println("Student_name"+"  "+Student_name[0]+"  "+Student_name[1]+"  "+Student_name[2]+"  "+Student_name[3]+"  "+Student_name[4]);
	System.out.println("Gender  "+"  \t"+Gender[0]+"  \t"+Gender[1]+"   \t"+Gender[2]+"  \t\t"+Gender[3]+"\t\t"+Gender[4]);
	System.out.println("Mobile_no"+"\t"+Mobile_no[0]+"\t"+Mobile_no[1]+"\t"+Mobile_no[2]+"\t\t"+Mobile_no[3]+"\t\t"+Mobile_no[4]);
	System.out.println("Roll_no"+"\t\t"+Roll_on[0]+"\t"+Roll_on[1]+"\t"+Roll_on[2]+"\t\t"+Roll_on[3]+"\t\t"+Roll_on[4]);

	}
}


