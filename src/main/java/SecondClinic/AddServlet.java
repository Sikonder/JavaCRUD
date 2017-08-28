package SecondClinic;

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


        String name = request.getParameter("name");
        String petName = request.getParameter("petName");
        String petType = request.getParameter("petType");
        PrintWriter writer = response.getWriter();
        writer.println("<h2>Клиент "+name+" и его "+petType+" по имени "+petName+" добавлен!</h2>");
        writer.println("<a href=\"StartPage.jsp\">На главную!</a>");
        writer.close();
    }
}
