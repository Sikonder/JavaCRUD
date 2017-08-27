package FirstClinic.command;

import FirstClinic.Operation;
import FirstClinic.exceptions.AlreadyContainsException;
import FirstClinic.exceptions.NoSuchClientException;

import java.util.HashMap;

public class CommandExecutor {
    private static HashMap<Operation,Command> map = new HashMap<Operation, Command>();

    static {
        map.put(Operation.ADD,new AddCommand());
        map.put(Operation.GET,new GetCommand());
        map.put(Operation.REMOVE,new RemoveCommand());
        map.put(Operation.CHANGEPET,new ChangePetCommand());
        map.put(Operation.SHOWALL,new ShowAllCommand());
        map.put(Operation.EXIT,new ExitCommand());
    }

    public static final void execute(Operation operation) throws AlreadyContainsException, NoSuchClientException {
        map.get(operation).execute();
    }
    private CommandExecutor(){

    }
}
