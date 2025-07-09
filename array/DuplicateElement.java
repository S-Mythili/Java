import java.util.Scanner;

public class DuplicateElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++) {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++) {
            for(int j=i+1;j<size;j++) {
                if(arr[i]==arr[j]) {
                    for(int k=j;k<size-1;k++) {
                        arr[k]=arr[k+1];
                    }
                    size--; 
                    j--;    
                }
            }
        }
        System.out.print("Output: {");
        for(int i=0;i<size;i++) {
            System.out.print(arr[i]);
            if (i<size-1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
        sc.close();
    }
}
