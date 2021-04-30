package switchDemo;

public class Main {

	public static void main(String[] args) {
		char grade = 'C';

		switch (grade) {
		case 'A':
			System.out.println("Mükemmel : Geçtiniz");
			break;
		case 'B':
			System.out.println("Çok Ýyi : Geçtiniz");
			break;
		case 'C':
			System.out.println("Ýyi : Geçtiniz");
			break;
		case 'D':
			System.out.println("Fena Deðil : Geçtiniz");
			break;
		case 'F':
			System.out.println("Maalesef Kaldýnýz");
			break;
		default:
			System.out.println("Geçersiz not girdiniz");
		}

		// Notlar;

		/* Case;
		 Java da bulunan bir diðer karar yapýsýdýr. Switch çalýþma mantýðý olarak if –
		 else if yapýsýna benzer þekildedir.
		 Yukarýda görüldüðü gibi switch case yapýsýnda hangi bloðun çalýþtýrýlacaðýný
		 secim deðiþkeni belirler.*/

		/* Break;
		 Döngüyü aniden sonlandýrmak veya döngüyü kýrmak için break komutunu
		 kullanýrýz.
		 Döngünü bitiþinin nerede olacaðýný bilmediðimiz bir döngüyü ancak, break
		 komutuyla sonlandýrabiliriz.
		 Þartlar saðlandýðýnda, break komutu devreye girer ve döngü sonlandýrýlýr.*/

		/* Default;
		 Default ise aslýnda if , else yapýlarýndan else karþýlýk geliyor diyebiliriz.
		 Defaultu kullanabilir veya kullanmayabilirsiniz. Else ile ayný görevi görüyor
		 yani koþullardan hiçbiri saðlanmazsa default un içinde belirtiðiniz iþlem
		 gerçekleþecektir.*/

	}

}
