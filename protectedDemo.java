class A{
private int a=10;
public int b=20;
protected int c=30;
int d=40;
}
class B extends A{
void show(){
//System.out.println("the value of a is"+ a);
System.out.println("the value of b is"+b);
System.out.println("the value of c is"+c);
System.out.println("the value of d is "+d);
}}

class C extends B{
void display(){
System.out.println("the value of d is"+d);
}}

class protectedDemo{
public static void main(String args[]){
B b=new B();
b.show();
C c=new C();
c.display();
}}