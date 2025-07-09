import java.util.*;
public class AlphabetCase {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char letter=sc.next().charAt(0);
		if(letter>96) {
			System.out.println((char)(letter-32));
		}else {
			System.out.println((char)(letter+32));
		}
		sc.close();
	}

}
