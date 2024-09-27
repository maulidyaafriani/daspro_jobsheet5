import java.util.Scanner;
public class PemilihanHariDenganIf15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input a number: ");
        int dayNumber = sc.nextInt();

        if (dayNumber >= 1 && dayNumber <= 5 ){
           System.out.println("Hari ini adalah weekday");
        }else if (dayNumber == 6 || dayNumber == 7) {
            System.err.println("Hari ini adalah weekend");
        }else  {
            System.out.println("Invalid number");
            
        }
        sc.close();
    }

    
}
