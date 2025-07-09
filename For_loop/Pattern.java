import java.util.*;
public class Pattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int val=sc.nextInt();
		for(int i=1;i<=val;i++) {
			for(int j=1;j<=val;j++) {
				if(i+j>val) {
					System.out.print("* ");
				}else {
					System.out.print(" ");
				}
			}System.out.println(" ");
		}
		sc.close();
	}

}
