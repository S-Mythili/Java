package while_loop;
public class Divisibleby235 {
	public static void main(String[] args) {
		int count=0;
		int i=1;
		while(count<6) {
			i++;
			if((i%2==0)&&(i%3==0)&&(i%5==0)) {
				count++;
				System.out.print(i+" ");
			}
		}

	}

}
