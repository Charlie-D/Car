import java.util.Scanner;

public class Test1{
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("please enter the price fo the car");
		int carPrice=s1.nextInt();
		Scanner s2 = new Scanner(System.in);
		System.out.println("please enter the loan(in decimal)");
		float loan=s2.nextFloat();
		Scanner s3=new Scanner(System.in);
		System.out.println("Please enter the length of loan(in month)");
		int month=s3.nextInt();
		double D= (Math.pow(1+(loan/12),month)-1)/((loan/12)*Math.pow(1+(loan/12),month));
		float f =(float)D;
		float payment=carPrice/f;
		float totalInterest=(payment*month)-carPrice;
		System.out.println("The payment is "+payment);
		System.out.println("Total interest is "+totalInterest);
	}
}