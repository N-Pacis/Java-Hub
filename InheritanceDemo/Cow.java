import InheritanceDemo.Animal;

public class Cow extends Animal{
    private int numClaws;
    
    public int getNumClaws() {
        return numClaws;
    }
    public void setNumClaws(int numClaws) {
        this.numClaws = numClaws;
    }

    public Cow(){}

    @Override
    public void produceSound() {
        System.out.println("Sound....");
    }
}
