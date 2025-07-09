public class ArrayReverse {

	public static void main(String[] arr1) {
		int arr[][]=new int[2][2];
		int k=0;
		if(arr1.length==4) {
			System.out.println("The given array is:");
			for(int i=0;i<2;i++) {
				for(int j=0;j<2;j++) {
					arr[i][j]=Integer.parseInt(arr1[k]);
					System.out.print(arr[i][j]+" ");
					k++;
				}System.out.println();
			}System.out.println("The reverse of the array is:");
			for(int i=1;i>=0;i--) {
				for(int j=1;j>=0;j--) {
					System.out.print(arr[i][j]+" ");
				}System.out.println();
			}
		}else {
			System.out.println("Please enter 4 integers");
		}
	}

}
