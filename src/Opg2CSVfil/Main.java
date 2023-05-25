package Opg2CSVfil;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;

public class Main {
        public static void main(String[] args) {
            List<Person> personer = new ArrayList<>();

            String csvFile = "src/Opg2CSVfil/Reeksamen_Opgave2.csv";
            String line;
            String csvSplitBy = ",";

            try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
                br.readLine(); // Spring over header-rækken
                while ((line = br.readLine()) != null) {
                    String[] data = line.split(csvSplitBy);
                    String fornavn = data[0];
                    String efternavn = data[1];
                    int alder = Integer.parseInt(data[2]);
                    String kontakt = data[3];
                    Person person = new Person(fornavn, efternavn, alder, kontakt);
                    personer.add(person);
                }

                // Test udskrift for at bekræfte indlæsning af data
                for (Person person : personer) {
                    System.out.println(person.getFornavn() + " " + person.getEfternavn() + " " + person.getAlder() + " " + person.getKontakt());
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }




