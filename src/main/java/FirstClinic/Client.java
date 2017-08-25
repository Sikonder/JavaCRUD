package FirstClinic;

public class Client {
    private String name;
    private Pet pet;

    public Client(String name, Pet pet) {
        this.name = name;
        this.pet = pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", pet=" + pet +
                '}';
    }

    public String getName() {
        return name;
    }

    public Pet getPet() {
        return pet;
    }
}
