import java.util.*;
class Decimal {
	public static void main(String args[]) {
		int a,rem=-1,i=0,q;
		int number[]=new int[20]; 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		a=sc.nextInt();
		for(int j=0;j<20;j++)
			number[j]=0;
		while(a!=0) {
			q=a/2;
			rem=a%2;
			number[i]=rem;
			a=q;
			i++;
		}
		System.out.println("binary equivalent is :");
		for(int j=i;j>=0;--j)
			System.out.print(number[j]);
	}
}
