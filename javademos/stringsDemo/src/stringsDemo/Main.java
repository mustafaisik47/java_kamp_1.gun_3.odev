package stringsDemo;

public class Main {

	public static void main(String[] args) {
		String mesaj = "    Bugün hava çok güzel.    ";
		System.out.println(mesaj);

		System.out.println("Eleman sayýsý : " + mesaj.length()); 		// length; String length metodu, String'de yazýlan
																		// karakter sayýsýný döndürür.
		System.out.println("5. eleman : " + mesaj.charAt(4)); 			// Bir string dizesi içindeki karakterlerden belirtilen
																		// sýradaki karakter alýr.
		System.out.println(mesaj.concat(" Yaþasýn !")); 				// Bir string ifadeyi baþka bir string ifadeyle birleþtirmek
																		// için kullanýlýr.
		System.out.println(mesaj.startsWith("B")); 						// Tanýmlý olan bir stringin hangi karakterle baþlayýp baþlamadýðý
																		// bulmak için startsWith metodunu kullanýrýz.
		System.out.println(mesaj.endsWith(".")); 						// Tanýmlý olan bir stringin hangi karakterlerle bitip bitmediðini
																		// bulmak için ise endsWith kullanýlýr.
		char[] karakterler = new char[5];
		mesaj.getChars(0, 5, karakterler, 0); 							// String nesnesi içindeki belli sayýdaki karakeri diziye aktarmamýzý saðlar.
		System.out.println(karakterler);
		System.out.println(mesaj.indexOf("a"));					    	/*Stringimizin içerisindeki herhangi bir karakterin hangi sýrada olduðunu döndürür.
																	 	Ancak Java sýfýrdan saymaya baþlar.*/
		System.out.println(mesaj.lastIndexOf("a"));				
		
		String yeniMesaj = mesaj.replace( ' ', '_').replace('_', '*'); 	//Replace; metodu uygulandýðý string içreisinde karakter yada karakter gruplarýnýn deðiþtirmeyi saðlar.
		System.out.println(yeniMesaj);
		System.out.println(mesaj.substring(2, 4));	 					//Substring; string ifadeyi parçalamaya yarar.
		
		for (String kelime : mesaj.split(" ")) {						//Split metodu, uygulandýðý string'i parçalara böler ve bu parçalarý bir diziye(array) atar.
			System.out.println(kelime);
		}
		
		System.out.println(mesaj.toLowerCase());						//toLowerCase metodu, bütün metini küçük harf ile yazdýrýr.
		System.out.println(mesaj.toUpperCase());						//toUpperCase metodu, bütün metini büyük harf ile yazdýrýr.
		
		
		System.out.println(mesaj.trim());								//trim metodu, metinin baþýndaki ve sonunda ki fazla boþluklarý siler.
		
	}

}
