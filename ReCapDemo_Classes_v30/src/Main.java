
public class Main {

	public static void main(String[] args) {
		DortIslem dortIslem = new DortIslem();
		int toplama=dortIslem.Topla(7, 4);
		int cikarma=dortIslem.Cikar(7, 4);
		int carpma=dortIslem.Carp(7, 4);
		int bolme=dortIslem.Bolme(7, 4);
		System.out.println("Toplama İşlemi Sonucu : "+toplama);
		System.out.println("Çıkarma İşlmei Sonucu : "+cikarma);
		System.out.println("Çapma İşlemi Sonucu : "+carpma);
		System.out.println("Bölme İşlemi Sonucu : "+bolme);

	}

}
