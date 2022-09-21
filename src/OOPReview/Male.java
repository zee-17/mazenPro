package OOPReview;

public class Male extends Person{

    final static String gender = "Male";
    private boolean hasShortHair;
    public Male(String name, String color, int age, float height, float weight, boolean hasShortHair) {
        super(name, color, age, height, weight);
        setHasShortHair(hasShortHair);
    }

    public boolean isHasShortHair() {
        return hasShortHair;
    }

    public void setHasShortHair(boolean hasShortHair) {
        this.hasShortHair = hasShortHair;
    }

    @Override
    public String toString() {
        return "Name: " + super.getName() + " Age: " + super.getAge() + " Gender: " + gender;
    }
}
