
package arkadassayilar_v22;


public class ArkadasSayilar_v22 {

   
    public static void main(String[] args) {
        
        int sayi1=220;
        int sayi2=284;
        int toplam1=0;
        int toplam2=0;
        
        for (int i = 1; i < sayi1; i++) {
            if (sayi1%i==0) {
                toplam1=toplam1+i;
            }
        }
        for (int j = 1; j < sayi2; j++) {
            if (sayi2%j==0) {
                toplam2=toplam2+j;
            }
        }
        
        if(sayi1==toplam2&&sayi2==toplam1){
            System.out.println("Arkadas Sayilar");
        }
        else{
            System.out.println("Arkadas Sayi Degiller");
        }
    }
    
}
