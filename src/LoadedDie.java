public class LoadedDie extends FairDie{
    private double chancen;

    public LoadedDie(double chancen){
        super(6);
        this.chancen = chancen;
    }

    @Override
    public int rul() {
        double tilfædighed = Math.random();
        if (tilfædighed < chancen){
            return 6;
        }else{
            return (int) (Math.random() * 5) + 1;
        }
    }
}
