//package name
package assignment5_1;
//Created child class extending abstract parent class(Inheritance)
public class Child1 extends Parent{
	
	//implementing first abstract method from parent class
	@Override
	public void abstractMethod1() {
		System.out.println("Abstract method1 implementation in Child class");
		
	}
	//implementing second abstract method from parent class
	@Override
	public void abstractMethod2() {
		System.out.println("Abstract method2 implementation in Child class");
		
	}
	//main method to call and execute implemented child class methods
	public static void main(String args[]){
		//Instantiate object
		Parent p1=new Child1();
		//calling first implemented method
		p1.abstractMethod1();
		//Calling second implemented method
		p1.abstractMethod2();
		
		
	}
//end of code
}
