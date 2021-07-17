class A{
void callme(){
System.out.println("inside callme function of class A");
}}

class B extends A{
void callme(){
System.out.println("inside callme function of class b");
}}

class C extends B{
void callme(){
System.out.println("inside the callme function of class c");
}}

class callme{
public static void main(String args[]){

A a=new A();
B b=new B();
C c=new C();

A r;
r=a;
r.callme();

r=b;
r.callme();

r=c;
r.callme();
}}