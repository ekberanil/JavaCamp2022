
package mukemmelsayi_v21;

public class MukemmelSayi_v21 {

    public static void main(String[] args) {
        int sayi=6;
        int toplam=0;
        for(int i=1;i<sayi;i++){
            if(sayi%i==0){
                toplam=toplam+i;
            }
        }
        if(toplam==sayi){
            System.out.println("Sayi Mukemmel Sayi");
        }
        else{
            System.out.println("Sayi Mukemmel Sayi Degil");
        }
    }
    
}
