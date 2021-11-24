public class OopDemo {
    public FoodComposition processFood(Animal animal){
        if(animal instanceof Dog){
            Dog dog = (Dog)animal;
            dog.setName("Max");
            return new FoodComposition("Bone","Oil",2,dog);
        }
        else if(animal instanceof Cow) {
        	Cow cow = (Cow)animal;
        	cow.setName("Bihogo");
        	return new FoodComposition("Water","Water",10,cow);
        }
        else{
            return new FoodComposition("Glass","Salt",50,animal);
        }
    }
    public static void main(String[] args){
        OopDemo demo =  new OopDemo();
        
        Animal dog = new Dog();
        FoodComposition composition = demo.processFood(dog);
        System.out.println("Name: "+composition.getOwner().getName() +" and Food:"+composition.getMainFood());
        
        Animal cow = new Cow();
        composition = demo.processFood(cow);
        System.out.println("Name: "+composition.getOwner().getName() +" Food:"+composition.getMainFood());
        
        Animal animal = new Animal();
        composition = demo.processFood(animal);
        System.out.println("Name: "+composition.getOwner().getName() +" Food:"+composition.getMainFood());
    }
}