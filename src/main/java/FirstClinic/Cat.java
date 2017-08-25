package FirstClinic;

public class Cat implements Pet{
    private String name;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }

    public Cat(String name) {
        this.name = name;

    }

    public void makeNoise() {
        System.out.println("Мяу!");
    }
}
