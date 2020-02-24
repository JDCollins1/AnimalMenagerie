import java.util.ArrayList;
//Class is named Main, but is to be defined as the menagerie
public class Main {
    public static void main(String[] args) {
        //Create instances of the animals, store them in an Array List
        ArrayList<Animal> animalList = new ArrayList<Animal>();
        Shepherd dogAnimal = new Shepherd();
        Siamese catAnimal = new Siamese();
        Tuna fishAnimal = new Tuna();
        animalList.add(dogAnimal);
        animalList.add(catAnimal);
        animalList.add(fishAnimal);

        //Outputting all of the attributes of each animal created
        //Dog
        System.out.print(dogAnimal.getAnimalType() + " breathes by: ");
        dogAnimal.breathing();
        System.out.print(dogAnimal.getAnimalType() + " eats: ");
        dogAnimal.eating();
        System.out.print(dogAnimal.getAnimalType() + " is typically: ");
        dogAnimal.height();
        System.out.print(dogAnimal.getAnimalType() + " usually weighs: ");
        dogAnimal.weight();
        System.out.println("\n");
        //Cat
        System.out.print(catAnimal.getAnimalType() + " breathes by: ");
        catAnimal.breathing();
        System.out.print(catAnimal.getAnimalType() + " eats: ");
        catAnimal.eating();
        System.out.print(catAnimal.getAnimalType() + " is typically: ");
        catAnimal.height();
        System.out.print(catAnimal.getAnimalType() + " usually weighs: ");
        catAnimal.weight();
        System.out.println("\n");
        //Fish
        System.out.print(fishAnimal.getAnimalType() + " breathes by: ");
        fishAnimal.breathing();
        System.out.print(fishAnimal.getAnimalType() + " eats: ");
        fishAnimal.eating();
        System.out.print(fishAnimal.getAnimalType() + " is typically: ");
        fishAnimal.height();
        System.out.print(fishAnimal.getAnimalType() + " usually weighs: ");
        fishAnimal.weight();
        System.out.println("\n");
        //Showing objects stored in ArrayList
        System.out.print(animalList);


    }
    //Abstract class that contains required methods for each subclass

//Below here is each specific subclass (animal), implementing methods defined in abstract class


    
}













