public class Animal {
    private int numLegs;
    private String name;

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
    
}
