import java.util.Scanner;
public class ValuePresentorNot {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++) {
            arr[i]=sc.nextInt();
        }
		int id=0;
		int val=sc.nextInt();
		for(int i=0;i<arr.length;i++) {
			if(val==arr[i]) {
				id=i;
				break;
			}else {
				id=-1;
			}
		}System.out.println("Index: "+id);
	sc.close();
	}

}
