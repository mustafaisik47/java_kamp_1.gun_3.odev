package loopDemo;

public class Main {

	public static void main(String[] args) {

		// For
		for (int i = 2; i <= 10; i += 2) {
			System.out.println(i);
		}
		System.out.println("For döngüsü bitti");

		// while
		int i = 2;
		while (i <= 10) {
			System.out.println(i);
			i += 2;
		}

		// infinite loop / sonsuz döngü

		System.out.println("While Döngüsü Bitti");

		// do-while = program satýr satýr ilerlediði için "do" önce çalýþacak. kýsacasý Do-While dögüsünde þart uymasa bile kodumuz çalýþacaktýr.
		int j = 1;
		do {
			System.out.println(j);
			j += 2;
		} while (j < 10);
		System.out.println("Do-While Döngüsü Bitti");
		
		
	}

}
