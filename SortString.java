class SortString{

static String arr[]={"this","is","a","test","case","for","string"};
public static void main(String args[]){
for(int j=0;j<arr.length;j++)
{
for(int i=j+1;i<arr.length;i++)
{
int k=arr[i].compareTo(arr[j]);
System.out.println(k);
if(k<0){
String t=arr[j];
arr[j]=arr[i];
arr[i]=t;
}
}
System.out.println(arr[j]);
}}}