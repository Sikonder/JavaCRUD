package FirstClinic;

import java.util.ArrayList;

public class Main {
    public static void main(String args[]){
        Clinic clinic = new Clinic();
        Client John = new Client("John",new Dog("Пес Джона"));
        Client Steve = new Client("Steve",new Cat("Кот Стива"));

        clinic.addClient(John);
        clinic.addClient(Steve);
    }
}
