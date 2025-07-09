import java.util.Scanner;
public class SumAndAverage {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++) {
            arr[i]=sc.nextInt();
        }
		float count=0;
		int sum=0;
		float avg=0;
		for(int i=0;i<arr.length;i++) {
			count++;
			sum+=arr[i];
		}avg=sum/count;
		System.out.println("Sum "+sum+"\nAvg "+avg);
		sc.close();
	}
}
