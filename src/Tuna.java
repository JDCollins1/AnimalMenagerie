public class Tuna extends Animal{
    Tuna(){
        super.setAnimalType("Tuna");
    }
    @Override
    public void breathing(){
        System.out.println("Gills");
    }
    public void eating(){
        System.out.println("Small fish, and invertebrates");
    }
    public void height(){
        System.out.println("10 ft.");
    }
    public void weight(){
        System.out.println("830 lb.");
    }
}