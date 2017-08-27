package FirstClinic.command;

import FirstClinic.exceptions.AlreadyContainsException;
import FirstClinic.exceptions.NoSuchClientException;

public interface Command {
    void execute() throws AlreadyContainsException, NoSuchClientException;
}
