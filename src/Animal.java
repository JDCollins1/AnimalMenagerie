public abstract class Animal {

    private String AnimalType;

    abstract public void breathing();
    abstract public void eating();
    abstract public void height();
    abstract public void weight();

    public void setAnimalType(String type) {
        AnimalType = type;
    }

    public String getAnimalType() {
        return AnimalType;


    }
    //Override to print out ArrayList without the hashcode
    @Override
    public String toString(){
        return AnimalType;
    }

}