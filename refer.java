class A{
int i=10;
}

class B extends A{
int j=20;
}

class refer{
public static void main(String args[])
{
A a=new A();
B b= new B();
a=b;
System.out.println(b.j);
}}