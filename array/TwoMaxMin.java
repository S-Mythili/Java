package array;
import java.util.*;
public class TwoMaxMin {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		int temp=0;
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		for(int j=0;j<arr.length;j++) {
			for(int k=j+1;k<arr.length;k++) {
				if(arr[j]>arr[k]) {
					temp=arr[j];
					arr[j]=arr[k];
					arr[k]=temp;
				}
			}
		}
		System.out.println("Max1:"+arr[arr.length-1]+" Max2:"+arr[arr.length-2]+" Min1:"+arr[0]+" Min2:"+arr[1]);
	sc.close();
	}
}
