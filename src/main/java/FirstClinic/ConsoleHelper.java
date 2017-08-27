package FirstClinic;

import FirstClinic.animals.Cat;
import FirstClinic.animals.Dog;
import FirstClinic.animals.Pet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleHelper {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static void printMessage(String message){
        System.out.println(message);
    }
    public static String readMessage(){
        String result="";
        try {
            result=reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
    public static Pet getPet(){
        ConsoleHelper.printMessage("Введите имя животного: ");
        String petName = ConsoleHelper.readMessage();
        ConsoleHelper.printMessage("Это пес или кот?");
        String petType = ConsoleHelper.readMessage();
        Pet pet = null;
        if(petType.equalsIgnoreCase("пес")){
           pet=new Dog(petName);
        }else if(petType.equalsIgnoreCase("кот")){
           pet = new Cat(petName);
        }
        return pet;
    }

}
