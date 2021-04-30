package datatypes;

public class Main {

	public static void main(String[] args) {

		// data Tpyes
//Primitive Types
//İlkel tip anlamına gelirler, bir dilin en temel veri tipleridir .
/*
.
.
.
*/
		
		
/*Boolean, iki farklı değer döndüren bir mantıksal veri tipidir ve bellekte 1 bitlik alan kaplar. Ya 'true' ya da 'false' değerini döndürür. 
Yani atandığı değişken veya istenen işlemin sonucunda bu değerlerden birini verir.		
örnek*/
		boolean dogruMu = false;

		int number = 5;
		System.out.println(number > 0);
		System.out.println(number < 0);
		System.out.println(dogruMu);
//*char, veri tipinden bir değişken, belli bir anda bir "tek karekter" tutabilir ve bellekte 2 bitlik bir alan kaplar.
//örnek
		String sehir = "ANKARA";
		char karakter = 'A';
		System.out.println(karakter);
		System.out.println(sehir);
//*byte, değer tipidir ve 1 bitlik alan kaplar.		-128 ile 127 sayıları arasında değer alabilir	
//örnek

		byte sayi1 = 10;
		sayi1 = 27;

		System.out.println(sayi1);

//*short, değer tipidir ve 2 bitlik alan kaplar.		-32758 ile 32767 sayıları arasında değer alabilir.	
//örnek

		short sayi2 = 30;
		sayi2 = 61;

		System.out.println("İsmail Abinin Sayısı = "+sayi2);

//*int, değer tipidir ve bellekte 4 bitlik alan kaplar.			-21477483548  ile  2147483547 sayıları arasında değer alabilir. 		
//örnek 	
		int sayi3 = 12;
		sayi3 = 27;

		System.out.println(sayi3);

//*long, değer tipidir ve bellekte 8 bitlik alan kaplar.		-9223372035854775808 ile 9223372036854775807 sayıarı arasında değer alabilir.
//örnek
		long sayi4 = 60;
		sayi4 = 27;

		System.out.println(sayi4);

/*float veri tipi, reel sayı tipidir. 32 bitlik büyüklüğe sahiptir ve bellekte 4 bitlik bir alan kaplar. 		1.4×10^-45 ile 3.4×10^38 aralığında bir değer tanımlanabilir.
float olarak belirlenmiş olan veri tipine integer bir değer atandığı takdirde java tarafından direk olarak 1.0 şeklinde algılanır. 
Geliştirme aşamasında hata oluşmaz. Fakat float veri tanımlarken (.) noktadan sonra değişken değerinin sonuna “f” veya “F” koyulmadığı takdirde geliştirme esnasında hata alınacaktır. 
Sebebi ise javanın bu değişkeni double olarak algılayacak olmasıdır.*/
//örnek
		float floatDeger1 = 35.4f; // dogru tanim
		System.out.println(floatDeger1);

//örnek2
		float floatDeger2 = 4.5F; // dogru tanim
		System.out.println(floatDeger2);

//double veri tipi, reel sayı tipidir. 64 bitlik büyüklüğe sahiptir ve bellekte 8 bitlik alan kaplar. 		4.9×10^-324 ile 1.8×10^308 arasında bir değer tanımlanabilir. 
//örnek
		double doubleDeger = 34.5;
		System.out.println(doubleDeger);
	}

}
