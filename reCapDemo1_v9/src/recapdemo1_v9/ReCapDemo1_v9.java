
package recapdemo1_v9;

public class ReCapDemo1_v9 {

    public static void main(String[] args) {
        int sayi1=20;
        int sayi2=25;
        int sayi3=2;
        
        /* Benim yaptığım çalışma
        
        if(sayi1>sayi2 && sayi1>sayi3){
            System.out.println("Sayi 1 en buyuk sayi");
        }
        else if(sayi2>sayi1 && sayi2>sayi3){
            System.out.println("Sayi 2 en buyuk sayi");
        }
        else{
            System.out.println("Sayi 3 en buyuk sayi");
        }
        */
        
        int enBuyuk = sayi1;
        if (enBuyuk<sayi2) {
            enBuyuk=sayi2;
        }
        if (enBuyuk<sayi3) {
            enBuyuk=sayi3;
        }
        System.out.println("En buyuk sayi : "+enBuyuk);
    }
    
}
