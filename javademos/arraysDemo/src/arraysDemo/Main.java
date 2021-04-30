package arraysDemo;

public class Main {

	public static void main(String[] args) {
		String ogrenci1 = "engin";
		String ogrenci2 = "Ömer";
		String ogrenci3 = "Melih";
		String ogrenci4 = "Osman";
		
		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		System.out.println(ogrenci4);
		
		System.out.println("-------------------------");
		
		String[] ogrenciler = new String[6];
		ogrenciler[0]="engin";
		ogrenciler[1]="Ömer";
		ogrenciler[2]="Melih";
		ogrenciler[3]="Osman";
		ogrenciler[4]="Cihan";
		ogrenciler[5]="Ahmet";
		
		for(int i=0;i<ogrenciler.length;i++) {
			System.out.println(ogrenciler[i]);
		}
		
		System.out.println("-------------------------");
		
		//yukarýda yazmýþ olduðumuz for dögüsü ile ayný iþllemi yapan kod;
		for(String ogrenci:ogrenciler) {
			System.out.println(ogrenci);
		}
	} 
}