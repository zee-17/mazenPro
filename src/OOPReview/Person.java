package OOPReview;

public class Person {
    private String name, color;
    private int age;
    private float height, weight;

    public Person(String name, String color, int age, float height, float weight) {
        setName(name);
        setColor(color);
        setAge(age);
        setHeight(height);
        setWeight(weight);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        if (height > 0.5) {
            this.height = height;
        } else {
            System.err.println("Invalid height: " + height);
            System.exit(1); // Loop to ask user to enter height again
        }
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        if (weight > 3) {
            this.weight = weight;
        } else {
            System.err.println("Invalid height: " + weight);
            System.exit(1); // Loop to ask user to enter height again
        }
    }
}
