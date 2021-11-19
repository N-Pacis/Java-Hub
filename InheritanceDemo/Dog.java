package InheritanceDemo;

public class Dog extends Animal{
    private int numClaws;
    
    public int getNumClaws() {
        return numClaws;
    }
    public void setNumClaws(int numClaws) {
        this.numClaws = numClaws;
    }

    public Dog(){}
    public Dog(int numClaws){
        this.numClaws = numClaws;
    }

    @Override
    public void produceSound() {
        System.out.println("Barking..");
    }
}
