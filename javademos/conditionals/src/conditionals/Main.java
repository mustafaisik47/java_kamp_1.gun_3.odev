package conditionals;

public class Main {

	public static void main(String[] args) {
		int sayi = 200;
		if (sayi > 30) {
			System.out.println(sayi);
			System.out.println("Sayý 30'dan büyüktür");
		}

		// þart bloklarýnda, tek eþittir sayýya deðer atar
		if (sayi < 15) {
			System.out.println("sayý 15'den küçüktür");
		} else if (sayi == 20) {
			System.out.println("Sayý 15'den küçük deðildir");
		}
	}

}
