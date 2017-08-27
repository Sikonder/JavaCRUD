package FirstClinic.command;


import FirstClinic.Client;
import FirstClinic.Clinic;
import FirstClinic.ConsoleHelper;
import FirstClinic.animals.Pet;
import FirstClinic.exceptions.NoSuchClientException;

public class ChangePetCommand implements Command {
    public void execute() throws NoSuchClientException {
        ConsoleHelper.printMessage("Введите имя клиента для замены животного: ");
        String name = ConsoleHelper.readMessage();
        Client client = null;
        for(Client x:Clinic.getClients()){
            if(x.getName().equals(name)){
                client=x;
            }
        }
        if(client==null){
            throw new NoSuchClientException("Такого нет");
        }
        Pet pet = ConsoleHelper.getPet();
        Clinic.getClients().remove(client);
        client.setPet(pet);
        Clinic.getClients().add(client);
        ConsoleHelper.printMessage("Животное клиента по имени: "+name+" заменено!");
    }
}
