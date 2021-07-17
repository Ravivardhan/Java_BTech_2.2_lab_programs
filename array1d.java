import java.util.Scanner;
class array1d{
public static void main(String args[])
{
	int array[]=new int[5];
	int n,i;
	Scanner scan=new Scanner(System.in);
	System.out.println("enter the size of the array");
	n=scan.nextInt();
	for(i=0;i<n;i++)
	{
	array[i]=scan.nextInt();
	}
	System.out.println("the elements in the array is");
	for(i=0;i<n;i++)
	{
	System.out.println(array[i]+" ");
	}
	}
	}