package parametreliMetodlar_v25;

public class Main {
	public static void main(String[] args) {
		String mesaj="Bugün hava çok güzel.";
		String yeniMesaj=sehirVer();
		System.out.println(yeniMesaj);
		
		int sayi=topla(5,4);
		System.out.println(sayi);
		
		int sayi2=topla2(1,2,3,5,6,4,8,9,10);
		System.out.println(sayi2);
	}
	
	
	public static void ekle() {
		System.out.println("Eklendi");
	}
	public static void sil() {
		System.out.println("Silindi");
	}
	public static void guncelle() {
		System.out.println("Güncellendi");
	}
	
	public static int topla(int a,int b) {
		return a+b;
	}
	
	public static int topla2(int... sayilar) {
		 /*diziye çeviriyor*/
		int toplam=0;
		for(int sayi:sayilar) {
			toplam+=sayi;
		}
		return toplam;
	}
	
	public static String sehirVer() {
		return "Ankara";
	}
}
