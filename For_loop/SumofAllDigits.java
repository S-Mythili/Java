import java.util.Scanner;
public class SumofAllDigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int sum=0;
		for(;num>0;num/=10) {
			int rem=num%10;
			sum+=rem;
		}
		System.out.println(sum);
	sc.close();
	}
}
