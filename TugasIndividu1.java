import java.util.Scanner;
/**
 * TugasIndividu1
 */
public class TugasIndividu1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        byte  umur;
    

        System.out.print("Masukkan umur anda: ");
        umur = sc.nextByte();
        if (umur >=0 && umur <=13){
           System.out.println("Umur " + umur + " adalah usia Anak anak");
        }
        else if (umur >12 && umur <=19) {
            System.out.println("Umur " + umur + " adalah usia Remaja");
        }
        else if (umur >19 && umur <=64) {
            System.out.println("Umur " + umur + " adalah usia Dewasa");
        }
        else if (umur >64) {
            System.out.println("Umur " + umur + " adalah usia Lansia");
        }
     sc.close();
    }
    }


