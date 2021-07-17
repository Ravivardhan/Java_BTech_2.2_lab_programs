class box{
double l,b,h;
box(double l,double b,double h){
this.l=l;
this.b=b;
this.h=h;
}
double volume(){
return l*b*h;
}}

class boxTest2{
public static void main(String[] args){
box b=new box(1,2,3);
System.out.println("the volume of the box is"+b.volume());
}}