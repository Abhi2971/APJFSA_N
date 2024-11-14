public class Lab_Q2{
	public static void main(String[] args){
		//Unboxing
		//implicit
		Integer obj = new Integer(8);
		int a=obj;
		System.out.println("Implicit method");
		System.out.println("a = "+a);
		
		//explicit
		int a2 = obj.intValue();
		System.out.println("Explicit method");
		System.out.println("a2 = "+a2);
	}
}
/*
OUTPUT
Implicit method
a = 8
Explicit method
a2 = 8

*/

