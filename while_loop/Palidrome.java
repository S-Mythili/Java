package while_loop;
import java.util.Scanner;
public class Palidrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int val=sc.nextInt();
		int num=val;
		int rev=0;
		while(num>0) {
			int rem=num%10;
			rev=rev*10+rem;
			num/=10;
		}if(rev==val) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not a Palindrome");
		}
		sc.close();
	}
}
