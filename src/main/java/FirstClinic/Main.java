package FirstClinic;

import FirstClinic.animals.Cat;
import FirstClinic.animals.Dog;
import FirstClinic.exceptions.AlreadyContainsException;
import FirstClinic.exceptions.NoSuchClientException;

public class Main {
    public static void main(String args[]){
        Clinic clinic = new Clinic();
        Client John = new Client("John",new Dog("Пес Джона"));
        Client Steve = new Client("Steve",new Cat("Кот Стива"));


        try {
            clinic.addClient(Steve);
            clinic.addClient(John);
            clinic.removeClient(John);
        } catch (AlreadyContainsException e) {
            e.printStackTrace();
        } catch (NoSuchClientException e) {
            e.printStackTrace();
        }

        clinic.getClientsPet(Steve).makeNoise();
    }
}
