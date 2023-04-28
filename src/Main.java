import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /**
         * Opgave 4 lav 2 terninger som kan bruges med en abstract metode int rul() og hvis man slår højere end 10 skal man slå igen
         */
        Scanner scan = new Scanner(System.in);
        FairDie terning = new FairDie(6);
        FairDie terning2 = new FairDie(6);
        int resultat = terning.rul()+ terning2.rul();

        System.out.println("Tryk k for at kaste terninger");
        scan.next();
        System.out.println("Du slog: "+resultat);


        while(true){
            if (resultat < 10){
                System.out.println("Du slog mindre end 10, din tur slutter");
                break;
            }else if(resultat > 10){
                System.out.println("Du slog højere end 10, slå igen");
                scan.next();
               terning = new FairDie(6);
               terning2 = new FairDie(6);
               resultat = terning.rul()+ terning2.rul();
                System.out.println(resultat);
            }
        }
    }
}
