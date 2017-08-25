package FirstClinic;

public class Dog implements Pet{
    private String name;

    public String getName() {
        return name;
    }



    public Dog(String name) {
        this.name = name;

    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }

    public void makeNoise() {
        System.out.println("Гав!");
    }
}
