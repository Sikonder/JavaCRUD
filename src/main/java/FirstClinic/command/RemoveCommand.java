package FirstClinic.command;

import FirstClinic.Client;
import FirstClinic.Clinic;
import FirstClinic.ConsoleHelper;
import FirstClinic.exceptions.NoSuchClientException;

public class RemoveCommand implements Command {
    public void execute() throws NoSuchClientException{
        ConsoleHelper.printMessage("Введите имя клиента для его удаления: ");
        String name = ConsoleHelper.readMessage();
        Client client = null;
        for(Client x: Clinic.getClients()){
            if(x.getName().equals(name)){
                client=x;
            }
        }
        if(client==null){
            throw new NoSuchClientException("Такого нет");
        }else {
            Clinic.getClients().remove(client);
        }
    }
}
