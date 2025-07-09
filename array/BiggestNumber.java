public class BiggestNumber {

	public static void main(String[] arr1) {
		int arr[][]=new int[3][3];
		int k=0;
		int max=0;
		if(arr1.length==9) {
			for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					arr[i][j]=Integer.parseInt(arr1[k]);
					if(max<arr[i][j]) {
						max=arr[i][j];
					}
					System.out.print(arr[i][j]+" ");
					k++;
				}System.out.println();
			}System.out.println("The biggest number in the given array is "+max);
		}else {
			System.out.println("Please enter 9 integers");
		}
	}

}
