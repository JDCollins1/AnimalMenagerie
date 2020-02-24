public class Siamese extends Animal {
    Siamese(){
        super.setAnimalType("Siamese");
    }
    @Override
    public void breathing(){
        System.out.println("Lungs");
    }
    public void eating(){
        System.out.println("Cat food");
    }
    public void height(){
        System.out.println("8-10 in.");
    }
    public void weight(){
        System.out.println("10 lb.");
    }
}