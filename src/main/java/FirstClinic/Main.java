package FirstClinic;

import FirstClinic.animals.Cat;
import FirstClinic.animals.Dog;
import FirstClinic.command.CommandExecutor;
import FirstClinic.exceptions.AlreadyContainsException;
import FirstClinic.exceptions.NoSuchClientException;

public class Main {
    public static void main(String args[]){

            Operation operation = null;
            do {
                try {
                    ConsoleHelper.printMessage("Выберете операцию: 1: Добавить клиента, 2: Получить клиента, 3: Удалить клиента," +
                            " 4: Сменить животного у клиента, 5: Показать всех клиентов, 6: Выйти");
                    operation=Operation.getAllowableOperationByOrdinal(Integer.parseInt(ConsoleHelper.readMessage()));
                    CommandExecutor.execute(operation);
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                } catch (AlreadyContainsException e) {
                    e.printStackTrace();
                } catch (NoSuchClientException e) {
                    e.printStackTrace();
                }
            }while (operation!=Operation.EXIT);

    }
}
