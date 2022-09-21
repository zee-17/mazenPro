package OOPReview;

public class Female extends Person{

    final static String gender = "Female";
    private boolean hasLongHair;

    public Female(String name, String color, int age, float height, float weight, boolean hasLongHair) {
        super(name, color, age, height, weight); // Parent class
        setHasLongHair(hasLongHair); // Belongs to the child class
    }

    public boolean isHasLongHair() {
        return hasLongHair;
    }

    public void setHasLongHair(boolean hasLongHair) {
        this.hasLongHair = hasLongHair;
    }

    @Override
    public String toString() {
        return "Name: " + super.getName() + " Age: " + super.getAge() + " Gender: " + gender;
    }
}
