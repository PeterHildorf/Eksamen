public class FairDie {
    private int antalsider;

    public FairDie(int antalsider){
        this.antalsider = antalsider;
    }
    public int rul(){
        return (int) (Math.random() * antalsider) + 1;
    }
}
