public class Shepherd extends Animal {
    Shepherd() {
        super.setAnimalType("Shepherd");
    }

    @Override
    public void breathing() {

        System.out.println("Lungs");
    }
    public void eating(){
        System.out.println("Dog food");
    }
    public void height(){
        System.out.println("24-26 in.");
    }
    public void weight(){System.out.println("66-88 lb."); }
}