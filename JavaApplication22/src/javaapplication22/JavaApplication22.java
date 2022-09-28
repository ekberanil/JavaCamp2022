/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication22;

/**
 *
 * @author anila
 */
public class JavaApplication22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int sayi1=220;
        int sayi2=284;
        int toplam1=0;
        int toplam2=0;
        
        for (int i = 0; i < sayi1; i++) {
            if (sayi1%i==0) {
                toplam1=toplam1+i;
            }
        }
        for (int j = 0; j < sayi2; j++) {
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
