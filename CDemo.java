class CDemo{
int val1;
int val2;
CDemo(){
	val1=10;
	val2=20;
System.out.println("inside first constructor");
}
CDemo(int a){
	val1=a;
System.out.println("inside second constructor");
}
CDemo(int a,int b){
	val1=a;
	val2=b;
System.out.println("inside third constructor");
}
public void display(){
System.out.println("the value of val1 is"+val1+"val2 is"+val2);
}

public static void main(String args[])
{
CDemo d1=new CDemo();
CDemo d2=new CDemo(10);
CDemo d3=new CDemo(10,20);
d1.display();
d2.display();
d3.display();
}}