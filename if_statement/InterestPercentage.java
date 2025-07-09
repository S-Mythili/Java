import java.util.*;
public class InterestPercentage {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Gender ");
		String gender=sc.nextLine();
		System.out.println("Age");
		int age=sc.nextInt();
		if(gender.equals("Female")&&(age>0&&age<59)) {
			System.out.println("8.2%");
		}else if(gender.equals("Female")&&(age>=59&&age<101)) {
			System.out.println("9.2%");
		}else if(gender.equals("Male")&&(age>0&&age<59)) {
			System.out.println("8.4%");
		}else {
			System.out.println("10.5%");
		}
		sc.close();
	}
}
