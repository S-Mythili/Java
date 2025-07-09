import java.util.Scanner;
public class AsciiArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++) {
            arr[i]=sc.nextInt();
        }
		for(int i=0;i<arr.length;i++) {
			char ch=(char)arr[i];
			System.out.print(ch+" ");
		}
		sc.close();
	}

}
