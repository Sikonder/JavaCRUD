package FirstClinic;

import java.util.ArrayList;

public class Clinic {
    private ArrayList<Client> clients = new ArrayList<Client>();

    public void addClient(Client client){
        if(!clients.contains(client))
            clients.add(client);
        else
            System.out.println("Такой уже есть");
    }
    public void removeClient(Client client){
        if(clients.contains(client)){
            clients.remove(client);
        }else {
            System.out.println("Такого клиента нет");
        }
    }
    public Pet getClientsPet(Client client){
        return client.getPet();
    }
    public void changeClientsPet(Client client,Pet pet){
        clients.remove(client);
        client.setPet(pet);
        clients.add(client);
    }
    public void showAll(){
        for(Client client : clients){
            System.out.println(client);
        }
    }
}
