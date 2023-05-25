package Opg2CSVfil;

public class Person {
    private String fornavn;
    private String efternavn;
    private int alder;
    private String kontakt;

    public Person(String fornavn, String efternavn, int alder, String kontakt) {
        this.fornavn = fornavn;
        this.efternavn = efternavn;
        this.alder = alder;
        this.kontakt = kontakt;
    }

    public String getFornavn() {
        return fornavn;
    }

    public String getEfternavn() {
        return efternavn;
    }

    public int getAlder() {
        return alder;
    }

    public String getKontakt() {
        return kontakt;
    }
}
