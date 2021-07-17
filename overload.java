class OverloadDemo{
void test(){
System.out.println("no parameters");
}
void test(int a){
System.out.println("the value of a is"+a);
}
void test(int a,int b){
System.out.println("the value of a and b is"+a+""+b);
}
double test(double a){
System.out.println("the value of double a is"+a);
return a*a;
}}

class Overload{
public static void main(String[] args)
{
OverloadDemo d1=new OverloadDemo();
double result;
d1.test();
d1.test(10);
d1.test(10,20);
result=d1.test(25.56);
System.out.println("the result of d1.test(25.56) is"+result);
} }