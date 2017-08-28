package SecondClinic;

import FirstClinic.Client;
import FirstClinic.Clinic;
import FirstClinic.ConsoleHelper;
import FirstClinic.animals.Cat;
import FirstClinic.animals.Dog;
import FirstClinic.animals.Pet;
import FirstClinic.exceptions.AlreadyContainsException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class AddServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        PrintWriter writer = response.getWriter();

        String name = request.getParameter("name");
        String petName = request.getParameter("petName");
        String petType = request.getParameter("petType");

        Pet pet = null;
        if(petType.equalsIgnoreCase("пес")){
            pet=new Dog(petName);
        }else if(petType.equalsIgnoreCase("кот")){
            pet = new Cat(petName);
        }
        Client client = new Client(name,pet);
        if(!Clinic.getClients().contains(client)){
            Clinic.getClients().add(client);
            writer.println("<h2>Клиент "+name+" и его "+petType+" по имени "+petName+" добавлен!</h2>");

        }else{
            writer.println("<h2>Такой уже есть!<h2>");
        }


        writer.println("<hr>");
        writer.println("<a href=\"StartPage.jsp\">На главную!</a>");
        writer.close();
    }
}
