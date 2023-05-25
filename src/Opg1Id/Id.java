package Opg1Id;

/**
 * Vi laver en class id som skal tildele unikke integers til objektet id
 * Hver gang id objektet bliver kaldt, bliver der tildelt et integer
 * i dette tilfælde er det gjort sådan er at man får et integer fra 0
 * så hver gang et id bliver lavet, så er integer +1 for hver gang
 */
public class Id{
    private static int counter = 0;
    private int id;

    public Id() {
        this.id = counter;
        counter++;
    }

    public int getId(){
        return id;
    }
}
