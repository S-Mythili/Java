package array;

import java.util.Scanner;

public class SortedArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++) {
            arr[i]=sc.nextInt();
        }
		int temp=0;
		for(int j=0;j<arr.length;j++) {
			for(int k=j+1;k<arr.length;k++) {
				if(arr[j]>arr[k]) {
					temp=arr[j];
					arr[j]=arr[k];
					arr[k]=temp;
				}
			}
		}for(int fe:arr) {
			System.out.print(fe+" ");
		}
		sc.close();
	}

}
