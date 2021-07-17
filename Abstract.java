abstract class A{
abstract void callme();
void callmetoo(){
System.out.println("this is a concrete method");
}
}

class B extends A{
void callme(){
System.out.println("method in class b");
}}

class Abstract{
public static void main(String args[])
{

B b=new B();
b.callme();
b.callmetoo();
}}
