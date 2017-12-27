package app.servlets;

import javax.servlet.http.HttpServlet;
import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UploadServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException {
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/upload.jsp");
        try {
            requestDispatcher.forward(req, resp);
        }
        catch (IOException e){}
    }
}

