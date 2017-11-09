// Java program to illustrate Constructor Chaining
// within same class Using this() keyword
public class ConstructorChaining
{
    // default constructor 1
    // default constructor will call another constructor
    // using this keyword from same class
	ConstructorChaining()
    {
        // calls constructor 2
        this(10);
        System.out.println("Printing the Default constructor");
    }
 
    // parameterized constructor 2
	ConstructorChaining(int x)
    {
        // calls constructor 3
        this(10, 20);
        System.out.println(x);
    }
 
    // parameterized constructor 3
	ConstructorChaining(int x, int y)
    {
        System.out.println(x * y);
    }
 
    public static void main(String args[])
    {
        // invokes default constructor first
        new ConstructorChaining();
        
        Derived obj = new Derived("test");
    }
}


//Java program to illustrate Constructor Chaining to
//other class using super() keyword
class Base
{
 String name;

 // constructor 1
 Base()
 {
     this("");
     System.out.println("No-argument constructor of" + " base class");
 }

 // constructor 2
 Base(String name)
 {
     this.name = name;
     System.out.println("Calling parameterized constructor" + " of base");
 }
}

class Derived extends Base
{
 // constructor 3
 Derived()
 {
     System.out.println("No-argument constructor " + "of derived");
 }

 // parameterized constructor 4
 Derived(String name)
 {
     // invokes base class constructor 2
     super(name);
     System.out.println("Calling parameterized " + "constructor of derived");
 }

}