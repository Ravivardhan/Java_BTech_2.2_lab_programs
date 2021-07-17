class box{
double l=5,b=5,h=5;
box(double l1,double b1,double h1){
l=l1;
b=b1;
h=h1;
}
double volume(){
  return l*b*h;
}}
class boxTest
{
public static void main(String[] args){
box b=new box(1,2,3);
System.out.println("the volume of the box is"+b.volume());
}}