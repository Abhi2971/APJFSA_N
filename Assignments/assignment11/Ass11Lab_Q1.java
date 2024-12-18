public class Ass11Lab_Q1{
	public static void main(String[] args){
		//Auoboxing
		int id =10;
		Integer i=id;//(inbuilt method)//implicit
		System.out.println("Implicit method");
		System.out.println("id = "+id+" i = "+i);
		
		int id2=20;
		Integer i2=Integer.valueOf(id2);//explicit
		System.out.println("Explicit method");
		System.out.println("id2 = "+id2+" i2 = "+i2);
	}

} 
		
/*
OUTPUT
Implicit method
id = 10 i = 10
Explicit method
id2 = 20 i2 = 20

*/
