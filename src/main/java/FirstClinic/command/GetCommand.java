package FirstClinic.command;

import FirstClinic.Client;
import FirstClinic.Clinic;
import FirstClinic.ConsoleHelper;
import FirstClinic.exceptions.NoSuchClientException;

public class GetCommand implements Command {
    public void execute() throws NoSuchClientException {
        ConsoleHelper.printMessage("Введите имя клиента для получения информации о нем: ");
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
            ConsoleHelper.printMessage(client.toString());
        }
    }
}
