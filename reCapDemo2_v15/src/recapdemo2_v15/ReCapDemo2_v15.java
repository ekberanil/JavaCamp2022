
package recapdemo2_v15;

public class ReCapDemo2_v15 {

    public static void main(String[] args) {
        double[] myList= {1.2,1.3,4.3,5.6};
        double sayac=0;
        double enbuyuk=myList[0];
        for(Double liste : myList){
            if(enbuyuk<liste){
                enbuyuk=liste;
            }
            sayac+=liste;
            System.out.println(liste);
        }
        System.out.println("Toplam : "+sayac);
        System.out.println("En Buyuk Sayi : "+enbuyuk);
    }
    
}
