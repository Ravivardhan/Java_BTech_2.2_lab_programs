class A{
A(){
System.out.println("inside constructor of A");
}}

class B extends A{
B(){
System.out.println("inside constructor of B");
}}

class C extends B{
C(){
System.out.println("inside constructor of c");
}}

class Conc{
public static void main(String args[])
{
C c=new C();
}
}