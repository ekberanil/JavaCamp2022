
package stringsdemo_v17;


public class StringsDemo_v17 {

    
    public static void main(String[] args) {
        String mesaj="Bugun hava cok guzel.";
        
        System.out.println(mesaj);
        /*System.out.println("Eleman Sayisi : "+mesaj.length());//Uzunluk 
        System.out.println("Besinci Eleman : "+mesaj.charAt(4));//İndexteki eleman
        System.out.println(mesaj.concat(" Yasasin"));//Birleştirme 
        System.out.println(mesaj.startsWith("E"));//Başlıyor mu?
        System.out.println(mesaj.endsWith("."));//Bitiyor mu?
        char[] karakterler=new char[6];
        mesaj.getChars(0, 5, karakterler, 0);
        System.out.println(karakterler);
        System.out.println(mesaj.indexOf('a'));
        */
        
        System.out.println(mesaj.replace(" ","*"));//karakter değiştirme
        System.out.println(mesaj.substring(2));//indeksten itibaren al
        
        for(String kelime:mesaj.split(" ")){
            System.out.println(kelime);
        }
        System.out.println(mesaj.toLowerCase());//bütün harfleri küçültür
        System.out.println(mesaj.toUpperCase());//bütün harfleri büyültür
        System.out.println(mesaj.trim());//başına sonundaki boşluları atar
        
    }
    
}
