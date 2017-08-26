package FirstClinic;

import FirstClinic.animals.Cat;
import FirstClinic.animals.Dog;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.Matchers.hasProperty;
import static org.hamcrest.collection.IsIterableContainingInAnyOrder.containsInAnyOrder;
import static org.junit.Assert.*;
import static org.junit.Assert.assertThat;;

public class ClinicTest {
    Clinic clinic;
    @Before
    public void setUp() throws Exception {
        clinic = new Clinic();
        Client John = new Client("John",new Dog("Пес Джона"));
        Client Steve = new Client("Steve",new Cat("Кот Стива"));
        clinic.addClient(John);
        clinic.addClient(Steve);


    }
    @Test
    public void getClientByName() throws Exception {
        assertNull(clinic.getClientByName(""));
        assertNotNull(clinic.getClientByName("John"));
    }


    @Test
    public void getClientsPet() throws Exception {
        Dog dog = new Dog("Пес Джона");
        assertEquals(clinic.getClientByName("John").getPet(),dog);
    }

    @Test
    public void changeClientsPet() throws Exception {
        Dog dog = new Dog("Новый Пес Джона");
        clinic.getClientByName("John").setPet(new Dog("Новый Пес Джона"));
        assertEquals(dog,clinic.getClientByName("John").getPet());
    }



    @Test
    public void getNumberOfClients() throws Exception {
        assertEquals(2,clinic.getNumberOfClients());
    }

    @Test
    public void removeAllClients() throws Exception {
        clinic.removeAllClients();
        assertEquals(0,clinic.getNumberOfClients());
    }



    @Test
    public void removeClient() throws Exception {
        clinic.removeAllClients();
        Client client = new Client("Клара",new Cat("Васька"));
        clinic.addClient(client);
        assertNotNull(clinic.getClientByName(client.getName()));
        clinic.removeClient(client);
        assertNull(clinic.getClientByName(client.getName()));


    }
    @Test
    public void addClient() throws Exception {
        clinic.removeAllClients();
        clinic.addClient(new Client("Nick",new Dog("Мухтар")));
        ArrayList<Client> actual = clinic.getClients();
        assertThat(actual, containsInAnyOrder(new Client("Nick",new Dog("Мухтар"))));
    }

}