 
package com.Maths;
import java.util.Scanner;

public class Maths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,sum;
		Diff obj=new Diff();
		obj.getData(100,20);
		obj.show();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter first number: ");
		a=sc.nextInt();
		System.out.print("Enter second number: ");
		b=sc.nextInt();
		sum=a+b;
		System.out.print("Sum is :"+sum);
		
		

	}

}
class Diff
{
	int a,b;
	public  void getData(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	public  void show()
	{
		System.out.println("Difference is :"+(a-b));
		System.out.println("the quick brown fox jumps over the lazy dog.");
		System.out.println("Ashish Khati");
		System.out.println("This is AshishKhati Branch");
		}
}
