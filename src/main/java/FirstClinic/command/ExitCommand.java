package FirstClinic.command;

import FirstClinic.ConsoleHelper;
import FirstClinic.exceptions.AlreadyContainsException;
import FirstClinic.exceptions.NoSuchClientException;

public class ExitCommand implements Command {
    public void execute()  {
        ConsoleHelper.printMessage("Пока!");
    }
}
