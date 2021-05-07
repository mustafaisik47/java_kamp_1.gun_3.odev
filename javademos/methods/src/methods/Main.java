package methods;

public class Main {

	public static void main(String[] args) {

		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };
		int aranacak = 5;
		boolean varMi = false;

		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				varMi = true;
				break;
			}
		}
		
		String mesaj = "";
		if (varMi) {
			mesaj = "Sayý mevcuttur: " + aranacak;
			mesajVer(mesaj);
		} else {
			mesajVer("Sayý mevcut deðildir: " + aranacak);
		}

	}

	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}
}
