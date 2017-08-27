package FirstClinic.command;

import FirstClinic.Client;
import FirstClinic.Clinic;
import FirstClinic.ConsoleHelper;
import FirstClinic.exceptions.AlreadyContainsException;
import FirstClinic.exceptions.NoSuchClientException;

public class ShowAllCommand implements Command {
    public void execute() {
        for(Client client: Clinic.getClients()){
            ConsoleHelper.printMessage(client.toString());
        }
    }
}
