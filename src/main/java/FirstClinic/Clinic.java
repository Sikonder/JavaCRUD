package FirstClinic;

import FirstClinic.animals.Pet;
import FirstClinic.exceptions.AlreadyContainsException;
import FirstClinic.exceptions.NoSuchClientException;

import java.util.ArrayList;


public class Clinic {
    private ArrayList<Client> clients = new ArrayList<Client>();

    public void addClient(Client client) throws AlreadyContainsException {
        if(!clients.contains(client))
            clients.add(client);
        else
            throw new AlreadyContainsException("Такой уже есть");

    }
    public void removeClient(Client client) throws NoSuchClientException {
        if(clients.contains(client)){
             clients.remove(client);
        }else {
            throw new NoSuchClientException("Такого клиента нет");
        }
    }
    public Client getClientByName(String name){
        Client result = null;
        for(Client client:clients){
            if(client.getName()==name){
                result=client;
            }
        }
        return result;
    }

    public ArrayList<Client> getClients() {
        return clients;
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
    public int getNumberOfClients(){
        return clients.size();
    }
    public void removeAllClients(){
        clients.clear();
    }
}
