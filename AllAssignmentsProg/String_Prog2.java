package javabasics;

public class String_Prog2 {

	public static void main(String[] args) {
		
		String name="Manish";
		int size=name.length();
		
		System.out.println(size);
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(name.charAt(2));
		System.out.println(name.indexOf('i'));
		System.out.println(name.equals("manish"));//gives boolean result
	}

}
