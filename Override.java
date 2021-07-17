class A{
int i,j;
A(int a,int b){
i=a;
j=b;
}

void show(){
System.out.println("the values of i and j are"+i+""+j);
}
}

class B extends A{
int k;
B(int a,int b,int c){
super(a,b);

k=c;
}
void show(){
System.out.println("the values of k is"+k);
}}

class Override{
public static void main(String args[])
{
B ob = new B(1,2,77);
ob.show();
}}