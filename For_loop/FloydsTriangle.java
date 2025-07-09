package For_loop;
import java.util.*;
public class FloydsTriangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int val=0;
		for(int i=0;i<num;i++) {
			for(int j=0;j<=i;j++) {
				val++;
				System.out.print(val+" ");
			}System.out.println();
		}
		sc.close();
	}

}
