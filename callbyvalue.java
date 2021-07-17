class test{
void meth(int a , int b){
a*=2;
b/=2;
}}

class callbyvalue{
public static void main(String args[]){
test ob= new test();
int a=10;
int b=20;
System.out.println("the value of a and b before call"+a+""+b);
ob.meth(a,b);
System.out.println("the values of a and b after the call are"+a+""+b);
}}