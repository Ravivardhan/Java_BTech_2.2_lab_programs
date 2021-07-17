class A{
int i;
}

class B extends A{
int i;
B(int a,int b){
super.i=a;
i=b;
}
void show(){
System.out.println("the value of i in super class is"+super.i);
System.out.println("the value of i in subclass is"+i);
}}

class superthis{
public static void main(String args[]){
B ob=new B(1,2);
ob.show();
}}