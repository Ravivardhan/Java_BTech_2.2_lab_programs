class box{

box(){
width=-1;
height=-1;
depth=-1;
}

box(double len){
width=height=depth=len;
}

box(double w,double h,double d){
width=w;
height=h;
depth=d;
}

box(box ob){
ob.height=height;
ob.depth=depth;
ob.width=width;
}

double volume(){
volume=height*width*depth;
System.out.println("the volume of the box is"+volume);
}}


class boxTest{
public static void main(String args[])
{
box b1=new box();
box b2=new box(10);
box b3=new box(10,20,30);
box b4=new box(b1);

b1.volume();
b2.volume();
b3.volume();
b4.volume();
}}