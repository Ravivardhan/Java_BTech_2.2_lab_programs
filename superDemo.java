class A{
A(){
System.out.println("inside the 1st constructor of super class");
}
A(int a){
System.out.println("inside the 2nd constructor of super class");
}
}

class B extends A{
B(){
super(10);
System.out.println("inside the constructor of B");
}}

class superDemo{
public static void main(String args[]){
B Demo=new B();
}}