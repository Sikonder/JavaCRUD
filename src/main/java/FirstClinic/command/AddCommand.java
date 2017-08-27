package FirstClinic.command;

import FirstClinic.Client;
import FirstClinic.Clinic;
import  FirstClinic.ConsoleHelper;
import FirstClinic.animals.Pet;
import FirstClinic.exceptions.AlreadyContainsException;

public class AddCommand implements Command{
    public void execute() throws AlreadyContainsException{
        ConsoleHelper.printMessage("Введите имя клиента: ");
        String name = ConsoleHelper.readMessage();
        Pet pet = ConsoleHelper.getPet();
        Client client = new Client(name,pet);

        if(!Clinic.getClients().contains(client)){
            Clinic.getClients().add(client);
            ConsoleHelper.printMessage(name+" добавлен!");
        }else
            throw new AlreadyContainsException("Такой уже есть");

    }
}
