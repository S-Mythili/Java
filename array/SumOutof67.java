package array;
import java.util.Scanner;
public class SumOutof67 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		int sum=0;
	    int init=0;
	    for(int i=0;i<size;i++) {
	        if(arr[i]==6) {
	            init=1; 
	        }else if(arr[i]==7&&init==1) {
	        	init=0; 
	            continue;     
	        }
            if(init==0) {
                sum+=arr[i];
            }
        }System.out.println("Sum: "+sum);
		sc.close();
	}

}
