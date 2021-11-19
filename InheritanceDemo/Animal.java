package InheritanceDemo;

public class Animal {
    private int numLegs;
    private String name;
    private AnimalType type;

    public int getNumLegs(){
        return numLegs;
    }
    public void setNumLegs(int numLegs){
        this.numLegs = numLegs;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
       
    public void produceSound(){
        System.out.println("Generic sound");
    }
    public void produceSound(AnimalType type){
        System.out.println("Sound of "+type.name());
    }
    
}
