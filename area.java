class figure{
double dim1,dim2;
figure(double a,double b){
dim1=a;
dim2=b;
}
double area(){
System.out.println("figure is not defined");
return 0;
}}

class rectangle extends figure{
rectangle(double a,double b){
super(a,b);
} 
double area(){
System.out.println("inside the area of rectange");
return dim1*dim2;
}}

class triangle extends figure{
triangle(double a,double b){
super(a,b);
}

double area(){
System.out.println("inside the area of triangle");
return dim1*dim2/2;
}
}

class area{
public static void main(String args[])
{
figure fig=new figure(10,20);
rectangle rect=new rectangle(9,5);
triangle tri=new triangle(5,5);

figure fig2;
fig2=rect;
System.out.println(fig2.area());

fig2=tri;
System.out.println(fig2.area());
}}