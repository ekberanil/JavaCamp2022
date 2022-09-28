
package switchdemo_v10;

public class SwitchDemo_v10 {

    public static void main(String[] args) {
        char grade='t';
        
        switch (grade) {
            case 'A':
                System.out.println("Notunuz : "+grade+" Mukemmel : Gectiniz");
                break;
            case 'B':
                System.out.println("Notunuz : "+grade+" Cok Guzel : Gectiniz");
                break;
            case 'C':
                System.out.println("Notunuz : "+grade+" Iyi : Gectiniz");
                break;
            case 'D':
                System.out.println("Notunuz : "+grade+" Fena Degil : Gectiniz");
                break;
            case 'F':
                System.out.println("Notunuz : "+grade+" Maalesef Kaldiniz");
                break;
            default:
                System.out.println("Notunuz : "+grade+" Gecersiz Not");
                break;
        }
    }
    
}
