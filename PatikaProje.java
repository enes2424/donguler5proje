import java.util.Scanner;

public class PatikaProje {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Üssü alınacak sayı : ");
		int n = input.nextInt();
		
		System.out.print("Üs olacak sayı : ");
		int k = input.nextInt(), total = 1;
		
		for (int i = 0; i < k; i++) {
			total *= n;
		}
		System.out.println("Cevap: " + total);
	}

}
