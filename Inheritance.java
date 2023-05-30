class Parent 
{
	int age=24;	
	Parent()
	{
		System.out.println("Parent class constructor");	   	   
	} 
}
class Child extends Parent
{
   int age=20;
   Child()
   {
	    System.out.println("Child class constructor");
	   System.out.println(age);
	   System.out.println("Child class go to Parent class constructor because super key use.");
	   System.out.println(super.age);	
   }  
}
public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
       Child c=new Child();
      
       
	}

}
