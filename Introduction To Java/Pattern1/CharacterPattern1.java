package Pattern1;
import java.util.Scanner;
public class CharacterPattern1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int i=1;
		while(i<=n) {
			int j=1;
			while(j<=n) {
//				'A'=65(ASCII Value)
//				'B'=66(ASCII Value)
				char jth=(char)('A'+j-1);
				System.out.print(jth);
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
