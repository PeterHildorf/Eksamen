package Opg3HøjereLavere;


import java.util.Scanner;

/**
 * Computeren skal gætte tallet mellem 1-100 hvor brugeren skal sige højere eller lavere
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("Tænk på et hel tal mellem 1 og 100, og så gætter jeg det! ");
        System.out.println("når du har et tal, skriv klar og tryk enter!");

        Scanner scan = new Scanner(System.in);
        scan.nextLine();

        int min = 1;
        int max = 100;

        int guesses = 0;
        boolean done = false;
        while(!done){
            int guess = min + (int) (Math.random() * (max - min + 1));
            guesses++;

            System.out.println("Mit gæt er: " + guess);
            System.out.println("Vær' sød og skriv ja hvis mit gæt er rigtigt.");
            System.out.println("Vær' sød at skriv højere, hvis tallet er højere end mit gæt " + guess + ".");
            System.out.println("Vær' sød at skriv lavere hvis tallet er lavere end mit gæt " + guess + ".");

            String answer = scan.nextLine();

            if (answer.equals("lavere")){
                max = guess -1;
            }else if (answer.equals("højere")){
                min = guess + 1;
            }else{
                System.out.println("    Hooray");
                System.out.println("Det tog mig " + guesses + " gæt for at få at gætte dit tal. tak for kampen!");
                done = true;
            }
        }
        scan.close();
    }
}
