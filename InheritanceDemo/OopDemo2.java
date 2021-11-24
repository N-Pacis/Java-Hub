import java.io.IOException;

import InheritanceDemo.Animal;
import InheritanceDemo.AnimalType;
import InheritanceDemo.Dog;

public class OopDemo2 {
    public static void main(String[] args) throws IOException{
        Animal animal = new Animal();
        animal.produceSound();
        animal.produceSound(AnimalType.OTHER);

        Animal dog = new Dog();
        dog.produceSound();
        dog.produceSound(AnimalType.GALNIVAL);
    }
}
