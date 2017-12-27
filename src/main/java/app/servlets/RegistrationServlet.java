package app.servlets;

import javax.servlet.http.HttpServlet;
import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import app.entities.User;
import app.model.Model;

public class RegistrationServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/registration.jsp");
        try {
            requestDispatcher.forward(req, resp);
        }
        catch (IOException e){}
    }
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter("login");
        String password = req.getParameter("password");
        User user = new User(login, password);
        Model model = Model.getInstance();
        model.add(user);
    }
}
